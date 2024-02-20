import internetshops.InternetShop
fun main() {
    try {
        var blok: Boolean = false
        println("Товароведу:")
        println("Напишите название продукта")
        val product1: String = readLine().toString()
        println("Напишите цену продукта")
        val prise1: Int = readLine()!!.toInt()
        println("Напишите информацию о продукте")
        val info1: String = readLine().toString()
        val productOne = internetshops.InternetShop(product1, prise1, info1)
        println("Клиенту:")
        productOne.Tovar()
        productOne.ProductInfo()
        println("Для закза напишите свою фамилию")
        val fam1: String = readLine().toString()
        println("Также укажите количество продукта")
        val kol: Int = readLine()!!.toInt()
        val pokupka1 = kol * prise1
        println("Сколько денег у вас есть")
        val chet1: Int = readLine()!!.toInt()
        val klient1 = Klient(fam1, pokupka1, chet1, kol, product1, prise1, info1)
        if (pokupka1 > chet1) {
            blok = true
        }
        println("Товаровед:")
        klient1.PokupkaInfo()
        klient1.GetInfo()
        val tovaroved1 = Tovaroved(blok, fam1, product1, prise1, info1)
        if(blok == true){
            while(true){
                println("~клиент какой-то подозрительный, вы хотите его заблокировать $fam1?(да, нет)~")
                val answer: String = readLine().toString()
                if(answer == "да"){
                    break
                }
                if (answer == "нет"){
                    blok = false
                    break
                }
            }
        }
        if (blok == true) {
            tovaroved1.BlokList()
            println("Клиенту:")
            klient1.BlokPerson()
        } else {
            tovaroved1.ProductAdd()
            tovaroved1.ZakazInfo()
            println("Клиенту:")
            klient1.UnBlokPerson()
        }
    }
    catch(e:Exception){
        println("error")
    }
}
