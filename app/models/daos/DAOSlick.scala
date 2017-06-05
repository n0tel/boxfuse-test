package models.daos

import play.api.db.slick.HasDatabaseConfigProvider
import utils.MyPostgresProfile

/**
  * Created by n0tel on 05.06.17.
  */
trait DAOSlick extends DBTableDefinitions with HasDatabaseConfigProvider[MyPostgresProfile] {

}
