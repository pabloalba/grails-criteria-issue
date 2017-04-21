package hibernate.example

class BootStrap {

    def init = { servletContext ->


      def author1 = new Author(
              name: 'author1'
      )
      author1.save(flush: true, failOnError: true)

      def author2 = new Author(
              name: 'author2'
      )
      author2.save(flush: true, failOnError: true)


      def book1 = new Book(
              name: 'book1',
              author: author1
      )
      book1.save(flush: true, failOnError: true)

      def book2 = new Book(
              name: 'book2',
              author: author2
      )
      book2.save(flush: true, failOnError: true)



    }
    def destroy = {
    }
}
