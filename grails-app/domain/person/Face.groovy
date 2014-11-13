package person

class Face {
	
	// Nose nose
	
	static hasOne = [nose: Nose] // one to one

    static constraints = {
		nose unique: true
    }
}
