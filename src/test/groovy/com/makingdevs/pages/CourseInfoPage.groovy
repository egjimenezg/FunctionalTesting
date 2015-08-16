package com.makingdevs.pages

import geb.*

class CourseInfoPage extends Page{

  static at = { waitFor{ $("i.icon-terminal") } }

  static content = {
    postTitle{ $(".post-title") }
  }
}
