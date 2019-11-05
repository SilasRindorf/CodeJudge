public class Magazine1 extends ReadingMatter {
    private int weeknumber;
    public Magazine1 (String thisTitle, long isbnNum, int weeknumber1)
    {
        super(thisTitle, isbnNum);
        weeknumber = weeknumber1;
    }

    public String toString()
    {
        String result = title + "\t" + isbn + "\t" + weeknumber;
        return result;
    }

    public void content()
    {
        System.out.println ("Title: " + title);
        System.out.println ("ISBN: " + isbn);
        System.out.println ("Weeknumber: " + weeknumber);
    }
}
