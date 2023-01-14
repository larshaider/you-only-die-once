package de.larshaider.yodo.darksouls.run.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import de.larshaider.yodo.R
import de.larshaider.yodo.darksouls.run.data.DarkSoulsRun
import de.larshaider.yodo.databinding.ListItemDarkSoulsRunBinding

class DarkSoulsRunAdapter : ListAdapter<DarkSoulsRun, DarkSoulsRunViewHolder>(DarkSoulsRunDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DarkSoulsRunViewHolder {
        return DarkSoulsRunViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: DarkSoulsRunViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}

class DarkSoulsRunViewHolder private constructor(private val binding: ListItemDarkSoulsRunBinding) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): DarkSoulsRunViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val view = layoutInflater.inflate(R.layout.list_item_dark_souls_run, parent, false)
            val binding = ListItemDarkSoulsRunBinding.bind(view)
            return DarkSoulsRunViewHolder(binding)
        }
    }

    fun bind(item: DarkSoulsRun) {
        // TODO
    }
}

class DarkSoulsRunDiffCallback : DiffUtil.ItemCallback<DarkSoulsRun>() {

    override fun areItemsTheSame(oldItem: DarkSoulsRun, newItem: DarkSoulsRun): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: DarkSoulsRun, newItem: DarkSoulsRun): Boolean {
        return oldItem == newItem
    }
}