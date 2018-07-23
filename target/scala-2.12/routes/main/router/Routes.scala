// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hgonzalez/play-stuff/products/conf/routes
// @DATE:Mon Jul 23 16:16:45 VET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:9
  ProductsController_2: controllers.ProductsController,
  // @LINE:15
  BarcodesController_3: controllers.BarcodesController,
  // @LINE:22
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:9
    ProductsController_2: controllers.ProductsController,
    // @LINE:15
    BarcodesController_3: controllers.BarcodesController,
    // @LINE:22
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ProductsController_2, BarcodesController_3, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ProductsController_2, BarcodesController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductsController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/new""", """controllers.ProductsController.newProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """ean<[^/]+>""", """controllers.ProductsController.show(ean:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """barcode/""" + "$" + """ean<[^/]+>""", """controllers.BarcodesController.barcode(ean:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductsController.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProductsController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductsController_list1_invoker = createInvoker(
    ProductsController_2.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "list",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductsController_newProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/new")))
  )
  private[this] lazy val controllers_ProductsController_newProduct2_invoker = createInvoker(
    ProductsController_2.newProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "newProduct",
      Nil,
      "GET",
      this.prefix + """products/new""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductsController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_show3_invoker = createInvoker(
    ProductsController_2.show(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "show",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """products/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BarcodesController_barcode4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("barcode/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BarcodesController_barcode4_invoker = createInvoker(
    BarcodesController_3.barcode(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BarcodesController",
      "barcode",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """barcode/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ProductsController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductsController_save5_invoker = createInvoker(
    ProductsController_2.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "save",
      Nil,
      "POST",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_ProductsController_list1_route(params@_) =>
      call { 
        controllers_ProductsController_list1_invoker.call(ProductsController_2.list)
      }
  
    // @LINE:11
    case controllers_ProductsController_newProduct2_route(params@_) =>
      call { 
        controllers_ProductsController_newProduct2_invoker.call(ProductsController_2.newProduct)
      }
  
    // @LINE:13
    case controllers_ProductsController_show3_route(params@_) =>
      call(params.fromPath[Long]("ean", None)) { (ean) =>
        controllers_ProductsController_show3_invoker.call(ProductsController_2.show(ean))
      }
  
    // @LINE:15
    case controllers_BarcodesController_barcode4_route(params@_) =>
      call(params.fromPath[Long]("ean", None)) { (ean) =>
        controllers_BarcodesController_barcode4_invoker.call(BarcodesController_3.barcode(ean))
      }
  
    // @LINE:17
    case controllers_ProductsController_save5_route(params@_) =>
      call { 
        controllers_ProductsController_save5_invoker.call(ProductsController_2.save)
      }
  
    // @LINE:22
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
