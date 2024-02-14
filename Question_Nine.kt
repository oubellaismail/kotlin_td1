fun removeOne(item : Int, list : List<Int>) : List<Int> {
    var found = false
    return list.filter{ 
        if(!found && it == item){
            found = true
            false
        }
        else {
            true
        }
     }
}

fun remove(item : Int, list : List<Int>) : List<Int> {
    return list.filter{it != item}
} 

fun main(){
    val num = 5
    val list = listOf(1, 3, 5, 8, 5, 4, 9, 5, 10, 5)
    val newList = removeOne(num, list)
    println("removeOne => ")
    println("$list => $newList")
    val secondList = remove(num, list)
    
    println("remove => ")
    print("$list => $secondList")

}