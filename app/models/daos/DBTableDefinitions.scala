package models.daos

/**
  * Created by n0tel on 04.06.17.
  */
trait DBTableDefinitions {

  protected val driver: utils.MyPostgresProfile

  import driver.api._

  case class DBUser(
    name: String,
    tel: String,
    email: String,
    id: Option[Long]
  )

  class Users(tag: Tag) extends Table[DBUser](tag, "users") {
    def name = column[String]("name")
    def tel = column[String]("tel")
    def email = column[String]("email")
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def * = (name, tel, email, id.?) <> (DBUser.tupled, DBUser.unapply)
  }

  val slickUsers = TableQuery[Users]

}
