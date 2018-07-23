
package views.html.products

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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Product],Lang,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(products: List[Product])(implicit lang: Lang, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),_display_(/*9.2*/main(Messages("application.name"))/*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
"""),format.raw/*10.1*/("""<dl class="products">
    """),_display_(/*11.6*/for(product <- products) yield /*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
    """),format.raw/*12.5*/("""<dt>"""),_display_(/*12.10*/product/*12.17*/.name),format.raw/*12.22*/("""</dt>
    <dd>"""),_display_(/*13.10*/product/*13.17*/.description),format.raw/*13.29*/("""</dd>
    """)))}),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</dl>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(products:List[Product],lang:Lang,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(products)(lang,messagesProvider)

  def f:((List[Product]) => (Lang,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (products) => (lang,messagesProvider) => apply(products)(lang,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 23 14:40:21 VET 2018
                  SOURCE: /home/hgonzalez/play-stuff/products/app/views/products/list.scala.html
                  HASH: 0edfb35551ed316648e93949d06a2fd8266863d2
                  MATRIX: 1020->260|1196->343|1223->345|1265->379|1304->381|1332->382|1385->409|1425->433|1465->435|1497->440|1529->445|1545->452|1571->457|1613->472|1629->479|1662->491|1703->502|1731->503|1768->510
                  LINES: 26->7|31->8|32->9|32->9|32->9|33->10|34->11|34->11|34->11|35->12|35->12|35->12|35->12|36->13|36->13|36->13|37->14|38->15|39->16
                  -- GENERATED --
              */
          