
    fun main(args:Array<String>){


    }
///while we are using abtract methods properties we need to override those in sub class(child class)
    abstract class mydataslection{

        abstract var color:Int

        abstract fun mylocation():Int
        abstract fun display()
    }

    class userdata:mydataslection(){
        override var color: Int = 10


        override fun mylocation(): Int {

            return 0
        }

        override fun display() {
            println("Display Something")
       }

    }