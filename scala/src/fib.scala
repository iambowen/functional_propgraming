// https://en.wikipedia.org/wiki/Fibonacci_number


def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n :Int , result :Int, interim : Int): Int = {
        if (n == 2 || n == 1) result
        else {
            go(n - 1, result + interim, result)
        }
    }

  go(n, 1, 1)
}