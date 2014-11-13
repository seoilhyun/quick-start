package org.bookstore

class Book {
	
	String title
	Date releaseDate
	String ISBN
	
	// static belongsTo = [author: Author] -- The default cascading behaviour is to cascade saves and updates, but not deletes unless a belongsTo is also specified:

    static constraints = {
    }
}
