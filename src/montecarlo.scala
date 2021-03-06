import scala.util.Random
import scala.math
import scala.collection.mutable.ListBuffer

object montecarlo extends App {
  var arguments = args map (_.toInt)
  
  def getPoint(): Int = {
    if (scala.math.sqrt(scala.math.pow(Random.nextDouble,2) + scala.math.pow(Random.nextDouble,2)) <= 1) 1 else 0
  }
  
  def getRatio(np: Int): Double = {
	(List.fill(np)(getPoint).sum * 1.0) / np
  }
  
  var pi = (List.fill(arguments(0))(getRatio(arguments(1))).sum / arguments(0)) * 4.0 
  Console.println("Approximation of Pi: " + pi)
}