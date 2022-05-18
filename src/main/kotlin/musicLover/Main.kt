package musicLover

fun main() {
    var regularCustomer: Boolean = true
    var purchaseAmount: Double = 10000.00

    var result = if (purchaseAmount <= 1000.00)
        if (!regularCustomer)
            purchaseAmount
        else
            purchaseAmount * 0.99
    else if (purchaseAmount > 1000.00 && purchaseAmount <= 10000)
        if (!regularCustomer)
            purchaseAmount - 100.00
        else
            (purchaseAmount - 100.00) * 0.99
    else
        if (!regularCustomer)
            purchaseAmount * 0.95
        else
            (purchaseAmount * 0.95) * 0.99

    println(result)

}