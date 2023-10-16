//fun main (){
//    var teste = arrayOf(1,2,3,4)
//    divisibleSumPairs(teste)
//}
//
//fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
//    // Write your code here
//    var countPairs: Int = 0
//    for(i in 0 until ar.size) {
//        if(i<ar.size){
//            for(j in i+1 until ar.size){
//                var a = ar[i]
//                var b = ar[j]
//                if((a+b)%k == 0) {
//                    countPairs++
//                }
//            }
//        }
//    }
//    return countPairs
//}