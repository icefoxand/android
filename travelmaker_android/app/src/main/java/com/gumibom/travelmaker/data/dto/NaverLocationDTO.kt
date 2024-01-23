package com.gumibom.travelmaker.data.dto

import java.util.Date

data class NaverLocationDTO(
    val lastBuildDate : Date?,
    val total : Int?,
    val start : Int?,
    val display : Int?,
    val items : MutableList<AddressDTO>?
)
