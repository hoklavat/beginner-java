public class Main {

    public static void printArray(int[] a){
        System.out.print("Array: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print(".\n");
    }

    public static int[] sortArray(int[] a){
        int[] s = new int[a.length];

        for(int i = 0; i < a.length; i++){
            s[i] = a[i];
        }

        int i = 0;
        while(true){
            if(s[i] > s[i+1]){
                int temp = s[i];
                s[i] = s[i+1];
                s[i+1] = temp;
                i = 0;
                continue;
            }
            if(i < s.length-2) i++;
            else break;
        }
        return s;
    }

    public static void main(String[] args){
        int[] n = {5, 9, 3, 1, 0, 6, 2, 7, 4, 8};

        printArray(n);
        printArray(sortArray(n));

    }
}
