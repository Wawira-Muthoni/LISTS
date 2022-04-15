fun main(){
    var ac =str(listOf("Lona","Grace","Mary","Job","Jacob"))
    println(ac)

    println(pH(listOf(3.2,4.5,5.2,6.1)))

    var person1 =people("Moses",25,40.5,60)
    var person2 =people("Jonah",45,50.5,70)
    var both = listOf(person1,person2)
    var y =both.sortedByDescending { adult-> adult.age }
    println(y)

    var person3 = people("Gumav",60,35.9,50)
    var person4 = people("Casey",23,39.6,65)
    var z = mutableListOf(person3,person4)
    println(z.plus(z))

    var u = Mileage("KDC 5678C",50)
    var t = Mileage("KBY 12349P",90)
    var car = listOf(u,t)
    println(avMileage(car))

}
/*Given a list of 10 strings, write a function that returns a list of the strings
at even indices i.e index 2,4,6 etc*/
fun str(names:List<String>):List<String>{
    names.forEachIndexed  { index, j ->
        if (index%2==0){
        println(j)
    }
    }
    return  names
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun pH(values:List<Double>):String{
    var add = values.sum()
    var averagepH = values.average()
    var both = " $add , $averagepH"
     return both


}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class  people(var name:String,var age:Int,var height:Double,var weight:Int)
fun individual(more:List<Any>):List<Any>{
    return listOf()

}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list

data class Mileage (var registration:String,var mileage:Int)
fun avMileage(miless:List<Mileage>):Int{
    var av = 0
    miless.forEach{ mile->mile.mileage
    av+=mile.mileage
    }
    var average=av/miless.count()
    return average
}



