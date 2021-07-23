package fib 

object Fib extends App {

// F_0 = 0 
// F_1 = 1 
// F_n = F_n-1 + F_n-2 
def fib(arg: Int) : Int = {
	val F_0 = 0 
	val F_1 = 1 

// Finish off later 
	
}

if (args.size < 1) {
	System.err.println("Need Argument!")
	System.exit(1)
	}
	println(s"Fib of ${args(0)} is ${fib(args(0).toInt)}")
}
