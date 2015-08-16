package com.makingdevs

import geb.*

class MakingDevsCoursesPage extends Page{

  static url = "/training"

  static at = {
    waitFor{ $(".section-main-header") }
    $(".section-main-header").text() == "Nuestro entrenamiento"
  }

  static content = {
    groovyCoursesDiv{ $(".span7",2).children("ul") }
  }

}
