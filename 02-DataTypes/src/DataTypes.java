
public class DataTypes {

    public static void main(String[] args){
        boolean d1 = true;
        char d2 = 'A';
        byte d3 = 30;
        short d4 = 40;
        int d5 = 50;
        long d6 = 60;
        float d7 = 70.7F; //default double. use F or f literal at the end.
        double d8 = 80.8;

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
        System.out.println("d4: " + d4);
        System.out.println("d5: " + d5);
        System.out.println("d6: " + d6);
        System.out.println("d7: " + d7);
        System.out.println("d8: " + d8);

        System.out.println("char Limits: " + (long)Character.MIN_VALUE + " - " + (long)Character.MAX_VALUE);
        System.out.println("byte Limits: " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
        System.out.println("short Limits: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
        System.out.println("int Limits: " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
        System.out.println("long Limits: " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
        System.out.println("float Limits: " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
        System.out.println("double Limits: " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);

        d6 = 9223372036854775807L; //default integer. use L or l literal at the end.
        System.out.println("Long Maximum Value: " + d6);

        d2 = '\u0044'; //character literal
        System.out.println("0x0044 Unicode Character: " + d2);

        d5 = (int)d7; //casting.
        System.out.println("Float to Integer: " + d5);
    }

}
