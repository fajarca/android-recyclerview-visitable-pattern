package io.fajarca.project.visitablepattern.factory

import android.view.View
import io.fajarca.project.visitablepattern.abstraction.BaseViewHolder
import io.fajarca.project.visitablepattern.entity.AdBanner
import io.fajarca.project.visitablepattern.entity.TopProductData

interface ItemTypeFactory {
    fun type(adBanner: AdBanner) : Int
    fun type(topProduct: TopProductData) : Int

    fun createViewHolder(parent : View, type : Int) : BaseViewHolder<*>
}