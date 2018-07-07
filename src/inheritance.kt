
    fun main(args: Array<String>){

        var catobj = cat()
        catobj.age = 10
        catobj.color = "Black"
        catobj.meow()
        catobj.eat()
        println("Cat Color Is: ${catobj.color}")

        var dogobj = dog()
        dogobj.breed = "Labra"
        dogobj.bark()
        dogobj.eat()
        println("Dog color is : ${dogobj.color}")




    }

    open class animal{

        open var color:String = "White"

        open fun eat(){
            println("Animal Is Eating")
        }
    }

    class dog:animal(){

        var breed:String = ""

        //varibale override
        override var color: String = "Brown"

        fun bark(){
            println("Dog Barking")
        }

        //override method

        override fun eat(){
            //super to get the super class data
            super<animal>.eat()
            println("Dog Is Eating");
        }
    }

    class cat:animal(){
        var age:Int = 0

        fun meow(){
            println("Cat says Meow")
        }
    }