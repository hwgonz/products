
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Html,Flash,Lang,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit flash: Flash, lang: Lang, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html>

    <head>
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
        <link rel="stylesheet" type="text/css" media="screen" href='"""),_display_(/*15.70*/routes/*15.76*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*15.122*/("""'>
        <link rel="stylesheet" type="text/css" media="screen" href='"""),_display_(/*16.70*/routes/*16.76*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.117*/("""'>
    </head>

    <body>

    <div class="screenshot">
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="brand" href=""""),_display_(/*25.45*/routes/*25.51*/.HomeController.index()),format.raw/*25.74*/("""">
                        """),_display_(/*26.26*/Messages("application.name")),format.raw/*26.54*/("""
                    """),format.raw/*27.21*/("""</a>
                    <ul class="nav">
                        <li class="divider-vertical"></li>
                        <li class="active">
                            <a href=""""),_display_(/*31.39*/routes/*31.45*/.ProductsController.list()),format.raw/*31.71*/("""">
                                """),_display_(/*32.34*/Messages("products.details")),format.raw/*32.62*/("""
                            """),format.raw/*33.29*/("""</a>
                        </li>
                        <li class="active">
                            <a href=""""),_display_(/*36.39*/routes/*36.45*/.ProductsController.newProduct()),format.raw/*36.77*/("""">
                                <i class="icon-plus icon-white"></i>
                                """),_display_(/*38.34*/Messages("products.new.command")),format.raw/*38.66*/("""
                            """),format.raw/*39.29*/("""</a>
                        </li>
                        <li class="divider-vertical"></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="container">
            """),_display_(/*47.14*/if(flash.get("success").isDefined)/*47.48*/{_display_(Seq[Any](format.raw/*47.49*/("""
            """),format.raw/*48.13*/("""<div class="alert alert-success">
                """),_display_(/*49.18*/flash/*49.23*/.get("success")),format.raw/*49.38*/("""
            """),format.raw/*50.13*/("""</div>
            """)))}),format.raw/*51.14*/("""
            """),_display_(/*52.14*/if(flash.get("error").isDefined)/*52.46*/{_display_(Seq[Any](format.raw/*52.47*/("""
            """),format.raw/*53.13*/("""<div class="alert alert-error">
                """),_display_(/*54.18*/flash/*54.23*/.get("error")),format.raw/*54.36*/("""
            """),format.raw/*55.13*/("""</div>
            """)))}),format.raw/*56.14*/("""

            """),_display_(/*58.14*/content),format.raw/*58.21*/("""
            """),_display_(/*59.14*/debug()),format.raw/*59.21*/("""
        """),format.raw/*60.9*/("""</div>
    </div>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,flash:Flash,lang:Lang,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(flash,lang,messagesProvider)

  def f:((String) => (Html) => (Flash,Lang,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (flash,lang,messagesProvider) => apply(title)(content)(flash,lang,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 23 16:42:23 VET 2018
                  SOURCE: /home/hgonzalez/play-stuff/products/app/views/main.scala.html
                  HASH: 00a5080e31065f6e995ff89c046cc5729b0a4d36
                  MATRIX: 1015->260|1210->362|1237->363|1308->459|1344->468|1379->476|1405->481|1510->559|1525->565|1593->611|1692->683|1707->689|1770->730|2023->956|2038->962|2082->985|2137->1013|2186->1041|2235->1062|2445->1245|2460->1251|2507->1277|2570->1313|2619->1341|2676->1370|2820->1487|2835->1493|2888->1525|3020->1630|3073->1662|3130->1691|3379->1913|3422->1947|3461->1948|3502->1961|3580->2012|3594->2017|3630->2032|3671->2045|3722->2065|3763->2079|3804->2111|3843->2112|3884->2125|3960->2174|3974->2179|4008->2192|4049->2205|4100->2225|4142->2240|4170->2247|4211->2261|4239->2268|4275->2277
                  LINES: 26->7|31->8|32->9|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|48->25|48->25|48->25|49->26|49->26|50->27|54->31|54->31|54->31|55->32|55->32|56->33|59->36|59->36|59->36|61->38|61->38|62->39|70->47|70->47|70->47|71->48|72->49|72->49|72->49|73->50|74->51|75->52|75->52|75->52|76->53|77->54|77->54|77->54|78->55|79->56|81->58|81->58|82->59|82->59|83->60
                  -- GENERATED --
              */
          