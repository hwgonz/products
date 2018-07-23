package controllers

import javax.inject._
import play.api.mvc._
import models.Product
import play.api.i18n._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class ProductsController  @Inject()(cc: ControllerComponents, langs: Langs, messagesApi: MessagesApi) extends AbstractController(cc) with I18nSupport  {

  implicit val lang: Lang = langs.availables.head

  def list = Action { implicit request =>
    val products = Product.findAll
    Ok(views.html.products.list(products))
  }
}
