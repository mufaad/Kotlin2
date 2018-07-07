class TestClass{

    fun testing(){

        var obj = student();

        //a cannot access
        //b cannot access (because this is not a sub class of student)
        //c can access
        //d can access
    }
}

open class student{

    private var a = 1
    protected var b = 2
    internal var c = 3
    var d = 4 //public by default
}

class classroom:student(){

    fun test(){
        //a cannot access
        //b can access (because of inherited class)
        //c can access
        //d can access
    }
}