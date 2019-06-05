//For multiple inheritance
//Use as instruction, you have to implement the methods by yourself
//Cannot create object for interface
interface Inter1{
    fun test1() //if it doesn't have body it is abstract method by default

}

interface Inter2{
    fun test2()
}

interface Inter3{
    fun test3()
}

class MyClass:Inter1, Inter2, Inter3
{
    override fun test1() {
        println("Implement Test1")
    }

    override fun test2() {
        println("Implement Test2")
    }

    override fun test3() {
        println("Implement Test3")
    }
}

fun main() {
    var stud = MyClass()
    stud.test1()
    stud.test2()
    stud.test3()

}