package day03;
@SuppressWarnings("all")
public class Demo06 {
    public static void main(String[] args) {
        String s = new String("123456");
        System.out.println(reverse_2(s));
    }
    //使用charAt方法
    public static String reverse_1(String str){
        String newString = "";
        for (int i = str.length()-1;i>=0;i--){
            newString+=str.charAt(i);
        }
        return newString;
    }
    //转换为字符数组
    public static String reverse_2(String str){
        char[] chars = str.toCharArray();
        int startIndex = 0;
        int endIndex = chars.length-1;
        for (;startIndex<=endIndex;startIndex++,endIndex--){
            char temp;
            temp = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = temp;
        }
        String newString = new String(chars);
        return newString;
    }
}
