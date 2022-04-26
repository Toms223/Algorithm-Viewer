import pt.isel.canvas.*

fun main(args: Array<String>) {
    val array = arrayOf(150,30,80,60,70,50,200,40)
    insertionSort(array, 0, array.size-1)
    for(i in  array){
        print("$i ")
    }
}