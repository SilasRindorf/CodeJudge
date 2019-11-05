public class Test {
    public static void main(String[] args) {
        ReadingMatter[] materials = new ReadingMatter[3];
        materials[0] = new ReadingMatter("Winnie-the-Pooh",140361219L);
        materials[1] = new Book1("The House at Pooh Corner", 9780140361223L, "A. A. Milne");
        materials[2] = new Magazine1("Walt Disney Treasury", 1608866564L, 1);
        for (ReadingMatter readingMatter : materials) {
            System.out.println(readingMatter);
        }
    }
}
