package io.fajarca.project.visitablepattern.viewholder

import android.view.View
import io.fajarca.project.visitablepattern.R
import io.fajarca.project.visitablepattern.abstraction.BaseViewHolder
import io.fajarca.project.visitablepattern.entity.AdBanner
import kotlinx.android.synthetic.main.item_ad_banner.view.*

class AdBannerViewHolder(view: View): BaseViewHolder<AdBanner>(view) {
    private val txtTitle = view.tvTitle
    private val txtSubTitle = view.tvSubtitle

    override fun bind(item: AdBanner) {
        txtTitle.text = item.title
        txtSubTitle.text = item.subtitle
    }

    companion object {
        const val LAYOUT = R.layout.item_ad_banner
    }

}