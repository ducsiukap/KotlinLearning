/* syntax to create a class:
class className [constructor(args)] {
	// properties
	// behavios
}

// [constructor(args)] if you want to provide a construct for it
*/
class myClass /*constructor(ival:Int, proVal:Int, interVal:Int, priVal:Int)*/ {
	/*
	* Access Modifiers: default by public
     * - public: erverywhere in the application
     * - protected: same class, subclass
     * - private: same class
     * - internal: within the package
     *              | public | protected | internal | private
     * same class   |  yes   |   yes     |   yes    | yes
     * ----------------------------------------------------
     * same package |  yes   |   yes     |   yes    | no
     * subclass     |        |           |          |
     * ----------------------------------------------------
     * same package |  yes   |    no     |   yes    | no
     * non-subclass |        |           |          |
     * ----------------------------------------------------
     * different    |        |           |          |
     * pagkage      |  yes   |   yes     |    no    | no
     * subclass     |        |           |          |
     * ----------------------------------------------------
     * different    |        |           |          |
     * pagkage      |  yes   |    no     |    no    | no
     * non-subclass |        |           |          | 
	*/
	public var pubVal:Int = 1;
	protected var proVal:Int = 2;
	internal var iVal:Int = 3;
	private var priVal:Int = 4;

	/* nested class:
	class outer {
		class nested {
			// cant access outer's properties
		}
	}	*/
	/* inner class
	class outer {
		inner class innerClass {
			// can access outer's properties
		}
	}
	// to call member of inner and nested class
	// we need to create a new obj of it
	*/
	inner class innerClass {
		fun printProtectedAndPrivateMember() {
			println("protected val: $proVal")
			println("private val: $priVal")
		}	
	}
}

fun main(args : Array<String>) {
	// creating object: var obj = className()
	var obj = myClass();
	println("public Var: ${obj.pubVal}")
	// println("protected var: ${obj.proVal}") // error: access protected member
	println("internal var: ${obj.iVal}")
	// println("private var: ${obj.priVal}") // error: access private member

	// call inner class member
	obj.innerClass().printProtectedAndPrivateMember();
}