package com.example.designpatterns.stretegypattern

import android.util.Size

class V2 {

    /**
     * Introduce interface to beautify the shit.
     */

    abstract class Duck {

        fun walking() {
            print("Duck is walking")
        }

        fun eating() {
            print("Duck is eating")
        }

        abstract fun size(): Size
    }

    interface Flyable {
        fun fly()
    }

    class Rubber : Duck() {

        override fun size(): Size = Size(150, 150)
    }

    class Mallard : Duck() {

        override fun size() = Size(100, 100)
    }

    class Marbled : Duck(), Flyable {

        override fun size() = Size(150, 150)

        override fun fly() {
            print("Duck is flying")
        }
    }

    class Lesser : Duck() {

        override fun size() = Size(150, 150)
    }


    /**
     * So now there is another problem, everytime it requires to rewrite the flying mechanism that
     * would be redundant approach which could leads to inconsistencies and boilerplate code.
     * Check V3
     */

}