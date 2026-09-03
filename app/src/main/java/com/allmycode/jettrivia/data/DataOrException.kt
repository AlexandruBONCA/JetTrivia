package com.allmycode.jettrivia.data

data class DataOrException<T, Boolean, E: Exception>(
    var dataField: T? = null,
    var loading: Boolean? = null,
    var e: E? = null
)