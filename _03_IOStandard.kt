import java.util.Scanner // to use Scanner Class

fun main() {
//    OUTPUT
    // print() : system.out.print()
    // println(): system.out.println()
    print("Hello world!\n") // println("Hello world!")

    // embedded expression into output string: "${expression}"
    val name = "ducsjukap!"
    println("Hello, $name")

//    INPUT
    // readLine(): BufferedReader.readLine()
    val buf = Scanner(System.`in`)
    print("enter smth: ")
    var inp = buf.nextLine()
    println("your entered: $inp")
}