import java.util.*;
 
class BirthStone {
  public static void main(String[] args) {
    float BirthStone;
    Scanner in = new Scanner(System.in);      
 
    System.out.println("What is your birth month? ex. 1 = jan, 2 = feb");
    BirthStone = in.nextInt();
    if (BirthStone == 1)  {
        System.out.println("Your birthstone is garnet!");
    } else if (BirthStone == 2)  {
        System.out.println("Your birthstone is amethyst!");
    } else if (BirthStone == 3)  {
        System.out.println("Your birthstone is aquamarine!");
    } else if (BirthStone == 4)  {
        System.out.println("Your birthstone is diamond!");
    } else if (BirthStone == 5)  {
        System.out.println("Your birthstone is emerald!");
    } else if (BirthStone == 6)  {
        System.out.println("Your birthstone is alexandrite!");
    } else if (BirthStone == 7)  {
        System.out.println("Your birthstone is ruby!");
    } else if (BirthStone == 8)  {
        System.out.println("Your birthstone is peridot!");
    } else if (BirthStone == 9)  {
        System.out.println("Your birthstone is saphire!");
    } else if (BirthStone == 10)  {
        System.out.println("Your birthstone is pink tourmaline!");
    } else if (BirthStone == 11)  {
        System.out.println("Your birthstone is topaz!");
    } else if (BirthStone == 12)  {
        System.out.println("Your birthstone is zircon!");
    } else if (BirthStone < 1)  {
        System.out.println("That's not a month you silly goose!");
    } else if (BirthStone > 12)  {
        System.out.println("That's not a month you silly goose!!");
    }
    
  }
}
