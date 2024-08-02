import kotlin.math.abs
import kotlin.math.max

fun main () {
    pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1))
}

fun pickingNumbers(a: Array<Int>):Int {
    var maxLength = 0
    var count = 0
//    var countArray = 1

    for (i in 1 until a.size) {
        val current = a[i]
        val before = a[i-1]

        println("${current} - ${before} = ${abs(current - before) }")
        if(abs(current - before) <= 1) {
            maxLength++
        }
    }
    println(maxLength)

    return maxLength

}