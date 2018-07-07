
    fun main(args:Array<String>){

            println(myNewObjectClass.count)
            myNewObjectClass.myFunction()
    }


    class myNewObjectClass{

        companion object {
            var count: Int = 12

            fun myFunction(){
                println("Function Printed Successfully");
            }
        }
    }