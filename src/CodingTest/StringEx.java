package CodingTest;

public class StringEx {
    
    public static void main(String[] args) {
        String a = " C#";
        String b = ",C++";
        String c = a.trim() + b;
        double num = Math.random();

        c = c.replace("C#", "java");

        String s[] = c.split(",");
        System.out.println(a.contains("#"));
        System.out.println(c);

        char d = c.charAt(2);
        System.out.println(d);
        System.out.println(num);
    }
}
