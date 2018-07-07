
interface myListeners{
    //interface dont have any constructors
    //by default interface is a abstract (variables, function)
    //you can use abstract functions and normal functions in a interface
    //using interfaces for temp users (ex: click events, touch event, dialog box, etc)
    // interface is not a class
    fun onClick()

    fun onTouch(){

    }
}

interface myInterfaceTwo{
    fun onClick(){
        println("Clicked")
    }
    fun onTouch(){
        println("Touched")
    }
}

class TestAll: myListeners, myInterfaceTwo{
    override fun onClick() {

        println("Override Click");
        super.onClick() // this will take the myInterfaceTwo onClick function
       }

    override fun onTouch() {
        println("Override touch")

        super<myInterfaceTwo>.onTouch() // onTouch from myInterfaceTwo interface
        super<myListeners>.onTouch() // onTouch from myListeners interface

      }

}