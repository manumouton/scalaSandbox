package programmingScala.currency

import java.text.NumberFormat
import java.util.Locale

/**
  * Created by mou on 07/07/2017.
  */
object CurrencyFormatter {

  def getNumberFomatter(language:String, currency: String): NumberFormat = {
    val numberFormat = NumberFormat.getCurrencyInstance(new Locale(language))
    numberFormat.setCurrency(java.util.Currency.getInstance(currency))
    numberFormat
  }

  def main(args: Array[String]): Unit = {
    val currency = "EUR"
    val amount = 12569.555526399

    val fr = "FR"
    val us = "USA"
    val china = "CHN"

    val frFormattedAmount = getNumberFomatter(fr, currency).format(amount)
    val usFormattedAmount = getNumberFomatter(us, currency).format(amount)
    val chineseFormattedAmount = getNumberFomatter(china, currency).format(amount)

    println("FR Formatted amount = " + frFormattedAmount)
    println("USA Formatted amount = " + usFormattedAmount)
    println("Chinese Formatted amount = " + chineseFormattedAmount)

    val roundedAmount = BigDecimal(amount).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

    println("Rounded decimal amount = " + roundedAmount)
  }

}
