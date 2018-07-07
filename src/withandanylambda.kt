
    fun main(args: Array<String>){

        var person = NewPerson()

        //using with u can access the variable to update value
        with(person){
            name = "John"
            age = 15
        }

        //using this app lambda u can run a method also
        person.apply {

            name = "Sean"
            age = 18
        }.runSoftware()

        println(person.name)
        println(person.age)

    }

    class NewPerson{
        var name: String = ""
        var age: Int = 0

        fun runSoftware(){
            println("Ready to run the application")
        }
    }