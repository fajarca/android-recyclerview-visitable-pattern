package io.fajarca.project.visitablepattern.abstraction

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.fajarca.project.visitablepattern.factory.ItemTypeFactory

class BaseRecyclerViewAdapter(
    private val itemTypeFactory : ItemTypeFactory,
    private val items : ArrayList<BaseItemModel> = arrayListOf()
) : RecyclerView.Adapter<BaseViewHolder<BaseItemModel>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<BaseItemModel> {
        val view = inflateView(viewType, parent)
        return itemTypeFactory.createViewHolder(view, viewType) as BaseViewHolder<BaseItemModel>
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: BaseViewHolder<BaseItemModel>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type(itemTypeFactory)
    }
    private fun inflateView(viewType: Int, viewGroup:ViewGroup ) : View {
        return LayoutInflater.from(viewGroup.context).inflate(viewType,viewGroup, false)
    }

    fun addItems(items : List<BaseItemModel>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}