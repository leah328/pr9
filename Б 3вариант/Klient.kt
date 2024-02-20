import internetshops.*
open class Klient (var fam: String, var pokupka: Int, var chet: Int, var kol: Int,empproduct: String, empprise: Int, empinformation: String): InternetShop(empproduct, empprise, empinformation){
    open fun GetInfo(){
        println("Клиент: $fam. Чек ценой: $pokupka. Баланс: $chet.")
    }
    open fun PokupkaInfo(){
        println("Клиент: $fam покупает $product стоимостью за 1 штуку в $prise рублей в количестве $kol штук")
    }
    open fun BlokPerson(){
        println("К сожалению вы заблокированы для покупки $product в количестве $kol штук")
    }
    open fun UnBlokPerson(){
        println("Вы удачно завершили покупку, $fam, ожидайте заказ")
    }
}
