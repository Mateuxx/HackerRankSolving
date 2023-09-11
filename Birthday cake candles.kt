import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var tallest: Int
    var countTallest: Int =0

    tallest = candles[1]
    for (x in candles){
        if(x>tallest){
            tallest = x
        }
    }
    for(x in candles) {
        if(x == tallest){
            countTallest++
        }
    }
    return countTallest
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
