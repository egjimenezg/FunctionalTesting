package com.makingdevs.pages

import geb.*

class GroovyTestingPage extends Page{

  static at = { title == ". : MakingDevs - Pruebas en la JVM con Groovy : ." }

  static content = {
    postTitle{ $(".post-title") }
  }
}
