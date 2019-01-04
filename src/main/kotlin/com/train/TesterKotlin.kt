package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var totalmany = scanner.nextInt()
    print("How many round-trip tickets:")
    var roundtrip = scanner.nextInt()

    val tm = TotalMoney(totalmany, roundtrip)
    tm.print()

}

class TotalMoney(var totalmany: Int, var roundtrip: Int) {
    val owt = 1000
    val rtp = 2000

    var total = (totalmany - roundtrip) * owt + roundtrip * rtp * 0.9
    var sum = total.toInt()
    fun print() {
        println(
            "Total tickets:$totalmany\n" +
                    "Round-trip:$roundtrip\n" +
                    "Total:" + sum
        )
    }
}