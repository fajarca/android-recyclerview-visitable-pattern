package io.fajarca.project.visitablepattern.abstraction

import io.fajarca.project.visitablepattern.factory.ItemTypeFactory

abstract class BaseItemModel {
    abstract fun type(itemTypeFactory: ItemTypeFactory) : Int
}