import java.util.*

open class Student
{
    open fun print()
    {
        println("I am a student...")
    }
}
class Soknoy: Student()
{
    override fun print()
    {
        super.print()
        println("This method is modified ")
    }
    fun whoAmI()
    {
        println("I am Soknoy")
    }
}
class Sokheng: Student()
{
    override fun print() {
        super.print()
        println("Programming is not fun")
    }
    fun whoAmI()
    {

        println("I am Sokheng")
    }
}
fun main()
{
    var sok = Student()
    sok.print()
    sok = Sokheng()
    sok.whoAmI()
    sok = Soknoy()
    sok.whoAmI()
//    sok = Sokheng()
//    sok.print()
////    var ch:Int = 0
//    var obj:Student
//    println("Enter 1 to create object for Sokheng, 2 for Soknoy")
//    ch = Scanner(System.`in`).nextInt()
//
//    if(ch == 1)
//    {
//        obj = Sokheng()
//    }
//    else if(ch == 2)
//    {
//        obj = Soknoy()
//    }

}