import java.util.Arrays;

public class DefineingMethods {
    public static void main(String[] args) {
        /*String s="vinayak";
        char[] ch={'a','b','c'};
        String sr=new String("vinayak");
        String str=new String(ch);
        System.out.println(s);
        System.out.println(ch);
        System.out.println(sr);
        System.out.println(str);*/

        /*//charAt method
        String s="vinayak";
        System.out.println(s.charAt(4));*/


        /*//compareTo(() method
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="flag";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//-5
        System.out.println(s3.compareTo(s4));//5
        System.out.println(s1.compareTo(s4));//-1*/

        /*//compareTo() empty
        String s1="helo";
        String s2="";
        String s3="me";
        System.out.println(s1.compareTo(s2));//length 4
        System.out.println(s2.compareTo(s3));//length -2*/



       /* // contains() method
        String name="what do you know about me";
        System.out.println(name.contains("what"));
        System.out.println(name.contains("wht"));
        System.out.println(name.contains("Me"));//case sensitive*/

        /*//equalsIgnoreCase() it ignore case
        String str1 = "Mukesh Kumar";
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Mukesh");
        list.add("RAVI");
        list.add("MuKesH kuMar");
        list.add("Suresh");
        for (String str : list) {
            if (str.equalsIgnoreCase(str1)) {
                System.out.println("Mukesh kumar is present");
            }
        }*/





        String[] s={"dog","racecar","car"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));








    }
}
