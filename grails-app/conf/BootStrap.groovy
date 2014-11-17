import sample.Board
import sample.User

class BootStrap {

    def init = { servletContext ->
		
		User user = new User(name: 'admin', email: 'admin@system.com', department:'management').save()
		
		new Board(title:'test1', content:'this is test1', user: user).save()
		
		new Board(title:'test2', content:'this is test2', user: user).save()
		
    }
    def destroy = {
    }
}
