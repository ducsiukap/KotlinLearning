/* primary constructor with init{} block 
- syntax:
class className [access modifier of constructor] constructor(args) {
	init{
		// constructor body
	}
}
// the block of code inside init{} wherever an object of class is created
- a class can have more than one init{} block
*/
class classRoom1 constructor(_ID:String, _teacher:String, _numberOfStudent:Int) {
	var ID:String
	var teacher: String
	var numberOfStudent:Int
	init{
		this.ID = _ID
		this.teacher = _teacher
		this.numberOfStudent = _numberOfStudent
	}

	fun printClassInfor() {
		println("class name: ${this.ID}")
		println("class teacher: ${this.teacher}")
		println("number of student : ${this.numberOfStudent}")
	}
}

/* secondary constructor
class className{
	constructor(args) {
	// body
	}
}
*/
class classRoom2 {
	var ID:String
	var teacher:String
	var numberOfStudent:Int
	constructor(_ID:String, _teacher:String, _numberOfStudent:Int) {
		this.ID = _ID
		this.teacher = _teacher
		this.numberOfStudent = _numberOfStudent
	}
	fun printClassInfor() {
		println("class name: ${this.ID}")
		println("class teacher: ${this.teacher}")
		println("number of student : ${this.numberOfStudent}")
	}
}

fun main(args : Array<String>) {
	val obj1 = classRoom1("12A4", "Hoang Tuan Anh", 40)
	obj1.printClassInfor()

	print()
	val obj2 = classRoom2("12A1", "Tran Thi Thu Hang", 39)
	obj2.printClassInfor()
}