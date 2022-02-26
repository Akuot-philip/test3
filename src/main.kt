fun main(){
    //quiz1
    var school ="akirachix"
    var char = school[0]
    var char2 = school[2]
    var char3 = school[3]
    var result = "$char$char2$char3"
    println(result)
    //quiz2
    var x= information("Angelah",20)
    println(x)
    //quiz3
    var car = "ferari"
    println(car.length)
//quiz4
    val name = "Angelah"
    if (name== "Angelah"){
        print("That's me!")
} else {
    print("I don't know who that is")
}

}
//quiz2
fun information(name: String,age:Int):String{
   var stmt = ("Hi my name is $name and i am $age years old")
    return stmt

}
