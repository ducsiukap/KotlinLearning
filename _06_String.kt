fun main() {
    // create a String
    val name= "Duc"
//    String template: embedded expresions into String using '$' prefix
    val age = 20
    val st = "my name is $name, im $age and i will be ${age + 1} next month!"
    println(st)

//    Raw String: multiple line String with """ """.trimMargin()
    val raw = """duc
        |ducsjukap
        |ahihi
        |this is 4th line
    """.trimMargin()
    println(raw)

//    value equality : x == y or x.equals(y)
//    referential equality: x === y // true if refer to the same location
}
