package us.greatapps4you.app.algorithms

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    var swapped: Boolean

    for (i in 0 until n - 1) {
        swapped = false
        // The last i elements are already in place
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = true
            }
        }
        // If no two elements were swapped by inner loop, then break
        if (!swapped) break
    }
}