abstract class AnimalClass{ //Abstract class is a class with abstract keyword, it is an incomplete class
    abstract fun eat()
    abstract fun whatAmI()
    fun drink(){
        println("I ONLY DRINK WATER!!!")
    }
}
abstract class Mammal2{

}
class Sheep:AnimalClass(){//, Mammal{ //Multiple inheritance is not possible
    override fun whatAmI() {
        println("I am an innocent Sheep")
    }
    override fun eat(){
        println("I eat grass, and a lot of grasses.")
    }

}
class Tiger:AnimalClass(){
    override fun whatAmI() {
        println("I am a fearless TIGER.")
    }
    override fun eat(){
        println("Sorry!!!!!!!!! I eat only meat.")
    }

}

fun main() {

    var sheep = Sheep()
    sheep.whatAmI()
    sheep.eat()
    sheep.drink()
    println(" ")
    var tiger = Tiger()
    tiger.whatAmI()
    tiger.eat()
    tiger.drink()
}
// Abstract methods
//      => methods with no body
//      => methods with abstract keyword
//      => Partially implement classes
//      => They have to be derived
//      => They cannot create instance


//Concrete methods => methods with proper implementation
//      When we want to reuse as it is, dont want to redefine or change


//Normal regular classes are Final [Not accessible]
