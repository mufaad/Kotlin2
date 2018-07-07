
    fun main(args: Array<String>){

        var obj = myClass("My NAME", 15)

        println(obj.name)
        println(obj.id)

    }

    class myClass(var name1:String){

        var name: String = "no"
        var id:Int = 0
        init {
            this.name = name1

            println("Constructor value $name")
        }

        //secondry constructor
        constructor(n:String, id:Int):this(n){
            //secondry constructor will execute after the init (primary constructor )
            this.id = id
        }

    }