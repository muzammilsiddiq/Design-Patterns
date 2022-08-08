package com.example.designpatterns.stretegypattern

import android.util.Size

class V1 {
    abstract class Duck {

        fun walking() {
            print("Duck is walking")
        }

        fun eating() {
            print("Duck is eating")
        }

        open fun fly() {
            print("Duck is flying")
        }

        abstract fun size(): Size
    }

    class Rubber : Duck() {
        override fun size(): Size = Size(150, 150)

        override fun fly() {
            // do nothing
        }
    }

    class Mallard : Duck() {
        override fun size(): Size = Size(350, 350)
    }

    class Marbled : Duck() {
        override fun size() = Size(550, 550)
    }

    /**
        * Now, there is requirement to make the marbled duck flyable, lets add another method for flyable but wait
        * what rubber ducks can't fly :( To handle this we will make the fly method body empty.
        * hmm, but that's not a good approach.
        * Check V2 to tackle this
    */
}