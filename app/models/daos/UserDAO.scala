package models.daos

import javax.inject.Inject

import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.concurrent.Execution.Implicits.defaultContext

/**
  * Created by n0tel on 05.06.17.
  */
class UserDAO @Inject()(
  val dbConfigProvider: DatabaseConfigProvider
) extends DAOSlick {

  import profile.api._

  def addNewOne() = {
    val newUser = DBUser(
      name = "Имя",
      tel = "Телефон",
      email = "mail",
      id = None
    )

     val action = for {
      _ <- slickUsers += newUser
    } yield Unit

    db.run(action)
  }

}
