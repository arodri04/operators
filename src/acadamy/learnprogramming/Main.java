package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = "+result);

        int prevResult = result;
        result = result - 1;
        System.out.println("3-1 = " + result);

        result =  result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //give the remainder
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("10 * 3 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        }
        else {
            System.out.println("it is an alien!");
        }

        int Score = 200;

        if (Score == 100) {
            System.out.println("You got the highScore");
        }
        if ((100 > Score) && (Score > 80) ) {
            System.out.println("score is inbetween 100 and 80");
        }
        if ((Score > 100) || (Score < 0)) {
            System.out.println("score out of bounds");
        }

        else {
            System.out.println("less than 80");

        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("not a car");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("Wascar is true");
        }


        //CHALLENGE TIME!
        //create double 20.00
        //create double 80.00
        //add both and multiply by 100.00
        //find remainder of step 3 and 40
        //create bool to true if 4 is 0, false if not
        //sout bool
        //if there is a remainder display message



        double first = 20;
        double second = 80;

        double stepThree = (first + second) * 100; //should be 10000
        System.out.println(stepThree);

        double stepFour = stepThree % 40;


        boolean remainder = (stepFour == 0) ? true : false;
        System.out.println("remainder = " + remainder);

        if (!remainder) {
            System.out.println("got some remainder");
        }













    }
}
