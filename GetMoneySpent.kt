fun main () {
    var array1 = arrayOf(5,1,1)
    var array2 = arrayOf(4)
    var input = 5
    getMoneySpent(array1,array2,input)
}

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>,b : Int): Int {
    /*
     * Write your code here.
     */
    var expensive: Int = -1

    for (x in keyboards) {
        for (y in drives){
            if( (x+y <= b) && (x+y > expensive)  ){
                expensive = x+y
            }
        }
    }
    return expensive


}