package sample

class User {

	String name;
	
	String email;
	
	String department;
	
    static constraints = {
		name(blank: false, nullable: false)
		email(blank: false, nullable: false)
    }
}
