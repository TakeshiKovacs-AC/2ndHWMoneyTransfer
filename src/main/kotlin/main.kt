fun main() {
    val amount = 466_900
    val commPercentage = 0.0075
    val minCom = 3_500
    val minSum = minCom / commPercentage
    println(minSum)

    val commission = if (amount > minSum.toInt()) amount * commPercentage else minCom
    println(commission.toInt())
}

