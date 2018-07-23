package controllers

import javax.inject._
import play.api.mvc._
import models.Product
import play.api.i18n.{I18nSupport, Messages, Lang}
import play.api.i18n.Messages.Implicits._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class ProductsController  @Inject()(val messages: Messages)(cc: ControllerComponents) extends AbstractController(cc) with I18nSupport  {
  def list = Action { implicit request =>
    val products = Product.findAll
    Ok(views.html.products.list(products))
  }
}
