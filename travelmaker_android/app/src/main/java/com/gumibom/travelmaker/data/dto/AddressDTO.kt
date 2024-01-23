package com.gumibom.travelmaker.data.dto

import com.google.gson.annotations.SerializedName

data class AddressDTO(
    val title : String,
    val link : String,
    val category : String,
    val description : String,
    val telephone : String,
    val address : String,
    val roadAddress : String,
    @SerializedName("mapx")
    val mapX : Int,
    @SerializedName("mapY")
    val mapY : Int
)
