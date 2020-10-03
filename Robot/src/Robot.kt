open class Robot(var name:String,var dayWeek:Int) {
    fun alarm(){
        if(dayWeek==6 || dayWeek==7) {
            println("today is holiday .So, Sleep for 1 more hour")
            println("........1 hour later........")
            return
        }
        else {
            println("wake up it's 6:30")    //alarm on 6:30
            println("........after some minutes..............")
        }
    }
    fun water(temp:Int){
        println("\nwater temp is $temp , you can bath now")
    }
    fun ironCloths(){
        val clothListLower= mutableListOf("Jeans","Khaki pant","formal pants")
        val clothListUpper= mutableListOf("Shirt","Tshirt","Kurta")
        println("\nI have ironed your claths which you want to wear after bath i.e $clothListLower and $clothListUpper")
    }

}