import internetshops.*
open class Tovaroved (var blok: Boolean, var fam: String, empproduct: String, empprise: Int, empinformation: String): InternetShop(empproduct, empprise, empinformation){
    open fun ProductAdd(){
        println("Заказ на фамилию $fam принят.")
    }
    open fun ZakazInfo(){
        println("Клиент: $fam:\nпокупает $product.\nИнформация о товаре :$information.")
    }
    open fun BlokList(){
        println("Вы успешно заблокировали клиента $fam для покупки товара $product.")
    }
}
