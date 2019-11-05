public class Magazine1 extends ReadingMatter {
    private int weeknumber;
    public Magazine1 (String thisTitle, long isbnNum, int weeknumber1)
    {
        super(thisTitle, isbnNum);
        weeknumber = weeknumber1;
    }

    public String toString()
    {
        String result = super.toString() + "\t" + weeknumber;
        return result;
    }

    public void content()
    {
        super.content();
        System.out.println ("Weeknumber: " + weeknumber);
    }
}
