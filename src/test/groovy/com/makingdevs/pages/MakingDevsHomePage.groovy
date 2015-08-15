package com.makingdevs

import geb.*

class MakingDevsHomePage extends Page{

  static at = { title == ". : MakingDevs - Welcome : ." }

  static content = {
    coursesButton(to: MakingDevsCoursesPage){ $("ul.nav a",1) }
  }

}
