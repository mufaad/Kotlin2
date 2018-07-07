
    fun main(args: Array<String>){

        //by using object u can use the properties without create an object (ex: var obj = className())
        println(myfirstObject.number)
        myfirstObject.displayNumber()
    }


    object myfirstObject{

        var number:Int = 10

        fun displayNumber(){

            println("with the function")
        }
    }