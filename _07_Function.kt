/* syntax to define a function(method):
fun functionName([parameterList]):returnType {
    // body
}
 */
fun helloWorld(mess:String) {
    println("Hello world! :))")
}

fun add(a:Int = 0, b:Int = 0):Int { // default arguments
    return a + b
}

fun arguments(a:Int, b:Int, c:Int, f:(Int, Int)->Int) {
    println(a + f(b, c))
}

fun main(args: Array<String>) {
    helloWorld("print()")
    println(add(3)) // add (3, 0)
    // named arguments:
    println(add(b = 5, a = 2)) // add(2, 5)


    // Lambdas expression
    /* syntax:
    var lambdaName = {args:type -> body}
    var lambdaName:(argsType)->returnType = {args -> body}
    */
    var mul = {a:Int, b:Int -> a * b}
    // var mul:(Int, Int)->Int = {a, b -> a * b}
    println(mul(4, 5))

    // Anonymous function : noname function
    // syntax:
    var anonymousFunc = fun(s:String) = println("Hello $s")
    anonymousFunc("vduczz")
    // var funcName = fun(args):returnType {multiple line}
    var anonymousFunc2 = fun(a:Int, b:Int, c:Int):Boolean { return (a + b) == c}
    println(anonymousFunc2(1, 2, 3))


    // Higher order function
    /* a func is an argument of other
    - initialize: 
        fun func(args, func1:(argsType)->returnType)
    - call:
        func(args, ::func1Name)
    */
    arguments(1, 2, 3, ::add)
    /*
    a function is return of other:
        return ::func
    */
}