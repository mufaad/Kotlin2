
    fun main(args: Array<String>){
        //setof will remove all duplicate value (Only unique values)
        var setof = setOf<Int>(1, 2, 3, 3, 3, 3, 4, 6, 10)

        for(item in setof)
        {
            println(item)
        }

        println()
        println("==========mutablesetOf=========")
        println()

        var msetof = mutableSetOf<Int>()
        msetof.add(1)
        msetof.add(2)
        msetof.add(65)
        for(item in msetof)
        {
            println(item)
        }

        println()
        println("==========hashsetOf=========")
        println()

        var hsetof = hashSetOf<Int>() //this will display without a order..no guarantee for the order
        hsetof.add(1)
        hsetof.add(2)
        hsetof.add(65)
        for(item in hsetof)
        {
            println(item)
        }
    }