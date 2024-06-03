public class SingleElement_2 {
    public static void main(String[] args) {
        int[] arr={4,1,1,3,3,5,3,4,1,4};
        int ones=0;
        int twos=0;
        for (int i=0;i<arr.length;i++){
            ones=(ones^arr[i])&~twos;
            twos=(twos^arr[i])&~ones;
        }
        System.out.println(ones);
    }
}
