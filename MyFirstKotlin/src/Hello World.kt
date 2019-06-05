import com.sun.jdi.connect.Connector
import java.awt.SystemTray
import java.nio.file.StandardOpenOption
import java.util.*

//fun main(args:Array<String>)
//{
//    println("Hello World...!!!")
//    add()
//    sub(100,9)
//    println(mul())
//    println(div(4,2))
//}
//fun add()
//{
//    var a = 10
//    var b = 3
//    var res = a + b
//    println("Sum = $res")
//}
//fun sub(a:Int, b:Int)
//{
//    var res = a - b
//    println("Difference = $res")
//}
//fun mul():Int
//{
//    var a = 9
//    var b = 5
//    return a*b
//}
//fun div(a:Int, b:Int):Int
//{
//    return a/b
//}

////When create a global var, it must be initialized no matter what
//var gloStr: String = ""
//var gloInt: Int = 0
//var gloFloat: Float = 0.0f
//
//fun main(args: Array<String>)
//{
//    var x  = 100   //Variable
//            x = 300
//    //x = "Section C" Can't be assigned string be we initialized it with integer
//        x = 400
//    val y = 100 //Constant
//     //   y =1000 value con not be changed
//    //Type inference is when we assign some value to a variable
//    var z : Int
//    //print(z) when create variable must initialize it first before using it
//
//
//}

//var g: String? = null
//fun main(makra: Array<String>)
//{
//    getStr(g)
//}
//fun getStr(str: String?)
//{
//    println("Welcome $str")
//    println(str?.length)
//
//}
//import java.util.*
////Type Conversion
//fun main(args: Array<String>)
//{
//    val s  = Scanner(System.`in`)
//
//    var intVar: Int
//    var longVar: Long
//
//    intVar = 100;
//    longVar = intVar.toLong()
//    println(longVar)
//
//    longVar = 1000
//    intVar = longVar.toInt()
//    println(intVar)
//
//    var byteVar: Byte = longVar.toByte()
//    println(byteVar)
//}

//import java.util.*
//import kotlin.math.max

//fun main() {
//    val s = Scanner(System.`in`)
//
//    var name: String
//    var age: Int
//    println("Enter name and age...")
//    print("Name: ")
//    name = s.nextLine()
//    print("Age: ")
//    age = s. nextInt()
//    println("Welcome back, Mr $name and you are $age now.")
//}
//
//fun main(args: Array<String>) {
//    var scan = Scanner(System.`in`)
//    var num1: Int = scan.nextInt()
//    var num2: Int = scan.nextInt()
//    var num3: Int = scan.nextInt()
//    if (num1>num2)
//    {
//        print("num1 is bigger")
//    }
//    else
//    {
//        print("num2 is bigger")
//    }
//    var res: Int = if (num1>num2)
//    {
//        print("num1 is bigger")
//        num1
//        65
//    }
//    else
//    {
//        print("num2 is bigger")
//        num2
//    }
//    print(res)

//    var res = if (num1 > num2) {
//        var max = if (num1 > num3)
//        {
//            num1
//        }
//        else {
//            num3
//        }
//        "Maximum Value is $max"
//    } else {
//        var max = if (num2 > num3) {
//            num2
//        } else {
//            num3
//        }
//        "Maximum Value is $max"
//    }
//        println(res)
//    }
//}