public class Main {
    public static void main(String[] args) {
        Avtor avtor = new Avtor("rollin"," Joan");
        Book gary1 = new Book("gary Poter1",2004,avtor);
        Book gary2 = new Book("gary Poter2",2005,avtor);
        Book avtor5 = new Book("gary Poter3",2006,avtor);
        System.out.println( gary1);
        gary1.setPublicationYear(1467);
        System.out.println(gary1);
        gary1.setTitle("petrov");
        System.out.println(gary1);
      //  System.out.println(gary2.getTitle());
      //  System.out.println(avtor5);



    }
}