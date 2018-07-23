package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.i18n._



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

@Singleton
class HomeController @Inject()(cc: ControllerComponents, langs: Langs, messsagesApi: MessagesApi) extends AbstractController(cc) with I18nSupport {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  implicit val lang: Lang = langs.availables.head
  /**
  implicit val messagesProvider: MessagesProvider = MessagesImpl(lang, messagesApi)
    **/

  def index() = Action { implicit request: Request[AnyContent] =>
    Redirect(routes.ProductsController.list())
  }
}
