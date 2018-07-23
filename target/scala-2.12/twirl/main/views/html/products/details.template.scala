
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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Product,Flash,Lang,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Product)(implicit flash: Flash, lang: Lang, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main(Messages("products.details", product.name))/*2.50*/ {_display_(Seq[Any](format.raw/*2.52*/("""
"""),format.raw/*3.1*/("""<h2>
    """),_display_(/*4.6*/tags/*4.10*/.barcode(product.ean)),format.raw/*4.31*/("""
    """),_display_(/*5.6*/Messages("products.details", product.name)),format.raw/*5.48*/("""
"""),format.raw/*6.1*/("""</h2>
<dl class="dl-horizontal">
    <dt>"""),_display_(/*8.10*/Messages("ean")),format.raw/*8.25*/(""":</dt>
    <dd>"""),_display_(/*9.10*/product/*9.17*/.ean),format.raw/*9.21*/("""</dd>
    <dt>"""),_display_(/*10.10*/Messages("name")),format.raw/*10.26*/(""":</dt>
    <dd>"""),_display_(/*11.10*/product/*11.17*/.name),format.raw/*11.22*/("""</dd>
    <dt>"""),_display_(/*12.10*/Messages("description")),format.raw/*12.33*/(""":</dt>
    <dd>"""),_display_(/*13.10*/product/*13.17*/.description),format.raw/*13.29*/("""</dd>
</dl>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(product:Product,flash:Flash,lang:Lang,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(product)(flash,lang,messagesProvider)

  def f:((Product) => (Flash,Lang,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (product) => (flash,lang,messagesProvider) => apply(product)(flash,lang,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 23 16:16:45 VET 2018
                  SOURCE: /home/hgonzalez/play-stuff/products/app/views/products/details.scala.html
                  HASH: 599bd5a526abd2269ae0a49f32b7cb490e260856
                  MATRIX: 769->1|952->92|1008->140|1047->142|1074->143|1109->153|1121->157|1162->178|1193->184|1255->226|1282->227|1350->269|1385->284|1427->300|1442->307|1466->311|1508->326|1545->342|1588->358|1604->365|1630->370|1672->385|1716->408|1759->424|1775->431|1808->443|1851->456
                  LINES: 21->1|26->2|26->2|26->2|27->3|28->4|28->4|28->4|29->5|29->5|30->6|32->8|32->8|33->9|33->9|33->9|34->10|34->10|35->11|35->11|35->11|36->12|36->12|37->13|37->13|37->13|39->15
                  -- GENERATED --
              */
          