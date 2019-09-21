package com.widsons.hellokotlin

/**
 * Created on : September/21/2019
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : HelloKotlin
 */
class CalculatorEngine(var nilaiPertama : Double = 0.0, var nilaiKedua : Double = 0.0) {

    fun tambah() = nilaiPertama + nilaiKedua
}