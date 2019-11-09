package DevXDragons;

public class FindArea {
    public static void main(String[] args) {

        int result = findArea(3,2);
        System.out.println("The Area is :  " + result);
       int x= 10;
       int y =5;
       printResult(x,y);
    }

    public static int findArea (int a, int b ){
        return a*b;
    }
    public static void printResult ( int x,int y){
        int sum = 2* (x+y);
        System.out.println("The result is: " + sum);
        return ;
    }
}
