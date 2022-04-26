fun exchange(a: Array<Int>, i: Int, j: Int){
    val x = a[i]
    a[i] = a[j]
    a[j] = x
}


fun bubbleSort(a: Array<Int>,l: Int, r: Int){
    for(i in l..r){
        for(j in r downTo i+1){
            if(a[j] < a[j-1]){
                exchange(a, j, j-1)
            }
        }
    }
}


fun insertionSort(a: Array<Int>, l: Int, r: Int){
    for (i in l..r){
        for(j in i downTo l+1){
            if(a[j] < a[j-1]){
                exchange(a, j, j-
                         1)
            }
        }
    }
}




fun selectionSort(a: Array<Int>, l: Int, r: Int){
    for (i in l..r){
        var smallest = i
        for(j in i+1..r){
            if(a[j] < a[smallest]){
                smallest = j
            }
        }
        exchange(a, smallest, i)
    }
}

