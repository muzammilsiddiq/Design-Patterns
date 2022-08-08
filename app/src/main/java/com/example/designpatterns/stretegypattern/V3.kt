package com.example.designpatterns.stretegypattern

import android.util.Size

class V3 {

    /**
     * the object delegation approach would be better fit to handle this.
     */

    abstract class Duck(private val flyBehaviour: FlyBehaviour) {

        fun walking() {
            print("Duck is walking")
        }

        fun eating() {
            print("Duck is eating")
        }

        open fun fly() {
            flyBehaviour.fly()
        }

        abstract fun size(): Size
    }

    interface FlyBehaviour {
        fun fly()
    }

    class FlyWithWings : FlyBehaviour {
        override fun fly() {
            print("Flying with wings")
        }

    }

    class FlyNoWay : FlyBehaviour {
        override fun fly() {
            print("Can't fly")
        }
    }

    class Rubber : Duck(flyBehaviour = FlyNoWay()) {
        override fun size(): Size = Size(150, 150)

        override fun fly() {
            // do nothing
        }
    }

    class Mallard : Duck(flyBehaviour = FlyNoWay()) {
        override fun size(): Size = Size(350, 350)
    }

    class Marbled : Duck(flyBehaviour = FlyWithWings()) {
        override fun size() = Size(550, 550)
    }

}