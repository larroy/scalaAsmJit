object Main extends App {
  def clamp[@specialized T : Ordering](value: T, low: T, high: T): T = {
    import Ordered._
    if (value < low) low else if (value > high) high else value
  }

    println("hi")
    for ( x <- 0 until 10)
        println("ho")

}
