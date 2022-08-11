package com.example.week2_card_example

class Card(rank: String, suit: String, flip: Boolean = true) {

    var rank : String = rank
    var suit : String = suit
    var flip : Boolean = flip

    fun flip() {
        this.flip = this.flip != true
    }

    fun printDetails() {
        if (this.flip) {
            println("rank: ${this.rank}")
            println("suit: ${this.suit}")
        }
        else {
            println("----")
        }
    }
}