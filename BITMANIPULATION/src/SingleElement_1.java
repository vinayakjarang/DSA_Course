public class SingleElement_1 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,5,5}; // xor gives 0 with 2 same values
        int xor=0; // 2^2 =0
        for(int i=0; i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
