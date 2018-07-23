
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
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
                        """),_display_(/*26.26*/messages("application.name")),format.raw/*26.54*/("""
                    """),format.raw/*27.21*/("""</a>
                </div>
            </div>
        </div>
        <div class="container">
            """),_display_(/*32.14*/content),format.raw/*32.21*/("""
        """),format.raw/*33.9*/("""</div>
    </div>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messages)

  def f:((String) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messages) => apply(title)(content)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 20 16:31:34 VET 2018
                  SOURCE: /home/hgonzalez/play-stuff/products/app/views/main.scala.html
                  HASH: aa45a5093307c777b6bcb4fe6eac7f0faadbcd64
                  MATRIX: 996->260|1149->320|1176->321|1247->417|1283->426|1318->434|1344->439|1449->517|1464->523|1532->569|1631->641|1646->647|1709->688|1962->914|1977->920|2021->943|2076->971|2125->999|2174->1020|2308->1127|2336->1134|2372->1143
                  LINES: 26->7|31->8|32->9|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|48->25|48->25|48->25|49->26|49->26|50->27|55->32|55->32|56->33
                  -- GENERATED --
              */
          