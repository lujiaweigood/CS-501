import java.util.Scanner;

public class C4E3GeographyEstimateAreas {

    static double averageEarthRadius = 6371.01;

    public static void main(String[] args) {
        String intro = "Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina to compute the estimated area enclosed by these four cities.";
        System.out.println(intro);
        System.out.println("Input location from latitude and longitude from Atlanta, Georgia -84.3880, 33.7490");
        double atlantaGeorgiaY = -84.3880;
        double atlantaGeorgiaX = 33.7490;

        System.out.println("Input location from latitude and longitude from Orlando, Florida -81.3789, 28.5384");
        double orlandoFloridaY = -81.3789;
        double orlandoFloridaX = 28.5384;

        System.out.println("Input location from latitude and longitude from Savannah, Georgia -81.0912, 32.0809");
        double SavannahGeorgiaY = -81.0912;
        double SavannahGeorgiaX = 32.0809;

        System.out.println("Input location from latitude and longitude from Charlotte, North Carolina -80.8431, 35.2271");
        double charlotteNorthCarolinaY = -80.8431;
        double charlotteNorthCarolinaX = 35.2271;

        System.out.println("Compute the distance between two cities and divide the polygon into two triangles");
        System.out.println("Triangle1 Atlanta, Georgia, Savannah, Georgia and Charlotte, North Carolina");
        double triangle1Side1 = distanceBetweenTwoPoints(atlantaGeorgiaX, atlantaGeorgiaY, SavannahGeorgiaX, SavannahGeorgiaY);
        double triangle1Side2 = distanceBetweenTwoPoints(SavannahGeorgiaX, SavannahGeorgiaY, charlotteNorthCarolinaX, charlotteNorthCarolinaY);
        double triangle1Side3 = distanceBetweenTwoPoints(charlotteNorthCarolinaX, charlotteNorthCarolinaY, atlantaGeorgiaX, atlantaGeorgiaY);
        System.out.println("Triangle2 Atlanta, Georgia, Savannah, Georgia and Orlando, Florida");
        double triangle2Side1 = distanceBetweenTwoPoints(atlantaGeorgiaX, atlantaGeorgiaY, orlandoFloridaX, orlandoFloridaY);
        double triangle2Side2 = distanceBetweenTwoPoints(orlandoFloridaX, orlandoFloridaY, SavannahGeorgiaX, SavannahGeorgiaY);
        double triangle2Side3 = distanceBetweenTwoPoints(SavannahGeorgiaX, SavannahGeorgiaY, atlantaGeorgiaX, atlantaGeorgiaY);


        double area1 = getTriangleArea(triangle1Side1, triangle1Side2, triangle1Side3);
        double area2 = getTriangleArea(triangle2Side1, triangle2Side2, triangle2Side3);
        System.out.printf("Triangle 1: %f -- %f -- %f   : area = %f\n", triangle1Side1, triangle1Side2, triangle1Side3, area1);
        System.out.printf("Triangle 2: %f -- %f -- %f   : area = %f\n", triangle2Side1, triangle2Side2, triangle2Side3, area2);
        double totalArea = area1 + area2;
        System.out.println("The area of the triangle is " + totalArea);

    }

    public static double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {

        double distance = averageEarthRadius *
                Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

        return distance;
    }

    public static double getTriangleArea(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

}