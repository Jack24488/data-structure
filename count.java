package admin;

public class count {
     public static void main(String args[]){
    	System.out.println("两个正整数的最大公约数为:"+gcd(3,4));
     }
       public static int gcd(int a, int b){
    	    int r=a%b;
    	    if(r==0){
    	    	return b;
    	    }else{
    	    	return gcd(b,r);
    	    }
       }
    	
     }

