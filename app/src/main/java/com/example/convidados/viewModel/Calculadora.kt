package com.example.convidados.viewModel


public class Calculadora{

    public fun somar (num1: Double, num2: Double): Double {
        val r = num1 + num2
        return r
    }
    public fun subtrair (num1: Double, num2: Double): Double{
        val r = num1 - num2
        return r
    }
    public fun multiplicar (num1: Double, num2: Double): Double{
        val r = num1 * num2
        return r
    }

    public fun dividir (num1: Double, num2: Double): Double{
        val r = num1 / num2
        return r
    }
}