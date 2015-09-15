package models

import sorm._


/**
 * Created by zhang5 on 9/14/2015.
 */
object DB extends Instance(entities = Seq(Entity[Person]()), url="jdbc:h2:mem:test"){

}
