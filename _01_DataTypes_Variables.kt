fun main(args: Array<String>) {
    /* Primitive datatype:
    - Boolean: true/false
    - Byte: -128 -> 128
    - Character: 2bytes
    - Short: 2bytes
    - Int: 4bytes
    - Long: 8bytes
    - Float: 4 bytes
    - Double: 8byte
     */

    // creating a variable:
    // syntax: val/var variableName[:datatype] = value

    // var for mutable variable
    var iNumber1:Int = 3
    var iNumber2 = 4
    // val for constant variable
    val pi = 3.14f
    val myName:String = "Duc"
    val myAge:Int = 20
    // pi = 3 -> error: Val cannot be reassigned

    print("My name is ${myName}, im ${myAge}!")
}