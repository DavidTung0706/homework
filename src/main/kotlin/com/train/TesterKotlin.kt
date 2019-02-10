package com.train

import java.util.*
fun main() {

    val scanner = Scanner(System.`in`)
    var totalTicket = 0
    while (totalTicket!= -1) {
        print("Please enter number of tickets:")
        totalTicket = scanner.nextInt()
        if (totalTicket != -1) {
            print("How many round-trip tickets:")
            var roundtrip = scanner.nextInt()
            var tm = TotalMoney(totalTicket, roundtrip)
            tm.print()
        }else {
                System.out.println("結束訂票")
        }
    }
}

class TotalMoney(var totalTicket: Int, var roundtrip: Int) {
    val ticketsFare = 1000
    var total = (totalTicket - roundtrip) * ticketsFare + (roundtrip * ticketsFare * 2 * 0.9)
    var sum = total.toInt()
    fun print() {
        println(
            "Total tickets:$totalTicket\n" +
                    "Round-trip:$roundtrip\n" +
                    "Total:" + sum
        )
    }
}