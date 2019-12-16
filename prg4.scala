abstract class notify {}
case class sms(mob:String,msg:String) extends notify
case class email(id:String,sub:String,body:String) extends notify

object prg4{
	def main(args:Array[String]):Unit = {
		val ssms = sms("12345","THIS IS SPARTA!!!")
		val semail = email("lol@gmail.com","BDALab","SPARTA, IS THIS???")
		println(shownotify(ssms))
		println(shownotify(semail))
	}
	def shownotify(n:notify):String = {
		n match {
			case email(id,sub,_) => s"Email from $id with subject $sub"
			case sms(mob,msg) => s"Text from $mob! Message: $msg" 
		}
	}
}