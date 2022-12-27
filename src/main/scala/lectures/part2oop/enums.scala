package lectures.part2oop

object enums extends App {

  enum Permission {
    case READ, WRITE, EXECUTE, NONE

    // add fields and methods
    def openDocument(): Unit = {
      if (this == READ) println("opening document...")
      else println("reading not allowed")
    }
  }

  val somePermissions = Permission.READ
  println(somePermissions.openDocument())


  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4) // 100
    case WRITE extends PermissionsWithBits(2) // 010
    case EXECUTE extends PermissionsWithBits(1) //001
    case NONE extends PermissionsWithBits(0) // 000
  }

  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits = // whatever
      PermissionsWithBits.NONE
  }
}
