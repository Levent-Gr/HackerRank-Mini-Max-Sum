fun main(args: Array<String>) {

    miniMaxSum(arrayOf(1, 2, 3 ,4, 5))
}


fun miniMaxSum(arr: Array<Int>): Unit {

    var maxNumber = 0
    var minNumber = 0

    var sum = 0L

    for (number in arr){

        if(number<minNumber || minNumber==0){
            minNumber=number
        }
        if(number>maxNumber){
            maxNumber=number
        }

        sum+=number
    }


    val minSum = sum - maxNumber
    val maxSum = sum - minNumber

    println(minSum.toString() + " " + maxSum.toString())
}
