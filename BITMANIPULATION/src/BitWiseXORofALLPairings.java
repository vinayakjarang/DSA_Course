import java.util.ArrayList;

public class BitWiseXORofALLPairings {
    public static void main(String[] args) {
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};
        int xor=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                a.add(nums1[i]^nums2[j]);
            }
        }
        System.out.println(a);
        for(int i=0; i<a.size();i++){
            xor=xor^a.get(i);
        }
        System.out.println(xor);
    }
}
