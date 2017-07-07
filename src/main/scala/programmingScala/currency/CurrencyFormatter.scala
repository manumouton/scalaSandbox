package programmingScala.currency

/**
  * Created by mou on 07/07/2017.
  */
object CurrencyFormatter {

  def main(args: Array[String]): Unit = {
    val currency = "EUR"
    val amount = 12569.555526399

    val numberFormat = java.text.NumberFormat.getCurrencyInstance()
    numberFormat.setCurrency(java.util.Currency.getInstance(currency))

    println("Formatted amount = " + numberFormat.format(amount))

    val roundedAmount = BigDecimal(amount).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

    println("Rounded decimal amount = " + roundedAmount)
  }

}
