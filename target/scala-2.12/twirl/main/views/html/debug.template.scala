
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

object debug extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current


Seq[Any](format.raw/*3.1*/("""<footer>
    lang = """),_display_(/*4.13*/lang/*4.17*/.code),format.raw/*4.22*/(""",
    user = """),_display_(/*5.13*/current/*5.20*/.configuration.getString("environment.user")),format.raw/*5.64*/(""",
    date = """),_display_(/*6.13*/(new java.util.Date().format("yyyy-MM-dd HH:mm"))),format.raw/*6.62*/("""
"""),format.raw/*7.1*/("""</footer>"""))
      }
    }
  }

  def render(lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply()(lang)

  def f:(() => (Lang) => play.twirl.api.HtmlFormat.Appendable) = () => (lang) => apply()(lang)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 23 14:33:02 VET 2018
                  SOURCE: /home/hgonzalez/play-stuff/products/app/views/debug.scala.html
                  HASH: 68a300b099c11113d7e3d876f55d3f03cac6f0d5
                  MATRIX: 727->1|823->26|880->55|927->76|939->80|964->85|1004->99|1019->106|1083->150|1123->164|1192->213|1219->214
                  LINES: 21->1|24->2|27->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|31->7
                  -- GENERATED --
              */
          