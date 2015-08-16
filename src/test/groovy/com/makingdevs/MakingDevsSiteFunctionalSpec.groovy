package com.makingdevs

import geb.spock.GebReportingSpec
import java.lang.Void as Should
import com.makingdevs.pages.*

class MakingDevsSiteFunctionalSpec extends GebReportingSpec{

  Should "show the available courses"(){
    when:
      to MakingDevsHomePage
    and:
      coursesButton.click()

    then:
      at MakingDevsCoursesPage
  }

  Should "show the course information"(){
    when:
      to MakingDevsCoursesPage
    and:
      groovyCoursesDiv.find("a[href^='${_selectorUrl}").click()

    then:
      at CourseInfoPage
      postTitle.text() == _postTitle
    where:
    _selectorUrl                    | _postTitle
    "/training/groovy-testing"      | "Pruebas en la JVM con Groovy"
    "/training/groovy-essentials"   | "El lenguaje dinámico Groovy"
    "/training/grails-intermediate" | "Productividad con Grails"
    "/training/groovy-intermediate" | "Productividad con Groovy"
  }

}
