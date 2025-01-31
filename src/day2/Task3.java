/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2;

/**
 *
 * @author kanav
 */
public class Assign3 {
    public static void main(String[] args) {
        
        int n=5;
        
        for(int ind=1;ind<=n;ind++){
        for( int j=1;j<=n;j++){
        if(j==ind|| j==n-ind+1){
        if(j!=ind){
            System.out.print("/");}
        else{ System.out.print("\\");}
        }
        else System.out.print("*");
        }
            System.out.println("");
        }
    }
 
}
