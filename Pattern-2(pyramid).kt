fun main() {
    print("Enter number of rows: ")
    val rows = readln().toInt()
    for (i in 1..rows) {
        for (j in 1..(rows - i)) {
            print("  ") // Print spaces
        }
        for (k in 1..(2 * i - 1)) {
            print("* ")
        }
        println()
    }
}
