package org.bookstore

class Author {
	
	static hasMany = [books: Book] // one to many

    static constraints = {
    }
}
