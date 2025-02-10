package com.example.myapplicationtest.core.navigation

import kotlinx.serialization.Serializable


@Serializable
object Main

@Serializable
data class Detail(val message: String)
