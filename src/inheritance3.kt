
fun main(args: Array<String>){

    var obj = dog3("White", "Pug")
}


open class animal3{
    var color:String = ""
    constructor(color:String){
        this.color = color
        println("From Animal3: $color")
    }
}

class dog3:animal3{

    var breed:String = ""

    constructor(color: String, breed: String):super(color){
        this.breed = breed
        println("From Dog: $color AND $breed")
    }
}