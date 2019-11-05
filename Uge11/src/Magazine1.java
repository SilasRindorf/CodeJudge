public class Magazine1 extends ReadingMatter {
    private int weeknumber;
    public Magazine1 (String thisTitle, long isbnNum, int weeknumber1)
    {
        super(thisTitle, isbnNum);
        weeknumber = weeknumber1;
    }

    public String toString()
    {
        String result = getTitle() + "\t" + getIsbn() + "\t" + weeknumber;
        return result;
    }

    public void content()
    {
        System.out.println ("Title: " + getTitle());
        System.out.println ("ISBN: " + getIsbn());
        System.out.println ("Weeknumber: " + weeknumber);
    }
}
