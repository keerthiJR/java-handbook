import java.util.Scanner;

public class demo10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size!!");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int c[][]=new int[n][n];
        int d[][]=new int[n][n];
        int e[][]=new int[n][n];
        int f[][]=new int[n][n];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                d[i][j]=0;
                for(int k=0;k<a.length;k++) {
                    d[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                e[i][j]=0;
                for(int k=0;k<a.length;k++) {
                    e[i][j] += b[i][k] * c[k][j];
                }
            }
        }


        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(e[i][j]+" ");
            }
            System.out.println();
        }

    }
}