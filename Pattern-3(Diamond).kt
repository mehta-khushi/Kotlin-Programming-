fun main() {
    val n = 5

    // Upper half of the diamond
    for (i in 1..n) {
        for (j in 1..(n - i)) {
            print(" ") // Print spaces
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }

    // Lower half of the diamond
    for (i in (n - 1) downTo 1) {
        for (j in 1..(n - i)) {
            print(" ") // Print spaces
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}
