
package views.html.tags

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

object barcode extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ean: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<img class="barcode" alt=""""),_display_(/*2.28*/ean),format.raw/*2.31*/("""" src=""""),_display_(/*2.39*/routes/*2.45*/.BarcodesController.barcode(ean)),format.raw/*2.77*/("""">
"""))
      }
    }
  }

  def render(ean:Long): play.twirl.api.HtmlFormat.Appendable = apply(ean)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (ean) => apply(ean)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 29 11:33:37 VET 2018
                  SOURCE: /home/hwgonz/play-stuff/products/app/views/tags/barcode.scala.html
                  HASH: f79d4a2ec91731d9a8b4a2bea8494e541df1df5f
                  MATRIX: 734->1|839->13|892->40|915->43|949->51|963->57|1015->89
                  LINES: 21->1|26->2|26->2|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          