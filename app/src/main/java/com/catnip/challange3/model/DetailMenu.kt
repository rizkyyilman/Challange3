package com.catnip.challange3.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class DetailMenu(
    val id: String = UUID.randomUUID().toString(),
    val position: Int,
    val name: String,
    val price: Double,
    val imgUrl: String,
    val desc: String
) : Parcelable






