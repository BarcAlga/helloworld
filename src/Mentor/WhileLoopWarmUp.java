package Mentor;

public class WhileLoopWarmUp {
    public static void main(String[] args) {

        String str1 = "kayak";
        // str1.charAt(0)
        //str1 .charAt(str1.length()-1
        int sizeStr = str1.length();
        int index = 0;// We will use it fir each character
        while (index < sizeStr/2){
            char ch1 = str1.charAt(index);
            char ch2 = str1.charAt(sizeStr -1-index);
            if (ch1 == ch2){
                System.out.println(""+ch1 +"==" +ch2);
            }else {
                System.out.println(""+ch1 +"==" +ch2);
                System.out.println("not a palindrome");
                return;
            }
            index++;
        }





    }
}
