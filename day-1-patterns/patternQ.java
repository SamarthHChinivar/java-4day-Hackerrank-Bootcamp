public class patternQ {
    public static void main(String[] args)
    {
        int n = 11;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i%((n-1)/2)==0 || j%((n-1)/2)==0) //box-condition
                    System.out.print("* ");
                else if(i==j || i+j==n-1) //diagonals-condition
                    System.out.print("* ");
                else if(i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2) //diamond-condition
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}

/*  O/P:
* * * * * * * * * * * 
* *     * * *     * *
*   * *   *   * *   *
*   * *   *   * *   *
* *     * * *     * *
* * * * * * * * * * *
* *     * * *     * *
*   * *   *   * *   *
*   * *   *   * *   *
* *     * * *     * * 
* * * * * * * * * * * 
 */