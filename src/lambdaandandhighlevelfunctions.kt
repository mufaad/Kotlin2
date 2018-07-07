
    fun main(args:Array<String>){

        var program = myProgram()

        program.getTotal(10, 5)

        program.getTotal(10, 20, object: myInterface{
            override fun executeAll(sum:Int) {

                println(sum)

            }

        })

     //   var myLambda: (Int) -> Unit = { s: Int -> println(s)}

        //var myLambda: (Int, Int) -> Int = { u: Int, s: Int -> u * s} //method 1
       // var newVal:Int = program.getTotal(25,35, myLambda) //method 1

        // var newVal:Int = program.getTotal(25, 35, { u: Int, s: Int -> u * s}) //method 2

      //  var newVal:Int = program.getTotal(15, 13){ u: Int, s: Int -> u * s} //method 3
       // println(newVal)

        //advance lambda
        var result:Int = 0
         program.getTotal(15, 133){ u: Int, s: Int -> result = u * s}
        println(result)

        //you can use "it" if you have one parameter in lambda
        program.getOneValue("One Parameter Value Lambda", {it.reversed()})
    }

    class myProgram{
        //fun getTotal(a:Int, b:Int, action: (Int) -> Int){
       /* fun getTotal(a:Int, b:Int, action: (Int, Int) -> Int):Int{
           // var sum:Int = a + b
            // return action(sum)
            return action(a, b)
        }*/

        //advance lambda it
        fun getOneValue(v:String, myFunc: (String)-> String){
            var str: String = myFunc(v)
            println(str)


        }
        //advance lambda
        fun getTotal(a:Int, b:Int, action: (Int, Int) -> Unit){
            action(a, b)
        }

        fun getTotal(a:Int, b:Int, action: myInterface){
            var sum:Int = a + b
            action.executeAll(sum)
        }

        fun getTotal(a:Int, b:Int){
            var sum:Int = a + b
            println(sum)
        }
    }

    interface myInterface{

        fun executeAll(sum: Int)

    }