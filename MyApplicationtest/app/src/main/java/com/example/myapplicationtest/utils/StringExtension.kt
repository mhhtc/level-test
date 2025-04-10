package com.example.myapplicationtest.utils

fun getWordFromString(text: String): String {
    return text.split(" ").maxBy { it.length }
}