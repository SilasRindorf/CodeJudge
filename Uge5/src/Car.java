public class Car {
    private String brand;
    private String licenseplate;
    private String color;
    public Car(String brand, String licenseplate, String color) {
        this.brand = brand;
        this.licenseplate = licenseplate;
        this.color = color;
    }
    public String getBrand(String brand) {
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getLicenseplate(String licensplate) {
        return licensplate;
    }
    public void setlicenseplate(String licenseplate){
        this.licenseplate = licenseplate;
    }
    public String getColor(String color) {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString() {
        return '[' + licenseplate + ']' + ' '  + color + ' ' + brand;
    }
    public boolean equals(Car c1) {
        return c1.licenseplate.equals(licenseplate);
    }
    public boolean alike(Car c2) {
        return brand.equals(c2.brand) && color.equals(c2.color);
    }
}