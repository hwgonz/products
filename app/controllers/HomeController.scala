package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.i18n.{I18nSupport, Messages, Lang}
import play.api.i18n.Messages.Implicits._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

@Singleton
class HomeController @Inject()(val messages: Messages)(cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Redirect(views.html.products.list(products))
  }
}