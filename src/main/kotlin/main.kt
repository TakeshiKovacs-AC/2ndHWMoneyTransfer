fun main() {
    val amount = 500_000
    val commPercentage = 0.0075
    val minCom = 3_500
    val minSum = minCom / commPercentage

    val commission = if (amount > minSum.toInt()) amount * commPercentage else minCom
    println("С вашего счёта будет списано ${amount + commission.toInt()} коп., " +
            "из которых $amount коп. - сумма перевода, а ${commission.toInt()} коп. - сумма комиссии!")
}

