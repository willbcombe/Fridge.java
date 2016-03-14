
//import java.util.Scanner;
public class UnitConverter{

    final static double NO_CONVERSION = -1;
    final static double SAME_UNIT = 1;
    final static double OUNCES_IN_POUND = 16;
    final static double MILLI = 1000;
    final static double GRAMS_IN_POUND = 453.59237;

    // public static void main(String[] args) {
    //
    //     boolean endProg = false;
    //     double quantity = 0;
    //     String fromUnit = "";
    //     String toUnit = "";
    //     Scanner sc = new Scanner(System.in);
    //     String end = "y";
    //
    //     while(!endProg){
    //         System.out.println("Please enter the unit you are converting from:");
    //         fromUnit = sc.nextLine();
    //         System.out.println("Please enter the unit you are converting to:");
    //         toUnit = sc.nextLine();
    //         System.out.println("Please enter the quantity:");
    //         quantity = sc.nextDouble();
    //         sc.nextLine();
    //         double output = convert(quantity,fromUnit,toUnit);
    //         System.out.printf("%f in %s is equal to %f in %s",quantity,fromUnit,output,toUnit);
    //         System.out.println("Continue? [y/n]");
    //         end = sc.nextLine();
    //         if(end.equals("n")){
    //             endProg = true;
    //         }
    //     }
    // }

    public static double inverse(double num){
        double newNum = Math.pow(num,-1);
        return newNum;
    }

    public static double convert(double quantity, String fromUnit, String toUnit){
        double newQuantity = 0;
        switch(fromUnit){
            case "litres":
            newQuantity = litresTo(toUnit)*quantity;
            break;
            case "millilitres":
            newQuantity = millilitresTo(toUnit)*quantity;
            break;
            case "ounces":
            newQuantity = ouncesTo(toUnit)*quantity;
            break;
            case "pounds":
            newQuantity = poundsTo(toUnit)*quantity;
            break;
            case "grams":
            newQuantity = gramsTo(toUnit)*quantity;
            break;
            case "milligrams":
            newQuantity = milligramsTo(toUnit)*quantity;
            break;
            default:
            newQuantity = NO_CONVERSION;
            break;
        }
        if(newQuantity < 0){
            return NO_CONVERSION;
        }
        else{
            return newQuantity;
        }
    }

    public static double litresTo(String unit){
        double multiplier = 0;
        switch(unit){
            case "litres":
            multiplier = SAME_UNIT;
            break;
            case "millilitres":
            multiplier = MILLI;
            break;
            case "ounces":
            multiplier = NO_CONVERSION;
            break;
            case "pounds":
            multiplier = NO_CONVERSION;
            break;
            case "grams":
            multiplier = NO_CONVERSION;
            break;
            case "milligrams":
            multiplier = NO_CONVERSION;
            break;
            default: break;
        }
        return multiplier;
    }

    public static double millilitresTo(String unit){
        double multiplier = 0;
        switch(unit){
            case "litres":
            multiplier = inverse(MILLI);
            break;
            case "millilitres":
            multiplier = SAME_UNIT;
            break;
            case "ounces":
            multiplier = NO_CONVERSION;
            break;
            case "pounds":
            multiplier = NO_CONVERSION;
            break;
            case "grams":
            multiplier = NO_CONVERSION;
            break;
            case "milligrams":
            multiplier = NO_CONVERSION;
            break;
            default: break;
        }
        return multiplier;
    }

    public static double ouncesTo(String unit){
        double multiplier = 0;
        switch(unit){
            case "litres":
            multiplier = NO_CONVERSION;
            break;
            case "millilitres":
            multiplier = NO_CONVERSION;
            break;
            case "ounces":
            multiplier = SAME_UNIT;
            break;
            case "pounds":
            multiplier = inverse(OUNCES_IN_POUND);
            break;
            case "grams":
            multiplier = inverse(OUNCES_IN_POUND)*GRAMS_IN_POUND;
            break;
            case "milligrams":
            multiplier = inverse(OUNCES_IN_POUND)*MILLI*GRAMS_IN_POUND;
            break;
            default: break;
        }
        return multiplier;
    }

    public static double poundsTo(String unit){
        double multiplier = 0;
        switch(unit){
            case "litres":
            multiplier = NO_CONVERSION;
            break;
            case "millilitres":
            multiplier = NO_CONVERSION;
            break;
            case "ounces":
            multiplier = OUNCES_IN_POUND;
            break;
            case "pounds":
            multiplier = SAME_UNIT;
            break;
            case "grams":
            multiplier = GRAMS_IN_POUND;
            break;
            case "milligrams":
            multiplier = MILLI*GRAMS_IN_POUND;
            break;
            default: break;
        }
        return multiplier;
    }

    public static double gramsTo(String unit){
        double multiplier = 0;
        switch(unit){
            case "litres":
            multiplier = NO_CONVERSION;
            break;
            case "millilitres":
            multiplier = NO_CONVERSION;
            break;
            case "ounces":
            multiplier = inverse(GRAMS_IN_POUND)*OUNCES_IN_POUND;
            break;
            case "pounds":
            multiplier = inverse(GRAMS_IN_POUND);
            break;
            case "grams":
            multiplier = SAME_UNIT;
            break;
            case "milligrams":
            multiplier = MILLI;
            break;
            default: break;
        }
        return multiplier;
    }

    public static double milligramsTo(String unit){
        double multiplier = 0;
        switch(unit){
            case "litres":
            multiplier = NO_CONVERSION;
            break;
            case "millilitres":
            multiplier = NO_CONVERSION;
            break;
            case "ounces":
            multiplier = inverse(MILLI*GRAMS_IN_POUND)*OUNCES_IN_POUND;
            break;
            case "pounds":
            multiplier = inverse(MILLI*GRAMS_IN_POUND);
            break;
            case "grams":
            multiplier = inverse(MILLI);
            break;
            case "milligrams":
            multiplier = SAME_UNIT;
            break;
            default: break;
        }
        return multiplier;
    }
}
