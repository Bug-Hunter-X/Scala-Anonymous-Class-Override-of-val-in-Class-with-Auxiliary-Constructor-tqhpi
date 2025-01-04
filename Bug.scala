```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
}

object Main extends App {
  val instance1 = new MyClass(5)
  val instance2 = new MyClass()
  println(instance1.value) // Output: 5
  println(instance2.value) // Output: 0

  // Problem starts here
  val instance3 = new MyClass { override val value = 10 }
  println(instance3.value) // Output: 0 instead of 10
}
```