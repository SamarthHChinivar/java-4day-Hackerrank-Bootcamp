public class d1a1 
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
            for(int j=i+1; j<5+i+1; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

/*  O/P:
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */