public class Book1 extends ReadingMatter {
    private String author;

    public Book1 (String title, long isbn, String auth)
    {
        super(title,isbn);
        author = auth;
    }
    public String toString()
    {
        return getTitle() + "\t" + getIsbn() + "\t" + author;
    }
    public void content()
    {
        System.out.println ("Title: " + getTitle());
        System.out.println ("ISBN: " + getIsbn());
        System.out.println ("Author: " + author);
    }
}
