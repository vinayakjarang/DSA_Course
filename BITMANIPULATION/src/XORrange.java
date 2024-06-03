public class XORrange {
    public static void main(String[] args) {
        /*int a=4; // brute force aproch
        int xor=0;
        for (int i = 1; i <=a; i++) {
            xor=xor^i;
        }
        System.out.println(xor);*/

        int a=8;                     // range from 0 to n
        System.out.println(fun(a));
        int l=4,r=10;                // range from left to right
        int xor=fun(l-1)^fun(r);
        System.out.println(xor);
    }
    static int fun(int a){
        if(a%4==0){
            return a;
        }
        else if(a%4==1){
            return 1;
        }
        else if(a%4==2){
            return a+1;
        }
        else if(a%4==3){
            return 0;
        }
        return 0;
    }
}
