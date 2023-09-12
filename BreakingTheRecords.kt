fun main () {
    var scores = arrayOf(10)
    var result = breakingRecords(scores)
    println(result.joinToString(" "))}
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min: Int = scores[0]
    var max: Int = scores[0]
    var countMin: Int = 0
    var countMax: Int = 0

    for(x in scores) {
       println(x)
        if(x<min) {
            min = x
           countMin += 1
       }
        if (x>max) {
            max = x
            countMax +=1
        }
   }
    return listOf(countMax, countMin).toTypedArray()
}
