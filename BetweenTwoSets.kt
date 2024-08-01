fun main () {
    println("salve")
    println(getTotalX(arrayOf(2,4), arrayOf(16,32, 96)))
}


fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    var maxNumberInA: Int  = 0
    var minNumberInB: Int  = b[1]
    var count = 0 //contador de numeros validos

    //Pegar os maiores maiores valores desses numeros
    a.forEach {
        if (it > maxNumberInA) {
            maxNumberInA = it
        }
    }
    b.forEach {
        if (it < minNumberInB) {
            minNumberInB = it
        }
    }
    // Maiores numeros em a e b
    println(maxNumberInA)
    println(minNumberInB)

    /**
     * Filter pega todos os elementos que satifazem uma condiçao e nos returna uma lista com esses elementos
     */
    val validNumbers = (maxNumberInA .. minNumberInB).filter { x ->
       val conditionA =  a.all { x % it == 0 }
        val conditionB = b.all { it % x == 0 }
        println(conditionB)

        conditionA && conditionB
    }

    println(validNumbers)


    return validNumbers.size

}
