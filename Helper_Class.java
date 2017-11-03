public class Helper_Class {
    
    public static int setNumber(int ... a){
        int finalNumber = 0;
        int len = a.length - 1;
        for (int t : a) {
            finalNumber += t * Math.pow(10, len);        //first in array
            len--;
        }
        return finalNumber;
    }

    public static boolean areDistinctDigits(int ... a){
        int check;
        for(int i = 0; i < a.length - 1; i++) {
            check = a[i];
            for (int p = i + 1; p < a.length; p++) {
                if (a[p] == check) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] switchNum(int pre, int aft, int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] == pre){
                a[i] = aft;
            }
        }
        return a;
    }
}
