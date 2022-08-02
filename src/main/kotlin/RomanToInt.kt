package src.main.kotlin

fun main(args: Array<String>) {

    println("Write a roman number: ")

    var userNumber = readLine()

    println("Your roman number is $userNumber")

    if (userNumber != null) {
        println("Your numeric number is " + romanToInt(userNumber))
    }
}

fun romanToInt(userNumber: String): Int {
    var realNumber: Int = 0

    var userNumberToCharArray = userNumber.toCharArray()

    var romanNumberArray = arrayOf('I', 'V', 'X', 'L', 'C', 'D', 'M')

    var userRealNumberArray: Array<Int> = emptyArray()

    for (i in userNumberToCharArray.indices) {
        when (userNumberToCharArray[i]) {
            romanNumberArray[0] -> userRealNumberArray = userRealNumberArray.plus( 1)
            romanNumberArray[1] -> userRealNumberArray = userRealNumberArray.plus(5)
            romanNumberArray[2] -> userRealNumberArray = userRealNumberArray.plus(10)
            romanNumberArray[3] -> userRealNumberArray = userRealNumberArray.plus(50)
            romanNumberArray[4] -> userRealNumberArray = userRealNumberArray.plus(100)
            romanNumberArray[5] -> userRealNumberArray = userRealNumberArray.plus(500)
            romanNumberArray[6] -> userRealNumberArray = userRealNumberArray.plus(1000)
        }
    }

    for (i in 0 .. userRealNumberArray.size - 2) {
        if (userRealNumberArray[i] < userRealNumberArray[i + 1]) {
            userRealNumberArray[i] = 0 - userRealNumberArray[i]
        }
    }

    realNumber = userRealNumberArray.sum()

    return realNumber
}

