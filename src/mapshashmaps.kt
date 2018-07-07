
    fun main(args: Array<String>){

        //mapOf
        var mymap = mapOf<Int, String>(0 to "John", 2 to "Sean", 5 to "Rock")

        for(key in mymap.keys)
        {
            println("Index ID: $key  Value: ${mymap[key]}")
        }

        //HashMap
        //all  those are same
        var hashmap = HashMap<Int, String>()
        //var hashmapof = hashMapOf<Int, String>()  //LinkedHashMap
        //var mutablemapof = mutableMapOf<Int, String>()



            hashmap.put(0, "John")
            hashmap.put(1, "Rock")
            hashmap.put(0, "Sean") // can replace as well as

        println()
        print("========HashMap==============")
        println()
        for(key in hashmap.keys)
        {
            println("Index ID: $key  Value: ${hashmap[key]}")
        }
    }