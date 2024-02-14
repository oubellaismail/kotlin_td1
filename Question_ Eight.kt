//! incorrect lines commented out

fun main() {
    // val array1 = Array<Int>() 
    val array2 = arrayOf() 
    val array3: Array<String> = arrayOf() 

    val array4 = arrayOf(1, 2, 3)
    println(array4[0]) 
    // print(array4[5]) 
    array4[0] = 4 
    
    val array5 = arrayOf(1, 2, 3)
    array5[0] = array5[1]
    // array5[0] = "six"
    // array5 += 5 // false
    // for item in array5 { println(item) } // false
}
