import models.Book;

public class BookRunner {

    public static void main(String[] args)
    {
        System.out.println("Exercicio1");

        Book book1 = new Book();
        book1.setTitulo("The Art Of Computer Programming");
        Book book2 = new Book();
        book2.setTitulo("Effective Java");
        Book book3 = new Book();
        book3.setTitulo("Clean Code");


        System.out.println(String.format(  "Name : %s", book1.getTitulo()));
        System.out.println(String.format( "Name : %s", book2.getTitulo()));
        System.out.println(String.format( "Name : %s", book3.getTitulo()));
    }
}

