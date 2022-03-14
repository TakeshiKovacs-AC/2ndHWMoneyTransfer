fun main() {
    val amount = 1_000_000
    val commPercentage = 0.0075
    val minCom = 3_500
//    val minSum = minCom / commPercentage
    val realComm = amount * commPercentage

//    val commission = if (amount > minSum.toInt()) amount * commPercentage else minCom
//    println("С вашего счёта будет списано ${amount + commission.toInt()} коп., " +
//            "из которых $amount коп. - сумма перевода, а ${commission.toInt()} коп. - сумма комиссии!")

    val commission = if ((realComm).toInt() > minCom) realComm.toInt() else minCom
    println("С вашего счёта будет списано ${amount + commission} коп., " +
            "из которых $amount коп. - сумма перевода, а $commission коп. - сумма комиссии!")


}

