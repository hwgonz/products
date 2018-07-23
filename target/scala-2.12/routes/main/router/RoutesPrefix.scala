// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hgonzalez/play-stuff/products/conf/routes
// @DATE:Fri Jul 20 14:51:39 VET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
