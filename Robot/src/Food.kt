import java.util.ArrayList
import java.util.Calendar.DAY_OF_WEEK
class Food:Robot("abhi", DAY_OF_WEEK) {
    fun breakfast(){
        var foodList= ArrayList<String>(5)
        val list= mutableListOf<String>("toast bread","milk and Bread","Aaloo paratha","Fruits","Puri & Sabji")
        foodList.addAll(list)
        println("\nyour breakfast is ready")
        println("you can now take ${foodList.random()}")
    }
    fun lunch(){
        var foodList= ArrayList<String>(5)
        val list= mutableListOf<String>("Daal,Rice,vegetables","Aaloo Paneer,Roti","Idli,Sambhar","Pasta")
        foodList.addAll(list)
        println("\nfor lunch ${foodList.random()} will be ready when you come for class")
    }
}