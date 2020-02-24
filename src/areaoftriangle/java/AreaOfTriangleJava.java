/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaoftriangle.java;

/**
 *
 * @author yohar3320
 */
import java.math.*; 
import java.io.*;
public class AreaOfTriangleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lengths [] = new double [3];//variable for lengths of triangle
        double s = 0; //variable for s 
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Type the 3 lengths of a triangle");
        try{
            for (int i=0; i <3; i++){
                lengths[i]= Double.parseDouble(in.readLine());//read and convert into Double
                s = lengths[i] + s; //add values
                }
            s = s/2; //conduct  (a + b + c) / 2
            System.out.println(s);
            double inside = s*(s-lengths[0])*(s-lengths[1])*(s-lengths[2]);//calculate s(s-a)(s-b)(s-c)
            System.out.println((Math.sqrt(inside))*10);
            double area = (Math.round((Math.sqrt(inside))*10));//variable for area, find square root of inside and provides a first decimal place.
            area = area / 10;
            System.out.println("The area of this triangle:" + area ); 
            }catch (IOException e){
                System.out.println("input/output errors occured");
                 
            }
         
    }
    
}

    
    

