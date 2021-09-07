class Main {
  public static void main(String[] args) {

  int totalCandies;
  totalCandies = 55 * 11;

  double blue;
  blue =  .24 * totalCandies;

  double brown;
  brown = .13 * totalCandies;

  double green;
  green = .16 * totalCandies;

  double orange;
  orange = .20 * totalCandies;

  double red;
  red = .13 * totalCandies;

  double yellow;
  yellow = .14 * totalCandies;

  double sumCandies;
  sumCandies = blue + brown + green + orange + red + yellow;



    System.out.println("M&M Color Counts");
    System.out.println("blue:" + blue);
    System.out.println("brown:" + brown);
    System.out.println("green:" + green);
    System.out.println("orange:" + orange);
    System.out.println("red:" + red);
    System.out.println("yellow:" + yellow);
    System.out.println("sumCandies:" + sumCandies);
    
    if (blue < brown & red > orange)
    System.out.println("Blue under brown and Red over Orange");

    if (brown >= green)
    System.out.println("Brown is greater than or equal to Green");

    if (sumCandies == totalCandies)
    System.out.println("Numbers match");

  }
}