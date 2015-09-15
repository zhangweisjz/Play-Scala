package models

import play.api.libs.json.Json

/**
 * Created by zhang5 on 9/14/2015.
 */
case class Person(name: String)


object Person{
  implicit val personFormat=Json.format[Person]
}
