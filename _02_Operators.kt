fun main(args: Array<String>) {
    val a:Int = 3
    val b:Int = 5
    println("a = $a, b = $b")
    println()

//    Arithmetic operators:
    println("a + b = ${a + b}")
    println("a.plus(b) = ${a.plus(b)}")
    println()
    // +, -, *, /, %
    // plus(), minus(), times(), div(), mod()

//    Relational operators : >, >=, <, <=, ==, !=
    println("a == b: ${a == b}")
    println()

//    Assignment operators: =, +=, -=, *=, /=, %=
    // .arithmeticAssign() : plusAssign(), ....
    var c = a
    c += b
    println("c += b: $c")
    println()

//    unary operators: ++: inc(), --: dec()
    var d = a
    println("d.inc(): ${d.inc()}")
    println()

//    logical operators: &&, ||, !

//    bitwise operators: & - and(), | - or(), ~ - inv(), ^ - xor()
    // .shl(n) - a shl n, shr, ushr
    var e = a
    var f = b
    println("e & f: ${e.and(f)}") // 011 & 101 = 001
    println("e shl f: ${e.shl(f)}") // 011 shl 5 = 01100000 = 96
    println()
}