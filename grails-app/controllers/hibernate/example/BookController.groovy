package hibernate.example

class BookController {
    static responseFormats = ['json']

    def index() {

			def c = Book.createCriteria()
			// If you comment the next line, there is no error
			def unusedList = c.list {}

			def authors = Author.list()
			respond authors

		}



}
