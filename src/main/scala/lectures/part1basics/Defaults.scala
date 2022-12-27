package lectures.part1basics

object Defaults extends App {

  def savePicture(format: String = "jpeg", width: Int = 1800, height: Int = 1600) = println("saving picture!!")

  savePicture(width = 2000, format = "bmp")
  savePicture(width = 2000, height = 1700)

}
