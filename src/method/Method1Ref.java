package method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum = add(1,2);
        System.out.println("sum = " + sum);

        int sum2 = add(10,20);
        System.out.println("sum2 = " + sum2);

    }

    public static int add(int x, int y) {
        System.out.println(x+"+"+y+"의 합산은 ?");
        return x+y;
    }
}
