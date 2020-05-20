package io.fajarca.project.visitablepattern.factory

import android.view.View
import io.fajarca.project.visitablepattern.abstraction.BaseViewHolder
import io.fajarca.project.visitablepattern.entity.AdBanner
import io.fajarca.project.visitablepattern.entity.TopProduct
import io.fajarca.project.visitablepattern.entity.TopProductData
import io.fajarca.project.visitablepattern.viewholder.AdBannerViewHolder
import io.fajarca.project.visitablepattern.viewholder.TopProductDataViewHolder
import java.lang.IllegalArgumentException

class ItemTypeFactoryImpl : ItemTypeFactory {
    override fun type(adBanner: AdBanner): Int {
        return AdBannerViewHolder.LAYOUT
    }

    override fun type(topProduct: TopProductData): Int {
        return TopProductDataViewHolder.LAYOUT
    }

    override fun createViewHolder(parent: View, type: Int): BaseViewHolder<*> {
        return when(type) {
            AdBannerViewHolder.LAYOUT -> AdBannerViewHolder(parent)
            TopProductDataViewHolder.LAYOUT -> TopProductDataViewHolder(parent)
            else -> throw IllegalArgumentException("Unknown type")
        }
    }
}