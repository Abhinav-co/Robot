import java.util.Calendar.DAY_OF_WEEK

data class Coffe(var coffeType:String, var sugar:Int):Robot("abhi",DAY_OF_WEEK) {
    fun coffe(): Unit {
        println("your $coffeType coffe is ready with $sugar spoon sugar")
    }
}