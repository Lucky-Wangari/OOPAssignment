fun main() {
  val records = Human("Jeniffer", 21, 56)
    records.eat(4)
    records.speak("Humans age is a major contributor to their weight.")
    records.birthday()

  val details = User("Beyonce", "Carter","carter@gmail.com","07123456","Cater34")
    println(details.firstName)
    println( details.phoneNumber)

}
class Human(var name: String, var age: Int, var weight: Int) {

    fun eat(foodWeight: Int){
   var statement = "I am eating ${foodWeight} kgs of food"
        println(statement)
        weight += foodWeight
        println(weight)
  }
    fun speak(speech: String){
        println(speech)

    }
    fun birthday(){
        age = ++ age
        println(age)

    }

}
data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String){

}