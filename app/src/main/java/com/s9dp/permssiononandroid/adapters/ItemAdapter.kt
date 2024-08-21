package com.s9dp.permssiononandroid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.s9dp.permssiononandroid.models.Item

class ItemAdapter(
    private val onItemClicked: (itemNane: String, position: Int) -> Unit = { _, _ -> }
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private var items: MutableList<Item> = mutableListOf()

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemName: TextView = view.findViewById(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.itemName.text = item.name

        holder.itemView.setOnClickListener {
            onItemClicked(item.name, position)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    // Function to update the entire list
    private fun updateList(newItems: List<Item>) {
        val diffResult = DiffUtil.calculateDiff(ItemDiffCallback(items, newItems))
        items.clear()
        items.addAll(newItems)
        diffResult.dispatchUpdatesTo(this)
    }

    // Function to add an item
    fun addItem(item: Item) {
        val newList = items.toMutableList()
        newList.add(item)
        updateList(newList)
    }

    // Function to delete an item at a specific index
    fun deleteItem(index: Int) {
        if (index >= 0 && index < items.size) {
            val newList = items.toMutableList()
            newList.removeAt(index)
            updateList(newList)
        }
    }

    // Function to update an item at a specific index
    fun updateItem(index: Int, newName: String) {
        if (index >= 0 && index < items.size) {
            val newList = items.toMutableList()
            newList[index].name = newName
            updateList(newList)
        }
    }
}
