package io.fajarca.project.visitablepattern.entity

import io.fajarca.project.visitablepattern.abstraction.BaseItemModel
import io.fajarca.project.visitablepattern.factory.ItemTypeFactory

data class AdBanner(val title : String, val subtitle : String) : BaseItemModel() {
    override fun type(itemTypeFactory: ItemTypeFactory): Int {
        return itemTypeFactory.type(this)
    }

}