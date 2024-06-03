public class SingleElement_3 {
    public static void main(String[] args) {
        int [] a={2,5,4,3,3,2,4,9};
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
        }
        int right=(xor&xor-1)^xor;
        int b1=0,b2=0;
        for (int i = 0; i < a.length; i++) {
            if((right & a[i])!=0){
                b1=b1^a[i];
            }
            else{
                b2=b2^a[i];
            }
        }
        System.out.println(b1+"  "+b2);
    }
}
