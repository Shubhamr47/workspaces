package String;

public class sub_string {
    public static String getSumString(String str,int si,int ei){
        String subString="";
        for (int i = si; i < ei; i++) {
            subString+=str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str="jayshreeram";
        System.out.println(getSumString(str, 1, 8));
    }
}
