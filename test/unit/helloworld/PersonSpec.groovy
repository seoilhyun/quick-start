package helloworld

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonSpec extends Specification {

    def setup() {
		def p = new Person(name: "Fred", age: 40, lastVisit: new Date())
		p.save()
    }

    def cleanup() {
    }

    void "get first person"() {
		def p = Person.get(1)
		assert 1 == p.id
	}
	
	void "update person"() {
		def p = Person.get(1)
		p.name = "Bob"
		p.save()
	}
	
	void "delete person"(){
		def p = Person.get(1)
		p.delete()
	}
}
