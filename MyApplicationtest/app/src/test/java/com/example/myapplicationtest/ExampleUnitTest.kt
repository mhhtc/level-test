package com.example.myapplicationtest

import com.example.myapplicationtest.utils.getWordFromString
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun getWordFromString_returnLongestWord() {
        val result = getWordFromString("Frase de ejemplo para localizar la palabra más larga")
        assertEquals("localizar", result)
    }

    @Test
    fun getWordFromString_emptyString() {
        val result = getWordFromString("")
        assertEquals("", result)
    }

    @Test
    fun getWordFromString_multipleEmptyString() {
        val result = getWordFromString("    ")
        assertEquals("", result)
    }

    @Test
    fun getWordFromString_singleWord() {
        val result = getWordFromString("texto")
        assertEquals("texto", result)
    }

    @Test
    fun getWordFromString_multipleWordsWithSameLength() {
        val result = getWordFromString("casa gato cosa")
        assertEquals("casa", result)
    }

}