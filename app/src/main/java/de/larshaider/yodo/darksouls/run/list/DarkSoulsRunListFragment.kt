package de.larshaider.yodo.darksouls.run.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import de.larshaider.yodo.darksouls.run.database.DarkSoulsRunDatabase
import de.larshaider.yodo.darksouls.run.repository.LocalDarkSoulsSavedRunRepository
import de.larshaider.yodo.databinding.FragmentDarkSoulsRunListBinding

class DarkSoulsRunListFragment : Fragment() {

    // fragments outlive their views, therefore we need to clear the reference to the binding
    // this means for s specific time, the binding is null
    private var _binding: FragmentDarkSoulsRunListBinding? = null

    // can safely be used only between onCreateView and onDestroyView
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDarkSoulsRunListBinding.inflate(inflater, container, false)

        val database = DarkSoulsRunDatabase.getInstance(requireContext()).darkSoulsRunDao
        val repository = LocalDarkSoulsSavedRunRepository(database)
        val viewModelFactory = DarkSoulsRunListViewModelFactory(repository)
        val viewModel = ViewModelProvider(this, viewModelFactory)[DarkSoulsRunListViewModel::class.java]

        val adapter = DarkSoulsRunAdapter()
        binding.darkSoulsRunList.adapter = adapter

        viewModel.runs.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        viewModel.noSavedRuns.observe(viewLifecycleOwner) {
            binding.noContentInfo.visibility = if (it) View.VISIBLE else View.GONE
        }

        viewModel.eventRunCreationResult.observe(viewLifecycleOwner) {
            if (it == null) {
                return@observe
            }

            val message = if (it) "Success" else "Failure"
            Snackbar.make(binding.root, message, Toast.LENGTH_SHORT).show()
            viewModel.onRunCreationResultEventProcessed()
        }

        viewModel.eventRunDeletionResult.observe(viewLifecycleOwner) {
            if (it == null) {
                return@observe
            }

            val message = if (it) "Success" else "Failure"
            Snackbar.make(binding.root, message, Toast.LENGTH_SHORT).show()
            viewModel.onRunDeletionResultEventProcessed()
        }

        binding.deleteDarkSoulsRuns.setOnClickListener {
            viewModel.onClearRuns()
        }

        binding.createDarkSoulsRun.setOnClickListener {
            viewModel.onCreateRun()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}