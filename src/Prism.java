public class Prism {
    private double height;      
    private double sideLength; 

    public Prism(double height, double sideLength) {
        this.height = height;
        this.sideLength = sideLength;
    }
    
    public double calculateLateralSurfaceArea() {
        return 3 * sideLength * height;
    }

    public double calculateVolume() {
        double triangleArea = (Math.sqrt(3) / 4) * sideLength * sideLength;
        return triangleArea * height;
    }
    public void print() {
        System.out.println("Lateral surface area: " + calculateLateralSurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}
