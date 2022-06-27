
// Inheritance
// Overriding

fun main() {
    val parents = Parents()
    parents.doing()
    parents.disease()
    val child = Child()
    child.disease()

}

open class Parents() {

    init {
        println("this is Parents")
    }

    open fun doing() {
        println("care to child")
    }
    open fun disease() {
        println("disease")
    }
}

class Child() : Parents() {

   init {
       println("this is Child")
   }

    override fun disease() {
        super.disease()
        println("and child")
    }
}