public class PatternQuestion {
    public static void main(String []args)
    {
        for (int i= 0; i<= 5 ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=5-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int p=0; p<5; p++)
        {
            for (int q=5-p; q>1; q--)
            {
                System.out.print(" ");
            }

            for (int q=0; q<=p; q++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
