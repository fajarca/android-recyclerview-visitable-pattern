package io.fajarca.project.visitablepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import io.fajarca.project.visitablepattern.abstraction.BaseItemModel
import io.fajarca.project.visitablepattern.abstraction.BaseRecyclerViewAdapter
import io.fajarca.project.visitablepattern.entity.AdBanner
import io.fajarca.project.visitablepattern.entity.TopProduct
import io.fajarca.project.visitablepattern.entity.TopProductData
import io.fajarca.project.visitablepattern.factory.ItemTypeFactoryImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter by lazy { BaseRecyclerViewAdapter(ItemTypeFactoryImpl()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        populateAdBanners()
        populateTopProducts()
    }

    private fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun populateAdBanners() {
        val adBanners = listOf(
            AdBanner("Cashback 90%", "Tinggal 3 jam lagi!")
        )
        adapter.addItems(adBanners)
    }

    private fun populateTopProducts() {
        val topProducts = listOf(
            TopProductData("Handphone", listOf(
                TopProduct("Samsung Galaxy S20 Ultra", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000")
            )),
            TopProductData("Handphone", listOf(
                TopProduct("Samsung Galaxy S20 Ultra", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000"),
                TopProduct("Samsung Galaxy S20", "Rp. 10.000.000")
            ))

        )
        adapter.addItems(topProducts)
    }


}
