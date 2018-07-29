
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

object editProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Product],Flash,Lang,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[Product])(implicit flash: Flash, lang: Lang, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(Messages("products.form"))/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""
"""),format.raw/*5.1*/("""<h2>"""),_display_(/*5.6*/Messages("products.form")),format.raw/*5.31*/("""</h2>
"""),_display_(/*6.2*/helper/*6.8*/.form(action = routes.ProductsController.save())/*6.56*/ {_display_(Seq[Any](format.raw/*6.58*/("""
"""),format.raw/*7.1*/("""<fieldset>
    <legend>
        """),_display_(/*9.10*/Messages("products.details", Messages("products.new"))),format.raw/*9.64*/("""
    """),format.raw/*10.5*/("""</legend>
    """),_display_(/*11.6*/helper/*11.12*/.inputText(productForm("ean"))),format.raw/*11.42*/("""
    """),_display_(/*12.6*/helper/*12.12*/.inputText(productForm("name"))),format.raw/*12.43*/("""
    """),_display_(/*13.6*/helper/*13.12*/.textarea(productForm("description"))),format.raw/*13.49*/("""
"""),format.raw/*14.1*/("""</fieldset>
<p><input type="submit" class="btn primary"
          value='"""),_display_(/*16.19*/Messages("products.new.submit")),format.raw/*16.50*/("""'></p>
""")))}),format.raw/*17.2*/("""
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(productForm:Form[Product],flash:Flash,lang:Lang,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(productForm)(flash,lang,messagesProvider)

  def f:((Form[Product]) => (Flash,Lang,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => (flash,lang,messagesProvider) => apply(productForm)(flash,lang,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 29 11:33:37 VET 2018
                  SOURCE: /home/hwgonz/play-stuff/products/app/views/products/editProduct.scala.html
                  HASH: 3d02182cf69f0fbf93b092c1cbc9d7b0b1c5f331
                  MATRIX: 779->1|951->102|995->118|1022->120|1061->151|1100->153|1127->154|1157->159|1202->184|1234->191|1247->197|1303->245|1342->247|1369->248|1428->281|1502->335|1534->340|1575->355|1590->361|1641->391|1673->397|1688->403|1740->434|1772->440|1787->446|1845->483|1873->484|1974->558|2026->589|2064->597|2096->599
                  LINES: 21->1|24->2|27->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|30->6|31->7|33->9|33->9|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|40->16|40->16|41->17|42->18
                  -- GENERATED --
              */
          