import java.util.Calendar.DAY_OF_WEEK
class Timetable :Robot("abhi",DAY_OF_WEEK) {
    fun bag(day:Int){                       //contain Timetable
        val mon= arrayListOf<String>("Phy","math","Python")
        val tue= arrayListOf<String>("Math","Digital electronics","C++")
        val wed= arrayListOf<String>("Python Lab","Phy","DiGital Electronics","C++ Lab")
        val thu= arrayListOf<String>("C++","Python","C++ Lab","math")
        val fri= arrayListOf<String>("C++","math","Python Lab","Digital Electronics")
        val weekDay= listOf(mon,tue,wed,thu,fri)
        if (day==6 || day==7){
            return              //holiday for sat and sun
        }
        else{
            for (i in weekDay){
                if((day-1)==weekDay.indexOf(i)){
                    print("\n")
                    println("your bag pack is ready. i have packed following books considering your Time table")
                    println(i)
                }
            }
        }
    }
}
