package de.larshaider.yodo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import de.larshaider.yodo.darksouls.run.list.DarkSoulsRunListViewModel
import de.larshaider.yodo.darksouls.run.list.DarkSoulsRunListViewModelFactory
import de.larshaider.yodo.darksouls.run.save.DarkSoulsRunDatabase
import de.larshaider.yodo.darksouls.run.save.LocalDarkSoulsSavedRunRepository
import de.larshaider.yodo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var repository: LocalDarkSoulsSavedRunRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dao = DarkSoulsRunDatabase.getInstance(applicationContext).darkSoulsRunDao
        repository = LocalDarkSoulsSavedRunRepository(dao)

        val viewModelFactory = DarkSoulsRunListViewModelFactory(repository)
        val viewModel = ViewModelProvider(this, viewModelFactory)[DarkSoulsRunListViewModel::class.java]

        viewModel.runs.observe(this) {
            binding.runCount.text = it.size.toString()
        }

        viewModel.eventRunCreationResult.observe(this) { value ->
            value?.let { success ->
                val message = if (success) "Success" else "Failure"
                Snackbar.make(binding.root, message, Toast.LENGTH_SHORT).show()
                viewModel.onRunCreationResultEventProcessed()
            }
        }

        binding.createRun.setOnClickListener {
            viewModel.onCreateRun()
        }
    }
}