//import com.sun.tools.corba.se.idl.toJavaPortable.Helper;

public class Level2 {

    public Level2(){
        System.out.println(Problem1());
        System.out.println(Problem2());
        System.out.println(Problem3());
        System.out.println(Problem4());
        System.out.println(Problem5());
    }
    public int Problem1() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                for (int z = 0; z < 10; z++) {
                    if (Helper_Class.areDistinctDigits(x, y, z) == true && Helper_Class.setNumber(x, x) + Helper_Class.setNumber(y, y) + Helper_Class.setNumber(z, z) == Helper_Class.setNumber(x, y, z)) {
                        return Helper_Class.setNumber(x, y, z);
                    }
                }
            }
        }
        return 0;
    }
    public int Problem2(){
        for(int a = 1; a < 10; a++){
            for(int b = 1; b < 10; b++){
                if(Helper_Class.setNumber(a,b) * Helper_Class.setNumber(a,a) == Helper_Class.setNumber(b,a,a,b) && a != 0){
                    return Helper_Class.setNumber(a,b);
                }
            }
        }
        return 0;
    }
    public int Problem3(){
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c < 10; c++){
                    for(int d = 0; d < 10; d++){
                        for(int e = 0; e < 10; e++){
                            for(int f = 0; f < 10; f++){
                                if(Helper_Class.setNumber(a,b,c) * 999 == Helper_Class.setNumber(d,e,f,1,3,2)){
                                    //System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
                                    return a + b + c + d + e + f;
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public int Problem4(){
        for(int s = 1; s < 10; s++){
            for(int e = 1; e < 10; e++){
                for(int n = 1; n < 10; n++){
                    for(int d = 1; d < 10; d++){
                        for(int m = 1; m < 10; m++){
                            for(int r = 1; r < 10; r++){
                                for(int y = 1; y < 10; y++){
                                    if(Helper_Class.setNumber(s,e,n,d) + Helper_Class.setNumber(m,0,r,e) == Helper_Class.setNumber(m,0,n,e,y) && Helper_Class.areDistinctDigits(s,e,n,d,m,r,y)) {
                                        //System.out.println(s + " " + e + " " + n + " " + d + " " + m + " " + r + " " + y);
                                        return Helper_Class.setNumber(m,0,n,e,y);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public int Problem5(){
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c < 10; c++){
                    for(int d = 0; d < 10; d++){
                        if(Helper_Class.areDistinctDigits(a,b,c,d) && Helper_Class.setNumber(a,b,c,d) * d == Helper_Class.setNumber(d,c,b,a))
                            //System.out.println(a + " " + b + " " + c + " " + d);
                            return a + b + c + d;
                    }
                }
            }
        }
        return 1;
    }
}
