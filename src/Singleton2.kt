class A2{
    init {
        println("Class init method. singleton name property")
    }
    object Singleton
    {
        init {
            println("Singleton class invoked.")
        }
        var name = "Kotlin Objects"
        fun printName()
        {
            println(name)
        }

    }
}
fun main(){
    var a=A2()
}