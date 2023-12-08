public class StringBulid {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(0,'s');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.append(2);
        System.out.println(sb);
        StringBuilder sb1=new StringBuilder("Hell");
        for (int i = 0; i <(sb1.length()/2) ; i++) {
            char alphabet= sb1.charAt(i);
            sb1.setCharAt(i,sb1.charAt(sb1.length()-1-i));
            sb1.setCharAt(sb1.length()-1-i,alphabet);
        }
        System.out.println(sb1);
    }
}
