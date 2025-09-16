/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Henry
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int adding2Numbers = add(2, 3);
        int adding4Numbers = add2(1, 2, 3, 4);
        String mgreeting = morningGreeting("Toby Fox");
        String agreeting = afternoonGreeting("Toby Fox");
        float halfNumber = half(17);
        int roundPositive = roundPositiveValueToNearestInteger(8.01);
        int roundNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(adding2Numbers + " | " + adding4Numbers + " | " + mgreeting + " | " + agreeting + " | " + halfNumber + " | " + roundPositive + " | " + roundNegative);
    }

    // 1. add
    public static int add(int number1, int number2){
        return number1 + number2;
    }
    // 2. add
    public static int add2(int number1, int number2, int number3, int number4){
        return add(number1, number2) + add(number3, number4);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好," + name + "!";
    }
    // 5. triple
    public static String triple(String randomLetters){
        return randomLetters + "" + randomLetters + "" + randomLetters + "";
    }
    // 6. half
    public static float half(int number){
        return number / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number){
        double x = -1 * ((int) number - number);
        if (x >= 0.5){
            return (int)number + 1;
        }else if (x < 0.5){
            return (int)number;
        }
        return -1;
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number){
        double x = (int) number - number;
        if (x >= 0.5){
            return (int)number - 1;
        }else if (x < 0.5){
            return (int)number;
        }
        return -1;
    }

}
