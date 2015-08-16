package com.makingdevs.pages

import geb.*

class CourseInfoPage extends Page{

  static at = { $("i.icon-terminal") }

  static content = {
    postTitle{ $(".post-title") }
  }
}
