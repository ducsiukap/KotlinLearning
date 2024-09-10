// smth with 'final' keyword cant be overriden
// all class in kotlin are final by default
// use 'open' to enable to inherite
open class Vehicle {
	protected var brand:String
	protected var name:String
	protected var id:String

	init{
		this.brand = "unknown"
		this.name = "unknown"
		this.id = "unknown"
	}

	// all function default by 'final'
	// add 'open' if you want to override
	open protected fun printInfor():Unit {
		println("--------------------")
		println("Type of vehicle: ${this::class.simpleName}")
		println("Brand : ${this.brand}")
		println("Name  : ${this.name}")
		println("ID    : ${this.id}")
	}
}

class MotoBike : Vehicle {
	private var cc:Int; // Cylinder Capacity
	constructor(_brand:String, _name:String, _id:String, _cc:Int) {
		this.brand = _brand
		this.name = _name
		this.id = _id
		this.cc = _cc
	}

	// overriden
	override public fun printInfor():Unit {
		super.printInfor()
		println("Cylinder Capacity: ${this.cc}cc")
	}
}

class Car : Vehicle {
	private var seats:Int; 
	constructor(_brand:String, _name:String, _id:String, _seats:Int) {
		this.brand = _brand
		this.name = _name
		this.id = _id
		this.seats = _seats
	}

	override public fun printInfor() {
		super.printInfor()
		println("Number of seats: ${this.seats}")
	}
}

fun main(args : Array<String>) {
	var mb = MotoBike("Honda", "Wave Alpha", "29V1-61XXX", 100)
	mb.printInfor()

	var car = Car("Mercedes", "GLC 300", "30K-9999", 4)
	car.printInfor()

	println("__________________")
	println("#codeby_ducsjukap\n")
}