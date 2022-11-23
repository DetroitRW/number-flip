import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите число: ")
    var n = reader.nextInt()

    var r = 0

    while (n > 0 ) {
        r = r * 10 + n % 10
        n /= 10
    }

    print("Ваше число наоборот: $r")
}