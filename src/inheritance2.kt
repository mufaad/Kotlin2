
fun main(args: Array<String>){

    var obj = dogs("Black", "Pug");

}

open class animals(var color:String){

    init {
        println("From Animals Init : ${color}")
    }
}

class dogs(color:String, var breed:String):animals(color){

    init {
        println("From Dog Init: $color and $breed")
    }


}