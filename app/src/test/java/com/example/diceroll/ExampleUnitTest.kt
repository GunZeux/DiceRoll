package com.example.diceroll

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest{
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val rollres = dice.roll()
        assertTrue("The value of roll result is not between 1 and 6", rollres in 1..6)
    }
}