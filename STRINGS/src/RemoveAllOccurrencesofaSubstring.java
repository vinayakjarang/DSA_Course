public class RemoveAllOccurrencesofaSubstring {
    public static void main(String[] args) {
        String s = "aabababa", part = "aba";
        System.out.println(s.contains(part));
        while(s.contains(part)){
            int index=s.indexOf(part);
            s=s.substring(0,index)+s.substring(index+part.length());
        }
        System.out.println(s);
        System.out.println(s.indexOf('s'));
    }
}
