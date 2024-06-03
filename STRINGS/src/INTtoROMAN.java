public class INTtoROMAN {
    public static void main(String[] args) {
        int a=58;
        String ss="MCMXCIV";
        StringBuilder s=new StringBuilder();
        int b=0;
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        ITOR(a,s,values,symbols);
        RTOI(ss,values,symbols);

    }
    static void RTOI(String ss,int[] values,String[] symbols){
        int ans=0;
        int len=0;
        for(int i=0;i<=symbols.length-1;i++){
            while(ss.startsWith(symbols[i])){
                ans=ans+values[i];
                len= symbols[i].length();
                ss=ss.substring(len);
            }
        }
        System.out.println(ans);

    }
    static void ITOR(int a,StringBuilder s,int[] values,String[] symbols){
        for(int i=0;a>0;i++){
            while(a>=values[i]){
                s.append(symbols[i]);
                a=a-values[i];
            }
        }
        System.out.println(s.toString());
    }
}


        ////TRIED BUT NOT OPTIMAL
//        while(a>0){
//            if(a>=1000){
//                s+="M";
//                a=a-1000;
//            }
//            else if(a>=900){
//                s+="CM";
//                a=a-900;
//            }
//            else if(a>=500){
//                s+="D";
//                a=a-500;
//            }
//            else if(a>=400){
//                s+="CD";
//                a=a-400;
//            }
//            else if(a>=100){
//                s+="C";
//                a=a-100;
//            }
//            else if(a>=90){
//                s+="XC";
//                a=a-90;
//            }
//            else if(a>=50){
//                s+="L";
//                a=a-50;
//            }
//            else if(a>=40){
//                s+="XL";
//                a=a-40;
//            }
//            else if(a>=10){
//                s+="X";
//                a=a-10;
//            }
//            else if(a>=9){
//                s+="IX";
//                a=a-9;
//            }
//            else if(a>=5){
//                s+="V";
//                a=a-5;
//            }
//            else if(a>=4){
//                s+="IV";
//                a=a-4;
//            }
//            else if(a>=1){
//                s+="I";
//                a=a-1;
//            }
//        }
//        System.out.println(s);
