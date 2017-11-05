//import com.sun.tools.corba.se.idl.toJavaPortable.Helper;

public class Level3 {
    public Level3(){
        System.out.println(Problem1());
        System.out.println(Problem2());
        System.out.println(Problem3());
        System.out.println(Problem4());
        System.out.println(Problem5());
    }
    public int Problem1(){
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                for(int z = 0; z < 10; z++){
                    if(Helper_Class.setNumber(x,x,x,x) + Helper_Class.setNumber(y,y,y,y) + Helper_Class.setNumber(z,z,z,z) == Helper_Class.setNumber(y,x,x,x,z) && Helper_Class.areDistinctDigits(x,y,z)){
                        return z;
                    }
                }
            }
        }
        return 0;
    }
    public int Problem2(){
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c < 10; c++){
                    for(int d = 0; d < 10; d++){
                        for(int e = 0; e < 10; e++){
                            if(Helper_Class.setNumber(a,b,c,d,e) * 4 == Helper_Class.setNumber(e,d,c,b,a) && Helper_Class.areDistinctDigits(a,b,c,d,e)){
                                return Helper_Class.setNumber(a,b,c,d,e);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public int Problem3(){
        for(int f = 0; f < 10; f++){
            for(int o = 0; o < 10; o++){
            	if(Helper_Class.areDistinctDigits(f,o))
	                for(int r = 0; r < 10; r++){
	                	if(Helper_Class.areDistinctDigits(f,o,r))
		                    for(int t = 0; t < 10; t++){
		                    	if(Helper_Class.areDistinctDigits(f,o,r,t))
			                        for(int y = 0; y < 10; y++){
			                        	if(Helper_Class.areDistinctDigits(f,o,r,t,y))
				                            for(int e = 0; e < 10; e++){
				                            	if(Helper_Class.areDistinctDigits(f,o,r,t,y,e))
					                                for(int n = 0; n < 10; n++){
					                                	if(Helper_Class.areDistinctDigits(f,o,r,t,y,e,n))
						                                    for(int s = 0; s < 10; s++){
						                                    	if(Helper_Class.areDistinctDigits(f,o,r,t,y,e,s))
							                                        for(int i = 0; i < 10; i++){
							                                        	if(Helper_Class.areDistinctDigits(f,o,r,t,y,e,s,i))
								                                            for(int x = 0; x < 10; x++){
								                                                if(Helper_Class.setNumber(f,o,r,t,y) + (Helper_Class.setNumber(t,e,n) * 2) == Helper_Class.setNumber(s,i,x,t,y) && Helper_Class.areDistinctDigits(f,o,r,t,y,e,n,s,i,x)){
								                                                    return Helper_Class.setNumber(f,o,r,t,y) + Helper_Class.setNumber(t,e,n) + Helper_Class.setNumber(s,i,x,t,y);
								                                                }
								                                            }
							                                        }
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
    public int Problem4(){
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c < 10; c++){
                    for(int d = 0; d < 10; d++){
                        for(int e = 0; e < 10; e++){
                            if(Helper_Class.setNumber(a,b,c,d,e) * 12 == Helper_Class.setNumber(c,d,e,0,a,b) && Helper_Class.areDistinctDigits(a,b,c,d,e)){
                                return Helper_Class.setNumber(a,b,c,d,e);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public int Problem5(){
        final int[] array = {7,4,2,5,8,6,9,3,0};
        final int[] NUM1 = {7,4,2,5,8,6};
        final int[] NUM2 = {8,2,9,4,3,0};
        final int[] ANS = {1,2,1,2,0,1,6};
        int[] num1;
        int[] num2;
        int[] answer;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < NUM1.length; j++){
                num1 = NUM1.clone();
                num2 = NUM2.clone();
                answer = ANS.clone();
                int pre = num1[j];
                int aft = array[i];
                if(pre != aft){
                    num1 = Helper_Class.switchNum(pre, aft, num1);
                    num2 = Helper_Class.switchNum(pre, aft, num2);
                    answer = Helper_Class.switchNum(pre, aft, answer);
                }
                if(Helper_Class.setNumber(num1) + Helper_Class.setNumber(num2) == Helper_Class.setNumber(answer)){
                    return pre + aft;
                }
            }

            for(int j = 0; j < NUM2.length; j++){
                num1 = NUM1.clone();
                num2 = NUM2.clone();
                answer = ANS.clone();
                int pre = num2[j];
                int aft = array[i];
                if(array[i] != num2[j]){
                	 num1 = Helper_Class.switchNum(pre, aft, num1);
                     num2 = Helper_Class.switchNum(pre, aft, num2);
                     answer = Helper_Class.switchNum(pre, aft, answer);
                }

                if(Helper_Class.setNumber(num1) + Helper_Class.setNumber(num2) == Helper_Class.setNumber(answer)){
                    return pre + aft;
                }
            }
        }
        return 0;
    }
}
