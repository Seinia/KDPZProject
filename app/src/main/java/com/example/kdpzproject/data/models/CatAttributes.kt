package com.example.kdpzproject.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CatAttributes(
    val fact: String,
    val length: Int
):Parcelable