class Singleton3 {
}

class A3{
    init {
        println("Class init method.")
    }
 object SingletonA{
     init {
         println("SingletonA class invoked.")
     }
     var name = "Kotlin Objects A"
     fun printName()
     {
         println(name)
     }
 }
    companion object SingletonB{
        init {
            println("SingletonB class invoked.")
        }
        var name = "Kotlin Objects B"

        fun printName()
        {
            println(name)
        }

    }
}


fun main() {
    var a=A3()
    var a1=A3.name
    A3.name="Kotlin Tutorials"
    A3.printName()
}