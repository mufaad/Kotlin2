
    fun main(args:Array<String>){

        var user1 = Users("John", 10)
        var user2 = Users("John", 10)

            println(user1.toString())

            if(user1 == user2)
            {
                println("Equal")
            }else{
                println("Not Equal")
            }
        var newUser = user2.copy(name = "Sean", id = 12)
        println(newUser)
    }

   data class Users(var name: String, var id:Int){

    }