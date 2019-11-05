public class ReadingMatter {
    private String title;
    private long isbn;
    public ReadingMatter(String title, long isbn){
        this.title = title;
        this.isbn = isbn;
    }
    public void content() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
    }
    public String getTitle(){
        return this.title;
    }

    public long getIsbn() {
        return this.isbn;
    }

    public String toString(){
        return title + "\t" + isbn + "\t";
    }
}
