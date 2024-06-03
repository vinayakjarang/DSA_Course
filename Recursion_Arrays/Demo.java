import java.util.*;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
//        int[] nums={3,4,5,1,2};
//        int[] num=nums.clone();
//        int a=num.length;
//        Arrays.sort(num);
//        int[] temp=new int[a];
//        for(int i=0;i<a;i++){
//            int k=0;
//            int b=num[0];
//            for (int j=1;j<a;j++){
//                temp[k]=num[j];
//                k++;
//            }
//            temp[k]=b;
//            System.out.println(Arrays.toString(temp));
//            System.out.println(Arrays.toString(nums));
//
//            if(temp.equals(nums)){
//                System.out.println("true");
//            }
//            num=temp;
//
//        }
//        int[] a={1,2,3};
//        int[] b={1,2,3};
//        if(Arrays.equals(a,b)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        int[] nums={1,2,3,4,5};
//        int k=3;
//        int[] temp=new int[nums.length];
//        for(int i=0;i<k;i++){
//            int l=1;
//            temp[0]=nums[nums.length-1];
//            System.out.println(Arrays.toString(temp));
//            System.out.println(temp[0]);
//            for(int j=1;j<nums.length;j++){
//                temp[l]=nums[j-1];
//                System.out.println(nums[j-1]);
//                l++;
//            }
//            System.out.println(Arrays.toString(temp));
//            nums=temp;
//        }
//        int[] arr={1,2,3,4,5};
//        int n=5;
//        int[] temp=new int[n];
//        temp[n-1]=arr[0];
//        int k=0;
//        for (int i=1;i<n;i++){
//            temp[k]=arr[i];
//            k++;
//        }
//        arr=temp;
//        System.out.println(Arrays.toString(arr));
//        int[] nums={1,2,3,4,5,6,7};
//        int k=3;
//        for(int i=0;i<k;i++){
//            int l=1;
//            int[] temp=new int[nums.length];
//            temp[0]=nums[nums.length-1];
//            System.out.println(temp[0]);
//            System.out.println(Arrays.toString(temp));
//            System.out.println(Arrays.toString(nums));
//            for(int j=1;j<nums.length;j++){
//                temp[l]=nums[j-1];
//                System.out.println(nums[j-1]);
//                l++;
//            }
//            nums=temp;
//            System.out.println(Arrays.toString(nums));
//        }
//        int[] nums={1,2,3,4,5,6,7};
//        int k=3;
//        for(int i=0;i<k;i++){
//            int[] temp=new int[nums.length];
//            int l=1;
//            temp[0]=nums[nums.length-1];
//            for(int j=1;j<nums.length;j++){
//                temp[l]=nums[j-1];
//                l++;
//            }
//            nums=temp;
//        }
//        System.out.println(Arrays.toString(nums));
//        Integer[] nums={1,2,3,4,5,6,7};
//        Collections.reverse(Arrays.asList(nums));
//        System.out.println(Arrays.asList(nums));
        int[] arr={1,2,3,4,5};
        int[] b=new int[arr.length];
        int a=0,c=0;
        for (int i:arr) {
            System.out.println(i);

        }

    }
}
