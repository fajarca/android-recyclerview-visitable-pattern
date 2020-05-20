package io.fajarca.project.visitablepattern.entity

import io.fajarca.project.visitablepattern.abstraction.BaseItemModel
import io.fajarca.project.visitablepattern.factory.ItemTypeFactory

data class TopProductData(val header : String, val items : List<TopProduct>): BaseItemModel() {
    override fun type(itemTypeFactory: ItemTypeFactory): Int {
        return itemTypeFactory.type(this)
    }
}