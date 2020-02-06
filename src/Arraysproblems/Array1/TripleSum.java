package Arraysproblems.Array1;

import java.util.Scanner;

public class TripleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        tripletSum(arr,x);

	}
	public static void tripletSum(int[] input, int x){
		
        for(int i=0;i<input.length;i++){
            for(int j=i;j<input.length;j++){
                for(int k=j;k<input.length;k++){
                if(i!=j && k!=j && input[i]+input[j]+input[k]==x){
                   int arr[] = new int[3];
                    if(input[i]<=input[j] && input[i]<=input[k]){
                     System.out.print(input[i]+", ");
                        if(input[j]<input[k]){
                            System.out.print(input[j]+" and "+input[k]);
                        }else{
                            System.out.print(input[k]+" and "+input[j]);
                        }
                    }else if(input[j]<=input[i] && input[j]<=input[k]){
                        System.out.print(input[j]+", ");
                        if(input[i]<input[k]){
                            System.out.print(input[i]+" and"+input[k]);
                        }else{
                            System.out.print(input[k]+" and "+input[i]);
                        }
                    }else{
                        System.out.print(input[k]+", ");
                        if(input[i]<input[j]){
                            System.out.print(input[i]+" and "+input[j]);
                        }else{
                            System.out.print(input[j]+" and "+input[i]);
                        }
                    }
                    System.out.println();
                }
            }
        }
		}
	}
}
