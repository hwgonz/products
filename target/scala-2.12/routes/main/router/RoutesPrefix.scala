// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hwgonz/play-stuff/products/conf/routes
// @DATE:Sun Jul 29 11:34:45 VET 2018


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
