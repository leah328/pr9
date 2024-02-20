package internetshops
open class InternetShop (var product: String, var prise: Int, var information: String){
    open fun Tovar(){
        println("Продукт: $product. Цена: $prise")
    }
    open fun ProductInfo(){
        println("Продукт: $product. Информация о продукте: $information")
    }
}
