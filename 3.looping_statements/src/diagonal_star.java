import java.util.Scanner;

public class diagonal_star {
    public static void main(String[] args){
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        for(int row=1;row<=number;row++){
            for(int col=1;col<=number;col++){
                if(row==1 || col==1 || row==number || col==number){
                    System.out.print("*");
                }else if(row==col){
                    System.out.print("*");
                }else if(col==(number-row+1)){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//EXAMPLE 1
//printSquareStar(5); should print the following:
//*****
//** **
//* * *
//** **
//*****
//
//Explanation:
//*****   5 stars
//** **   2 stars space 2 stars
//* * *   1 star space 1 star space 1 star
//** **   2 stars space 2 stars
//*****   5 stars
//
//EXAMPLE 2
//printSquareStar(8); should print the following:
//********
//**    **
//* *  * *
//*  **  *
//*  **  *
//* *  * *
//**    **
//********
//