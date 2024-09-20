public class Main {
    public static void main(String[] args)
    {
        int spring = 154;
        int summer = 237;
        int autumn = 149;
        int winter = 218;

        int totalYearlyMainentanceCost = spring + summer + autumn + winter;
        System.out.println("Your seasonly costs were $" + spring + " in Spring," +
                " $" + summer + " in summer, $" + autumn + " in autumn, $" +
                winter + " in winter. And your yearly maintenance costs is $" +
                totalYearlyMainentanceCost + ".");
    }
}
