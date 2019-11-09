package StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuilder sb1 = new StringBuilder("DevX School");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        StringBuilder sb3 = new StringBuilder();
        sb3.append("Name");
        sb3.append(" John\tDoe ");
        sb3.append("\nGrade ").append("\"A\" ").append("\nGPA: ");
        sb3.append(4.0+1+2+4);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("DevX School");
        sb4.insert(4,"<>");
        sb4.insert(13,"!!!");
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("DevX School");
        sb5.delete(0,4);
        System.out.println(sb5);


        StringBuilder sb6 = new StringBuilder("DevX School");
        sb6.delete(sb6.indexOf("X"),sb6.indexOf("o"));
        System.out.println(sb6);

        StringBuilder sb7 = new StringBuilder("1000000");
        sb7.deleteCharAt(5);
        System.out.println(sb7);

        StringBuilder sb8 = new StringBuilder("1000000");
        sb8.deleteCharAt(sb8.indexOf("0"));
        System.out.println(sb8);

        StringBuilder sb9 = new StringBuilder("Google Chrome");
        sb9.deleteCharAt(1);
        sb9.deleteCharAt(sb9.indexOf("o"));
        System.out.println(sb9);

        String str = " Chicago 2019";

        StringBuilder sb10 = new StringBuilder(str);
        System.out.println(sb10.append("DevX School"));
        System.out.println(str);
        sb10.reverse();
        System.out.println(sb10);


    }

  //  public void printSomething
}
