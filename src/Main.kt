fun main() {

    val array = arrayOf(
        arrayOf(1,2,3,4,5),
        arrayOf(6,7,8,9,90),
        arrayOf(23,34,45,56,76),
        arrayOf(34,54,23,34,45)
    )

    val k = 3

    for (num in array[k-1]){
        println(num)
    }
}