package com.scala.sandeep.part2oo

object OOBasics {

  // classes and instances
  class Person(val name: String, val age: Int) // constructor, class definition also
  // contains definition of constructor...
  {
    // fields of val or var
    val allCaps = name.toUpperCase()
    // also define methods
    def greet(someone: String): String =
      s"$name says: Hi $someone"

    // can define multiple method with same name
    // method overloading
    // only rule the new method/def signature should deffer
    def greet(someone: String, host: String): String = s"$host says: Hi $someone"
  }

  /*
    class Type of Car and Driver
  */

  class Driver(firstName: String, lastName: String, val dob: Int) {
    def fullName(): String= s"$firstName $lastName"
  }

  class Car(make: String, model: String, yor: Int, owner: Driver){
    def ownerAge(): Int =  yor - owner.dob
    def isOwnedBy(driver: Driver): Boolean = driver == owner // equality checks for memory location
    // and not the contents of the instance
    def copy(newYor: Int): Car = Car(make, model, newYor, owner)
  }



  val sandeep = new Person("Sandeep", 29)
  def main(args: Array[String]): Unit = {
    println(sandeep.allCaps)
    println(sandeep.greet("Alizah"))
    println(sandeep.greet("Sandeep", "Alizah"))
    println(sandeep.age)

    val driver = new Driver("Michael", "Schumacher", 1969) // two different memory location
    val driverImposter = new Driver("Michael", "Schumacher", 1969)
    val car = new Car("Ferrari", "F1", 2004, driver)

    println(driver.fullName())
    println(car.ownerAge())
    println(car.isOwnedBy(driverImposter))
    println(car.copy(2005).ownerAge())
  }
}
