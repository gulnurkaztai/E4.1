public class InMilimeters{
    private double width;
    private double height;

    public double letterInMilimeters(double width, double height){
        this.width = width * 25.4;
        this.height = height * 25.4;
        double perimeter = 2*(this.width + this.height);
        double diagonal = Math.sqrt(Math.pow(width, 2)+ Math.pow(height, 2));
        return 
    }
}