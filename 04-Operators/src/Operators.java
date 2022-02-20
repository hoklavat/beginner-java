public class Operators {

    public static void main(String[] args){

        //basic arithmetic operations
        System.out.println("Addition: 10 + 20 = " + (10 + 20));
        System.out.println("Subtraction: 10 - 20 = " + (10 - 20));
        System.out.println("Multiplication: 10 * 20 = " + (10 * 20));
        System.out.println("Division: 10 / 20 = " + ((double)10 / (double)20));

        int a = 10;
        System.out.println("Self Addition: a += 10 -> a = " + (a +=10 ));
        System.out.println("Self Subtraction: a -= 10 -> a = " + (a -=10 ));
        System.out.println("Self Multiplication: a *= 10 -> a = " + (a *= 10));
        System.out.println("Self Division: a /= 10 -> a = " + (a /= 10));

        //other arithmetic operations
        System.out.println("Remainder: 10 % 7 = " + (10 % 7));
        System.out.println("Self Remainder: a %= 7 -> a = " + (a %= 7));

        //bitwise operations
        a = 1;
        System.out.println("Bitwise AND: 1 & 1 = " + (1 & 1)); //11->1; 10,01,00->0
        System.out.println("Bitwise Self AND: a &= 1 -> a = " + (a &= 1));
        System.out.println("Bitwise OR: 1 | 1 = " + (1 | 1)); //11,10,01->1; 00->0
        System.out.println("Bitwise Self OR: a |= 1 -> a = " + (a |= 1));
        System.out.println("Bitwise Complement: ~1 = " + (~1)); //one's complement. converse all bits, add one. negation.
        System.out.println("Bitwise Self Complement: ~a = " + (~a));
        System.out.println("Bitwise Exclusive OR: 1 ^ 1 = " + (1 ^ 1)); //11,00->0; 10,01->1
        System.out.println("Bitwise Self Exclusive OR: a ^= 1 -> a = " + (a ^= 1));
        System.out.println("Bitwise Shift Left: 1 << 2 : " + (1 << 2)); //001 -> 100
        System.out.println("Bitwise Shift Right: 4 >> 2 : " + (4 >> 2)); //100 -> 001

        //arithmetic comparison
        System.out.println("Greater Than: 10 > 20 : " + (10 > 20));
        System.out.println("Greater Than or Equal: 10 >= 20 : " + (10 >= 20));
        System.out.println("Less Than: 10 < 20 : " + (10 < 20));
        System.out.println("Less Than or Equal: 10 <= 20 : " + (10 <= 20));
        System.out.println("Equal: 10 == 20 : " + (10 == 20));
        System.out.println("Not Equal: 10 != 20 : " + (10 != 20));

        //logical comparison
        System.out.println("AND Comparison: (10<20) && (30<40) -> " + ((10<20) && (30<40))); //11 -> 1
        System.out.println("OR Comparison: (10<20) || (30>40) -> " + ((10<20) || (30>40))); //10 -> 1
        System.out.println("NOT Comparison: !(10<20) -> " + !(10<20)); //!1 -> 0

        //ternary operation
        System.out.println("Ternary: (10 < 20) ? 10 : 20 -> " + ((10 < 20) ? 10 : 20)); //if true left otherwise right.
    }
}
