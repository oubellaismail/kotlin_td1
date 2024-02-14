fun fib(n : Int) : Int {
    if (n == 0 || n == 1)
        return n
    return fib(n-1) + fib(n-2)
}

fun main(){
    val n : Int = 10
    print(fib(n))
}