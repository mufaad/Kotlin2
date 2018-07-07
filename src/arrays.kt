
    fun  main(args:Array<String>){

        var myArray = Array<Int>(5) { 0 } // 0 is the default value of the array
        myArray[1] = 25
        myArray[3] = 65
        myArray[4] = 34



        println("One Data to display: "+myArray[1])

        for(item in myArray)
        {
            println(item)
        }
        println("print using a for loop")

        for(x in 0..myArray.size - 1)
        {
            println(myArray[x])
        }


        //ArrayList
        var myArrayList = ArrayList<String>()
        myArrayList.add("John")
        myArrayList.add(1, "Sean")
        myArrayList.add("Kane")

        myArrayList.remove("Kane")
    println("ArrayList")
        for(item in myArrayList)
        {
            println(item)
        }

        //arrayListOf
        var myarrayListOf = arrayListOf<String>()
        myarrayListOf.add("John")
        myarrayListOf.add(1, "Sean")
        myarrayListOf.add("Kane")

        myarrayListOf.remove("Kane")
        println("arrayListOf")
        for(item in myarrayListOf)
        {
            println(item)
        }

        //listOf
        var mylistOf = listOf<String>("John", "Sean", "Rock") // cannot add value with a function

        println("=====listOf")
        for(item in mylistOf)
        {
            println(item)
        }
        //mutableListOf
        var mymutableListOf = mutableListOf<String>()
        mymutableListOf.add("John")
        mymutableListOf.add(1, "Sean")
        mymutableListOf.add("Kane")

        mymutableListOf.remove("Kane")
        println("=====mutableListOf")
        for(item in mymutableListOf)
        {
            println(item)
        }
    }