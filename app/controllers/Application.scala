package controllers

import javax.inject.Inject

import models.daos.UserDAO
import play.api._
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

class Application @Inject()(
  userDAO: UserDAO
) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def add() = Action.async {
    userDAO.addNewOne().map(_ => Ok("Новый пользователь добавлен"))
  }

}