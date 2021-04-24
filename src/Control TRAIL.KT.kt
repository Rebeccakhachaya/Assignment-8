fun main(){
    println(isEven(200))
    println(isEven(27))
    var market1=Product("Fruits",30,100,"groceries")
    market1.shop()
    var washing=Product("soap",50,150,"hygiene")
    washing.shop()
    var market2=Product("Furniture",70,1500,"others")
    market2.shop()
    println(newValue("banana"))
    println(myArr(arrayOf("jane","Rosemary","winnie","Jimmy")))
}
fun isEven(number:Int):Boolean{
    if (number%2==0){
        return true
    }else{
        return false
    }
    return true
}
data class Product(var name:String,var weight:Int,var price:Int,var category:String) {
    fun shop() {

        var groceries: MutableList<String> = mutableListOf<String>()
        var hygiene: MutableList<String> = mutableListOf<String>()
        var others: MutableList<String> = mutableListOf<String>()
//  var product=Product("Fruits",30,100,"groceries")
        when (category) {
            "groceries" ->println( groceries.plus(name))
            "hygiene" -> println(hygiene.plus(name))
            "others"-> println(others.plus(name)) }
    }

}
fun newValue(word:String):String {
    var fruit = ""
    for (items in word) {
        if (word.indexOf(items) % 2 == 0) {
            fruit+=items
        }
    }
return fruit
}

fun myArr(myArr:Array<String>):List<String>{
    var myList= mutableListOf<String>()
    for (names in myArr){
        if (names.length%2==0) {
            (myList.add(names))
        }
}
return myList
}





