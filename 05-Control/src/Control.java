public class Control {

    public static void main(String[] args){
        int a = 10, b = 20;

        //if-else if-else (comparison)
        System.out.print("if Demo: ");
        if(a > b){
            System.out.println(a + " is greater than " + b + ".");
        }else if (a == b){
            System.out.println(a + " is equal to " + b + ".");
        }else{
            System.out.println(a + " is less than " + b + ".");
        }

        //switch-case-default-break (selection)
        System.out.print("switch Demo: ");
        switch(a){
            case 10:
                System.out.println("a is 10.");
                break;
            case 20:
                System.out.println("a is 20.");
                break;
            case 30:
                System.out.println("a is 30.");
                break;
            default:
                System.out.println("a is unknown.");
                break;
        }

        //for (iteration)
        System.out.print("for Demo: ");
        for(int i = 0; i < a; i++){
            System.out.print(i + " ");
            if(i == a - 3) {
                System.out.print(".\n");
                break;
            }

        }

        //while (loop)
        System.out.print("while Demo: ");
        while(a > 0){
            System.out.print(a + " ");
            if(a == 5){
                System.out.print(".\n");
                break;
            }
            a--;
        }

        //do-while (loop, always executes first block of loop.)
        System.out.print("do-while Demo: ");
        do{
            System.out.print(a + " ");
            if(a == 10){
                System.out.print(".");
                break;
            }
            a++;
        }while(a < 20);
    }

}
