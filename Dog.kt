open class Dog(var name: String,
               var poroda: String,
               var rost: Double,
               var sherst:String,
               var ves:Double,
               var harakt:String) {
    open fun Input()
    {
        try {
            println("введите имя собаки")
            name = readLine()!!.toString()
            println("введите породу")
            poroda = readLine()!!.toString()
            println("введите рост по холке")
            rost = readLine()!!.toDouble()
            if (rost>0.0){
                println("какой у собаки окрас шерсти?")
                sherst = readLine()!!.toString()
                println("сколько собака весит?")
                if (ves>0.0){ ves = readLine()!!.toDouble()
                    println("опишите ее характер")
                    harakt = readLine()!!.toString()}
                else println("вес не может быть отрицательным")
            }
            else println("рост не может быть отрицательным")
        }
        catch(e:Exception){ println("error") }
    }
    class Vet( var c: Int,var vetyear: Int, mname: String,mporoda: String,mrost: Double, msherst: String,mves: Double, mharakt: String):Dog(mname,mporoda,mrost,msherst,mves,mharakt)
    {
        fun Input1(){
            try {
                println("сколько лет вы уже пользуетесь услугами нашей ветклиники?")
                vetyear = readLine()!!.toInt()
                if (vetyear > 0) {
                    println("быстрый осмотр животного бесплатный, выберите что вам нужно еще:\n1.сдать анализы\n2.узи\n3.собака что-то съела нужно промывание")
                    c = readLine()!!.toInt()
                    if (c>0&&c<4)
                        else println("такого пункта нет!")
                }
                else println("введенное значение не может быть меньше нуля")
            }catch(e:Exception){ println("error") }
        }
        fun Nves()
        { if(ves>rost) println("у вашей собаки вес больше роста, у нее ожирение, срочно нужно сесть на диету!")
            else {
                if(rost>70&&rost<100&&ves<70||rost<70&&rost>40&&ves<30||rost<40&&rost>20&&ves<10) println("у вашей собаки недовес, надо открамливать")
            else println("внешне с вашей собакой все нормально")
            }
        }
        fun Cena()
        {
           when (c)
           {
               1->println("мы сделали все что вы просили, с вас 1900 рублей")
               2-> println("мы сделали все что вы просили, с вас 5000 рублей")
               3->println("мы сделали все что вы просили, с вас 2500 рублей")
           }
        }
        fun Output(dog: Vet)
        {
            println("Кличка:${dog.name}\nПорода:${dog.poroda}\nРост собаки по холке:${dog.rost}\nШерсть:${dog.sherst}\nВес:${dog.ves}\nХарактер:${dog.harakt}")

        }
    }
}
