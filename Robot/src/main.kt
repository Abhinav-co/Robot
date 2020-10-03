import java.util.Calendar.DAY_OF_WEEK
import java.util.*;

fun main(){
    val robo=Robot("abhi", DAY_OF_WEEK)
    robo.alarm()    //on saturday and sunday alarm will not ring
    println("\nwhich Type of coffe will you perfer Black/white")
    val coffeType= readLine()
    println("how much spoon do you wanna take for sugar")
    val sugar=Integer.valueOf(readLine())
    val robo1= Coffe(coffeType.toString(),sugar)
    robo1.coffe()
    println("\nat what temperature you like for your bathing water.Please Enter in Celsis(INTEGER)")
    val temp=Integer.valueOf(readLine())
    robo.water(temp)
    robo.ironCloths()
    val robo3=Timetable()
    robo3.bag(DAY_OF_WEEK)
    val robo2=Food()
    robo2.breakfast()
    println("its getting late for your class you should go now")
    robo2.lunch()
    robo.ironCloths()

}