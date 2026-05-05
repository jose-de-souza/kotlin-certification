package us.greatapps4you.us.greatapps4you.leetcode

class ReverseInteger {
    fun reverse(x: Int): Int {
        try {
            val reversed =
                if (x < 0) ("-${(x * -1).toString().reversed().toInt()}").toInt() else x.toString().reversed().toInt()
            return if (Int.MIN_VALUE <= reversed && reversed <= Int.MAX_VALUE - 1) reversed else 0
        } catch (e: Exception) {
            return 0
        }
    }
}