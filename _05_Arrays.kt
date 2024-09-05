

fun main() {
//    Creating a array:
    /*
    - syntax1: var arrayName = arrayOf[<type>](mixed_type_value_list)
    - syntax2: var arrayName = Array(size) genMethod()
    - syntax3: var arrayName = typeArrayOf(value_list)
     */
//    val iArr = Array(5) {0L} // initialized with size
    val mixed = arrayOf("Duc", 20, 3.3)

//    Accessing:
    // using get(index) and set(index, newValue)
    mixed.set(2, "Anh") // {"Duc", 20, "Anh"}
    println("mixed.get(2): ${mixed.get(2)}")
    // Indexing: arr[index]

//    Traversal
    // using for loop
    print("for loop: ")
    for (item in mixed) print("$item ")
    // using range for loop: for (i in 0..mixed.size - 1) ...
    // for each: arr.forEach(method())
    print("\nforEach loop: ")
    mixed.forEach({item->print("$item ")})
}