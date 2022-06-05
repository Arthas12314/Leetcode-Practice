public class Solution478 {
    private double radius;
    
    private double x;
    
    private double y;
    
    public Solution478(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x = x_center;
        this.y = y_center;
    }
    
    public double[] randPoint() {
        while (true) {
            double randomX2center = Math.random() * radius * 2 - radius;
            double randomY2center = Math.random() * radius * 2 - radius;
            if (randomX2center * randomX2center + randomY2center * randomY2center <= radius * radius) {
                return new double[] {randomX2center + x, randomY2center + y};
            }
        }
    }
}
