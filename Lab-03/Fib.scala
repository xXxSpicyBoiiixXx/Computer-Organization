package fib 

object Fib extends App {

def fib(arg: Int) : Int = {
	
}

if (args.size < 1) {
	System.err.println("Need Argument!")
	System.exit(1)
	}
	println(s"Fib of ${args(0)} is ${fib(args(0).toInt)}")
}
