import java.util.*

fun main() {
//    for(i in 1..10)
//    {
//        println(i)
//        if(i==5) {
//            println("I'm breaking the freaking loop")
//            break
//        }
//    }
//    for(i in 100 downTo 1 step 5)
//    {
//        println(i)
//    }

//   parent@ for(j in 1..10){
//        child@ for(i in 1..10){
//            println(i)
//            if(i==5){
//                break@parent
//            }
//
//        }
//    }

    outer@ for (j in 1..10){
        inner@ for(i in 1..50){
            if(i==35){
                println("Breaking The Loop...")
                break@outer
            }else if(i%2==0){
                continue@inner
            }
            println(i)
        }
        println("****Outer Loop***")
    }
//    var st = StudentTest()
//    st.test(name="Dane")
//    st.test(43)
//    st.test(40,"Daro",75 )
//    st.test(35,"Gigihadid",90)
//
//    st.test(name = "Vignesh",age = 16)
//
//}
//class StudentTest
//{
//    fun test(id:Int=100, name:String="Sreysa", age:Int=123)
//    {
//        println("ID: $id")
//        println("NAME: $name")
//        println("AGE: $age")
//    }

}