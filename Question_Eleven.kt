import kotlin.system.exitProcess

fun max(array : Array<Int>) : Int{
    var max : Int = array[0]
    for(item in array) { max = if (item > max) item else max }
    return max
}

fun min(array : Array<Int>) : Int{
    var min : Int = array[0]
    for(item in array) { min = if (item < min) item else min }
    return min
}

fun main(){
    val array : Array<Int> = arrayOf(1, -4, 5, 4, 8, 3, 0)
    if(array.isEmpty()){
        print("Array is empty !")
        exitProcess(0)
    }
    val min = min(array)
    val max = max(array)
    print("${array.contentToString()} => [$min, $max]")
}