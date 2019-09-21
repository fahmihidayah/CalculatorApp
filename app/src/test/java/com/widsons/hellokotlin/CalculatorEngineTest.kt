package com.widsons.hellokotlin

import org.junit.Assert.*
import org.junit.Test

/**
 * Created on : September/21/2019
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : HelloKotlin
 */
class CalculatorEngineTest {
    @Test
    fun testTambah() {
        var calculatorEngine : CalculatorEngine = CalculatorEngine(1.0, 2.0)
        assertEquals(3, calculatorEngine.tambah().toInt())
    }
}