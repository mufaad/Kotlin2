
    fun main(args :Array<String>){

        var myList = listOf<Int>(1, 5, 65, 25, 18, 78)

        var check1 = myList.all ({ x -> x > 10 }) // check all the value of the listOf is greater than 10
        println(check1)

        var check2 = myList.any({x -> x > 10}) // si any values are greater than 10
        println(check2)

        var check3 = myList.count({x -> x > 10}) //check how many values are greater than 10
        println(check3)

        var check4 = myList.find ({ x -> x > 10  }) // get the first value that is greater than 10 in the listOf
        println(check4)


    }  