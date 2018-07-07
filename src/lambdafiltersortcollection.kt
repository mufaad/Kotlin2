
    fun main(args: Array<String>){

        var mylist: List<Int> = listOf<Int>(2, 6, 12, 5, 98, 65, 23, 89)
        var myFiltered: List<Int> = mylist.filter { it < 25 } //= { x -> x < 25 }

        for(item in myFiltered)
        {
            println(item)
        }
        println()
        println("================map==============")
        println()

        var usemap = mylist.map { it * it } //= { i -> i * i }
        for(item in usemap)
        {
            println(item)
        }

        println()
        println("================map and filter in same line==============")
        println()

        var mapandfilter = mylist.filter { it < 25 }.map { it * it } //= { i -> i * i }
        for(item in mapandfilter)
        {
            println(item)
        }


        println()
        println("================map and filter in same line with a class==============")
        println()
        //filter and take the name of starting with S
        var allusers = listOf<newPersonIs>(newPersonIs("John", 10), newPersonIs("Sean", 13), newPersonIs("Snow", 12))
        var getWithMap = allusers.filter { x -> x.name.startsWith('S') }.map { it.name }
        for (item in getWithMap)
        {
            println(item)
        }
    }


    class newPersonIs(var name: String, var age:Int){

    }
