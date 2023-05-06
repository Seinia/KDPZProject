package com.example.kdpzproject.presentation.models

import android.view.View
import com.example.kdpzproject.R
import com.example.kdpzproject.data.models.CatAttributes
import com.example.kdpzproject.databinding.ItemAnimeBinding
import com.xwray.groupie.viewbinding.BindableItem

class FirstCatDataSet(val cat: CatAttributes): BindableItem<ItemAnimeBinding>() {
    override fun bind(viewBinding: ItemAnimeBinding, position: Int) {

        viewBinding.tvnamecat.text = cat.fact
        viewBinding.tvdesccat.text = cat.length.toString()
    }


    override fun getLayout(): Int {
        return R.layout.item_anime
    }

    override fun initializeViewBinding(view: View): ItemAnimeBinding {
        return ItemAnimeBinding.bind(view)
    }
}