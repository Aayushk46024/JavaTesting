public class TestExample {
    public static void main(String []args)
    {
        int a = 10, b = 20, c = 50, d = 30;
        System.out.println((a > b && a > c && a > d) ?
                a : ((b > c && c > d) ?
                b : (c > d ? c : d)));
    }
}

