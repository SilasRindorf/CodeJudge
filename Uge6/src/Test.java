public class Test {
    public static void main(String[] args) {
        Car2 c = new Car2("Citroen", "SV 34234", "Rød");
        Car2 c2 = new Car2("Citroen", "SK 34233", "Blå");
        Car2 c3 = new Car2("Citroen", "LI 23432", "Rød");
        Car2 c4 = new Car2("Citroen", "SV 34234", "Rød");
        System.out.println(c.getRegno());
        System.out.println(c2.getRegno());
        System.out.println(c3.getRegno());
        System.out.println(c4.getRegno());
        System.out.println(c.getRegno());
        System.out.println(Car2.getNextRegno());
    }
}
