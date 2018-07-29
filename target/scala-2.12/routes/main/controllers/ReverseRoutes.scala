// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hwgonz/play-stuff/products/conf/routes
// @DATE:Sun Jul 29 11:34:45 VET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:9
  class ReverseProductsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def newProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/new")
    }
  
    // @LINE:18
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:9
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:13
    def show(ean:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("ean", ean)))
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseBarcodesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def barcode(ean:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "barcode/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("ean", ean)))
    }
  
  }


}
