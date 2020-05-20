package io.fajarca.project.visitablepattern.abstraction

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<in T>(view : View) : RecyclerView.ViewHolder(view){
    abstract fun bind(item : T)
}