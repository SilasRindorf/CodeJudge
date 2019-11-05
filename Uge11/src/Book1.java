public class Book1 extends ReadingMatter {
    private String author;

    public Book1 (String title, long isbn, String auth)
    {
        super(title,isbn);
        author = auth;
    }
    public String toString()
    {
        return super.toString() + "\t" + author;
    }
    public void content()
    {
        super.content();
        System.out.println ("Author: " + author);
    }
}
