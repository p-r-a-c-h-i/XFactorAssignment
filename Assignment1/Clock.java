import java.util.Scanner;

class Clock{
    public static double findAngle(int hour, int min)
    {
        // find the position of the hour's hand
        int h = (hour * 360) / 12 + (min * 360) / (12 * 60);
 
        // find the position of the minute's hand
        int m = (min * 360) / (60);
 
        // calculate the angle difference
        int angle = Math.abs(h - m);
 
        // consider the shorter angle and return it
        if (angle > 180) {
            angle = 360 - angle;
        }
 
        return angle;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("hour=");
        int hour = sc.nextInt();
        System.out.print("minutes=");
        int min = sc.nextInt();
        System.out.print(findAngle(hour, min)+"°");
        sc.close();
    }
}