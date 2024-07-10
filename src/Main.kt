fun main() {
    println("Hello Kotlin")

    //Visibility Modifiers
    //public: Access anywhere, by anyone (ALSO OUTSIDE THE MODULE)
    //private: Only for class itself (Outside the module also)
    //Protected: Only use within subclasses/child
    //internal: Everywhere (BUT NOT OUTSIDE THE MODULE)
}

//Use "open" so that other class can be inherited
open class MyDemo {
    public var a = "Public"
    private var b = "Private"
    protected var c = "Protected"
    internal var d = "Internal"

    //As you can see, within the class itself, you can use whatever
    fun test() {
        println(a)
        println(b)
        println(c)
        println(d)
    }
}

class MyClass : MyDemo() {
    fun test1() {
        println(a)
        //println(b) //=> Error. So that, "private" just allows us to access by the class itself, cannot be access outside, also inherited
        println(c)
        println(d)
    }
}

class MySecondClass {
    fun test1() {
        var obj = MyDemo()
        println(obj.a)
        //println(obj.b) //=> Error because outside class
        //println(obj.c) //=> Error. So, Protected only allows access if it is subclass/child.
        println(obj.d)
    }
}