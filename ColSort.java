import java.util.Scanner;
class ColSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows ");
        int r=sc.nextInt();
        System.out.print("Enter no of cols ");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
           for(int j=0;j<c;j++)
           {System.out.print("Enter element "+(i+1)+","+(j+1)+":");
           	  a[i][j]=sc.nextInt();
           }
        }
        for(int k=0;k<r;k++)
        {
        	for(int i=0;i<c-1;i++)
        	{
        		for(int j=i+1;j<c;j++)
        			if(a[k][i]>a[k][j])
        			{
        				int t=a[k][i];
        				a[k][i]=a[k][j];
        				a[k][j]=t;
        			}

        	}
        }
        System.out.println("Output:");
        for(int i=0;i<r;i++)
        {	for(int j=0;j<c;j++)
        		System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }

}
