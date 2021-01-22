package admin;

import java.util.Scanner;
import java.util.Random;
public class Test2 {
	    static int count;
	    static int count1; 
		private static Scanner scanner;
		public static void main(String[] args) {
			scanner = new Scanner(System.in);
		    System.out.println("请输入生成的随机数的个数:");
		    int n=scanner.nextInt();
	        Random random = new Random();
	        int [] arr = new int[n];//动态初始化一个长度为n的数组
	        for (int i = 0; i <arr.length ; i++) {   // 调用Random 通过遍历的形式为数组赋初值。
	            arr[i]  = random.nextInt(100);
	        }
            System.out.println("排序前:");
	        for (int i = 0; i <arr.length ; i++) {  // 遍历输出数组	       
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	          for (int i = 0; i <arr.length-1 ; i++) {// 通过冒泡排序为数组排序
	            for (int j = 0;j<arr.length-1-i;j++){
	                if (arr[j]>arr[j+1]){
	                    int  temp = arr[j+1];
	                         arr[j+1] = arr[j];
	                         arr[j] = temp;
	                }
	            }
	        }
	           System.out.println("排序后:");
	            for (int i = 0; i <arr.length ; i++) {
	              System.out.print(arr[i] + " ");
	        }
             System.out.println();
             System.out.println("请输入需要查找的元素:");
             int m=scanner.nextInt();
             System.out.println("循环查找:"+"该数在数组中的位置下标是:"+(binarySearch(arr,m)));
             System.out.println("查找成功/失败的次数为:"+count);          
             System.out.println("递归查找:"+"该数在数组中的位置下标是:"+binarySearch(arr,m,0,arr.length-1));
             System.out.println("查找成功/失败的次数为:"+count);
	    }
	    public static int binarySearch(int [] arr,int key){    
	        int low=0;
	        int high = arr.length-1;
	        count = 0;
	        while(low<=high){
	            int middle= (low+high)/2;
	            if(key==arr[middle]){
	            	count++;
	                return middle;	                
	            }else if(key<arr[middle]){
	                high=middle-1;
	                count++;
	            }else{
	                low=middle+1;
	                count++;
	            }
	        }
	             return -1 ;
	    }	    
	    public static int binarySearch(int [] array,int key,int start,int end){
	        int mid=(start+end)/2;
	            count1 = 0;
	        if(key<array[start]||key>array[end]||start>end){
	            return -1;
	        }
	        if(key<array[mid]){
	        	count1++;
	            return binarySearch(array,key,start,mid-1); 	           
	        }else if(key>array[mid]){
	        	count1++;
	            return binarySearch(array,key,mid+1,end);
	        }else{
	        	count1++;
	           return mid;
	        }  
	    }	   
	}



