package utils

import com.github.tminglei.slickpg.{ExPostgresProfile, PgDateSupportJoda, PgEnumSupport}

/**
  * Created by n0tel on 25.11.16.
  */
trait MyPostgresProfile extends ExPostgresProfile with PgDateSupportJoda with PgEnumSupport {

  override val api = MyAPI

  object MyAPI extends API with DateTimeImplicits {
  }


}

object MyPostgresProfile extends MyPostgresProfile