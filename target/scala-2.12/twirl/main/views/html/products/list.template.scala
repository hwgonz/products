
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],Flash,Lang,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(products: List[Product])(implicit flash: Flash, lang: Lang, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),_display_(/*9.2*/main(Messages("application.name"))/*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
"""),format.raw/*10.1*/("""<dl class="products">

    """),_display_(/*12.6*/for(product <- products) yield /*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
    """),format.raw/*13.5*/("""<dt>
        <a href=""""),_display_(/*14.19*/controllers/*14.30*/.routes.ProductsController.show(product.ean)),format.raw/*14.74*/("""">
            """),_display_(/*15.14*/product/*15.21*/.name),format.raw/*15.26*/("""
        """),format.raw/*16.9*/("""</a>
    </dt>
    <dd>"""),_display_(/*18.10*/product/*18.17*/.description),format.raw/*18.29*/("""</dd>
    """)))}),format.raw/*19.6*/("""

"""),format.raw/*21.1*/("""</dl>

<p>
    <a href=""""),_display_(/*24.15*/controllers/*24.26*/.routes.ProductsController.newProduct()),format.raw/*24.65*/(""""
       class="btn">
        <i class="icon-plus"></i> """),_display_(/*26.36*/Messages("products.new.command")),format.raw/*26.68*/("""</a>
</p>

""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(products:List[Product],flash:Flash,lang:Lang,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(products)(flash,lang,messagesProvider)

  def f:((List[Product]) => (Flash,Lang,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (products) => (flash,lang,messagesProvider) => apply(products)(flash,lang,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 29 11:33:37 VET 2018
                  SOURCE: /home/hwgonz/play-stuff/products/app/views/products/list.scala.html
                  HASH: 6c068e0d2c673ed3001702775c443b73c4574673
                  MATRIX: 1026->260|1216->357|1243->359|1285->393|1324->395|1352->396|1406->424|1446->448|1486->450|1518->455|1568->478|1588->489|1653->533|1696->549|1712->556|1738->561|1774->570|1825->594|1841->601|1874->613|1915->624|1944->626|1996->651|2016->662|2076->701|2160->758|2213->790|2255->802
                  LINES: 26->7|31->8|32->9|32->9|32->9|33->10|35->12|35->12|35->12|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|41->18|41->18|41->18|42->19|44->21|47->24|47->24|47->24|49->26|49->26|52->29
                  -- GENERATED --
              */
          