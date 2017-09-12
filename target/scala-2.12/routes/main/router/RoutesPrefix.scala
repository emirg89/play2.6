
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/playbase/conf/routes
// @DATE:Sun Sep 10 00:27:27 CEST 2017


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
