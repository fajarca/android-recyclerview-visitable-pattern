package io.fajarca.project.visitablepattern.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.fajarca.project.visitablepattern.R
import io.fajarca.project.visitablepattern.abstraction.BaseViewHolder
import io.fajarca.project.visitablepattern.entity.TopProduct
import io.fajarca.project.visitablepattern.entity.TopProductData
import kotlinx.android.synthetic.main.item_top_product.view.*
import kotlinx.android.synthetic.main.item_top_products.view.*


class TopProductDataViewHolder(view: View): BaseViewHolder<TopProductData>(view) {
    private val tvTitle = view.tvProductCategory
    private val recyclerview = view.recyclerView
    private lateinit var adapter: TopProductAdapter

    companion object {
        const val LAYOUT = R.layout.item_top_products
    }

    override fun bind(item: TopProductData) {
        tvTitle.text = item.header
        adapter = TopProductAdapter(item.items)
        recyclerview.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.adapter = adapter
    }

    class TopProductAdapter(private val items: List<TopProduct>) : RecyclerView.Adapter<TopProductAdapter.TopProductViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopProductViewHolder {
            return TopProductViewHolder.create(parent)
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: TopProductViewHolder, position: Int) {
            holder.bind(items[position])
        }

        class TopProductViewHolder(view: View): RecyclerView.ViewHolder(view) {

            private val tvProductName = view.tvProductName
            private val tvProductPrice = view.tvProductPrice

            fun bind(topProduct: TopProduct) {
                tvProductName.text = topProduct.name
                tvProductPrice.text = topProduct.price
            }

            companion object {
                fun create(viewGroup: ViewGroup): TopProductViewHolder {
                    val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_top_product, viewGroup, false)
                    return TopProductViewHolder(view)
                }
            }

        }
    }

}