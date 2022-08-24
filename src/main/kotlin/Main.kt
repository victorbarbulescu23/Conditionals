import kotlin.random.Random

fun main() {
    var temp = Random.nextDouble(0.0, 105.0)

    //println("Please enter your temperature: ")
    //temp = readln()!!.toDouble() **Read in a value from the console**

    while (temp != 98.6) {
        temp = Random.nextDouble(0.0, 105.0)
        if (temp == 98.6) {
            println("Your temperature of $temp is PERFECT!")
        } else if (temp < 98.6) {
            println("Your temperature of $temp is TOO LOW")
        } else if (temp > 98.6 && temp < 100) {
            println("Your temperature of $temp may mean you have a little inflammation")
        } else {
            println("Your temperature of $temp means you are having of the COVID-19 SARS")
        }

    }
}