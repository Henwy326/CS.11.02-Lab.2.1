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
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add2(int a, int b, int c, int d){
        return add(a, b) + add(c,d);
    }
    // 3. morningGreeting
    public static String morningGreeting(String a){
        return "早上好, " + a + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String a){
        return "下午好," + a + "!";
    }
    // 5. triple
    public static String triple(String a){
        return a + "" + a + "" + a + "";
    }
    // 6. half
    public static float half(int a){
        return a / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        double x = -1 * ((int) a - a);
        if (x >= 0.5){
            return (int)a + 1;
        }else if (x < 0.5){
            return (int)a;
        }
        return -1;
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        double x = (int) a - a;
        if (x >= 0.5){
            return (int)a - 1;
        }else if (x < 0.5){
            return (int)a;
        }
        return -1;
    }

}
