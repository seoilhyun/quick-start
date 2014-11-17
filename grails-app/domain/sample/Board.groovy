package sample

class Board {
	
	String title
	
	String content
	
	User user
	
    static constraints = {
		title(blank: false, nullable: false)
		content(blank: false, nullable: false) 
    }
}
