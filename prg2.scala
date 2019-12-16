import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer
object MinMax {
	def main(args:Array[String]):Unit = {
		var numarr = new ArrayBuffer[Int]()
		println("Enter no of elements:")
		var n = scala.io.StdIn.readInt()
		println("Enter elements: ")
		for(i<-0 until n)
			numarr += scala.io.StdIn.readInt()
		println(numarr)
		val t = minmax(numarr)
		println("Max: ",t._1)
		println("Min: ",t._2)
	}
	def minmax(numarr:ArrayBuffer[Int]):(Int,Int) = {
		var min:Int = 999
		var max:Int = -999
		for(i<-numarr){
			if(i>max)
				max = i
			if(i<min)
				min = i
		}
		(max,min)
	}
}