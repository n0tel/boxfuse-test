package modules

import com.google.inject.AbstractModule
import models.daos.UserDAO
import net.codingwell.scalaguice.ScalaModule

/**
  * Created by n0tel on 05.06.17.
  */
class DAOModule extends AbstractModule with ScalaModule {

  def configure(): Unit = {
    bind[UserDAO]
  }

}
