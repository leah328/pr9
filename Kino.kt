open class Kino(var name: Int,
               var seans: Int,
               var price: Int,
               var zal:Int,
               var kolvo:Int) {
    open fun Input() {
        try {
            println("на какой фильм пойдете (на все цена 300 рублей)?\n1.Лавина\n2.Подснежники\n3.Майор Пумберте")
            name = readLine()!!.toInt()
            if (name>0&&name<4) {
                println("на какое время хотите взять билеты?\n1.16:40\n2.18:30\n3.20:50")
                seans = readLine()!!.toInt()
                if (seans > 0 && seans < 4) {
                    println("выберите любой зал от 1 до 8")
                    zal = readLine()!!.toInt()
                    if (zal<1&&zal>8)
                    {
                        println("на сколько людей берете билеты?")
                        kolvo = readLine()!!.toInt()
                        if (kolvo>0)
                            else println("количество не может быть меньше 0")
                    }
                    else println("такого зала нет")
                }
                else println("такого сеанса нет")
            }
            else println ("такого фильма нет")

        } catch (e: Exception) {
            println("error")
        }
    }

    class Cassa(var pprice:Int,var eda:Int,var c:Int,var det:Int,nname: Int,nseans:Int,nprice:Int,nzal:Int,nkolvo:Int):Kino(nname,nseans,nprice,nzal,nkolvo)
    {
        fun Input1(){
            try{ println("сегодня для детей билет бесплатный если они с вами есть, то укажите сколько")
                det = readLine()!!.toInt()
                if (det>=0)
                    else println("значение не может быть меньше 0")
            }catch (e:Exception){println("error")}
        }

        fun Eda()
        {
            println("будете брать еду, напитки?\n1.да\n2.нет")
            c = readLine()!!.toInt()
            when (c){
                1-> {
                    println("что будете брать?\n1.пепси-60 рублей\n2.попкрон-110 рублей\n3.чипсы-77 рублей")
                    eda = readLine()!!.toInt()
                    if (eda>4&&eda<1)
                        else println("такого пункта нет")
                }
                    2->{ c=0
                        println("хорошо, давайте перейдем к оплате")}

                else->println("error")
            }

        }
        fun Cena()
        {
            when{
                (det>0) ->
                    price=(kolvo-det)*300
                (det==0)-> price=kolvo*300
            }
            if (c!=0)
            {
                when (c)
                {
                    1->pprice=price+60
                    2->pprice=price+110
                    3->pprice-price+77
                }
            }
        }
        fun Output(kino: Cassa)
        {
            if (c!=0) println("Фильм:${kino.name}\nСеанс:${kino.seans}\nЗал:${kino.zal}\nЦена:${kino.pprice}")
            else
            println("Фильм:${kino.name}\nСеанс:${kino.seans}\nЗал:${kino.zal}\nЦена:${kino.price}")
        }

    }
}