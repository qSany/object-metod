public class Book {
     private String title;
     private int publicationYear ;
     private Avtor avtor ;
     public Book(String title, int publicationYear,Avtor avtor) {
          this.avtor = avtor;
          this.title = title;
          this.publicationYear = publicationYear;
     }

     public String getTitle() {
          return title;
     }

     public int getPublicationYear() {
          return publicationYear;
     }

     public void setPublicationYear(int publicationYear) {
          this.publicationYear = publicationYear;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     @Override
     public String toString() {
          return "Book" +
                  "='" + title + '\'' +
                  ", publicationYear=" + publicationYear +
                  ", avtor=" + avtor +
                  '}';
     }
}
