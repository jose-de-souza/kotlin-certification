package us.greatapps4you.app.algorithms

fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2 // Prevents integer overflow

        when {
            arr[mid] == target -> return mid       // Found it!
            arr[mid] < target -> left = mid + 1    // Target is in the right half
            else -> right = mid - 1                // Target is in the left half
        }
    }
    return -1 // Element not found
}