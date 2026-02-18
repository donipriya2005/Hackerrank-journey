import java.util.Scanner
fun is_leap(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    if (scanner.hasNextInt()) {
        val year = scanner.nextInt()
        val result = is_leap(year).toString().replaceFirstChar { it.uppercase() }
        
        println(result)
    }
}
