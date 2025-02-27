public class IfStatement {
    public static void main(String[] args) {
        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 80;
        if(topScore < 100) {
            System.out.println("you got the highest score!");
        }
        int mySecondTopScore =60;
        if(topScore > mySecondTopScore && topScore < 100){
            System.out.println("Greater than the second top score and less than 100");
        }
        if((topScore > 90) || (mySecondTopScore <= 90)) {
            System.out.println("either both of them are true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }
        String makeCar = "Volkswagen";
        boolean isDomestic = makeCar == "Volkswagen" ? false:true;
        if(isDomestic){
            System.out.println("This car is  domestic to our country");
        }
    }
}
