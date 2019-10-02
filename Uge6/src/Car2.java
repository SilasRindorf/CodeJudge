public class Car2 {
    private String brand;
    private String licenseplate;
    private String color;
    private int regno;
    private static int count;

    public Car2(String brand, String licenseplate, String color) {
        this.brand = brand;
        this.licenseplate = licenseplate;
        this.color = color;
        count++;
        regno = count;
    }
    public int getRegno(){
        return regno;
    }
    public static int getNextRegno(){
        return count + 1;
    }

    public String getBrand(String brand) {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String l) {
        licenseplate = l;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return '[' + licenseplate + ']' + ' ' + color + ' ' + brand;
    }

    public boolean equals(Car2 c1) {
        return c1.licenseplate.equals(licenseplate);
    }

    public boolean alike(Car2 c2) {
        return brand.equals(c2.brand) && color.equals(c2.color);
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
