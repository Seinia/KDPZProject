package com.example.kdpzproject.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CatLinks(
    val url: String?,
    val label: String,
    val active: Boolean
):Parcelable