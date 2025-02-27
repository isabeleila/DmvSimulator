import java.util.Random;

public class DmvSimulator{
    public static void main (String args[]){
        System.out.println("Hi, welcome to the DMV!");
        
        Random chance =  new Random();
        double messageChance = chance.nextDouble(1);

        Random rand = new Random();
        int randNum = rand.nextInt(200) +1;
        System.out.println("Your number in line is " + randNum);
        
        int currentNum = randNum +1;

        while (currentNum != randNum){
            System.out.println("Next up is: " + currentNum + "!");

            if (currentNum == 200){
                currentNum = 1;
            } else{
                currentNum++;
            }
        } System.out.println("Your number has been called!");
        if (chance.nextDouble() < 0.99){
            System.out.println("You do not have the required paperwork, get out of the line and never return!");
        } else{
            System.out.println("You have all of the required paperwork! You're all set, have a nice day.");
        }
    }
}