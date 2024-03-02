
// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    var catA: Int =  (z-x)
    var catB: Int = (z-y)

    println(catA)
    println(catB)

    if (catA<0){
        catA *= (-1)
    }

    if (catB<0){
        catB *= (-1)
    }

    if (catA==catB) {
        return "Mouse C"
    }
    else if ( catA < catB ){
        return "Cat A"
    }
    else{
        return "Cat B"
    }

}


fun main () {
    println( catAndMouse(1,3,2))
}
