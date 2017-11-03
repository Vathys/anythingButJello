public class Level1 {
    public int a,b,c,d;         // variablws for problems
    public int extraNumber;     // a spare number that can be taken found later

    public Level1(){
        System.out.println(Problem1());
        System.out.println(Problem2());
        System.out.println(Problem3());
        System.out.println(Problem4());
        System.out.println(Problem5());
    }

    public static int Problem1(){
        int a = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    if(Helper_Class.areDistinctDigits(i,j,k))
                        if(Helper_Class.setNumber(i,j,k) * 8 == Helper_Class.setNumber(i,k,k,k)){
                            a = i + j + k + 8;
                            i = 10;
                            j = 10;
                            k = 10;
                        }
                }
            }
        }
        return a;
    }
    public static int Problem2(){
        int largestNumber = 0;
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c < 10; c++){
                    for(int d = 0; d < 10; d++){
                        if(Helper_Class.setNumber(a,b) + Helper_Class.setNumber(c,d) > largestNumber && Helper_Class.areDistinctDigits(a,b,c,d) != false)
                            largestNumber = Helper_Class.setNumber(a,b) + Helper_Class.setNumber(c,d);
                    }
                }
            }
        }
        return largestNumber;
    }
    public static int Problem3(){
        int x = 0;
        while( Helper_Class.setNumber(1,1,4,x,9) * Helper_Class.setNumber(1,x,8,2,1) != 123456789)
            x++;
       return x;
    }
    public static int Problem4(){
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c < 10; c++){
                    for(int d = 0; d < 10; d++){
                        for(int e = 0; e < 10; e++){
                            if(Helper_Class.setNumber(a,b,e) + Helper_Class.setNumber(a,c,e) + Helper_Class.setNumber(a,d,e) == 2011){
                                return a + b + c + d + e;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public static int Problem5(){
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                for(int z = 0; z < 10; z++){
                    if(Helper_Class.setNumber(x,y,z) * 3 == Helper_Class.setNumber(z,z,z) && Helper_Class.areDistinctDigits(x,y,z) == true){
                        return x * y * z;
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println("\tLevel 1 Problems:");
        new Level1();
        System.out.println("\tLevel 2 Problems:");
        new Level2();
        System.out.println("\tLevel 3 Problems:");
        new Level3();
    }
}
