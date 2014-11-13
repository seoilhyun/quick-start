package person

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Face)
class FaceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	/* case.1
	class Face {
		Nose nose
	}
	class Nose {
		static belongsTo = [face:Face]
	}
     */

    void "case.1 many to one save test"() {
		
		new Face(nose:new Nose()).save()
		
		// new Nose(face:new Face()).save() -- error
    }
	
	void "case.2 many to one delete test"(){
		def f = Face.get(1)
		f.delete(); // both Face and Nose deleted
	}
}
