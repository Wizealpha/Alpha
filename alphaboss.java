import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class alphaboss extends methodTest {
    public static void main(String[] args) {
        //instantiating a record class
        Person obj= new Person(9,"Ade");
        System.out.println(obj.age());
        System.out.println(obj.name());
        
        //instance of a class C that implements an interface A
       C map= new C();
       map.tar();
        
        //creating a multidimentional Array 
        int [][] s=new int[5][7];
        s[0][0] = 4;
        s[0][1] =7;
        System.out.println(Arrays.deepToString(s));
       
        //instance of a class
        soutTest1 obj=new soutTest1(24,"my","name","is");
        System.out.println(obj.x);
        int i=0;
        myMethod1(i);

      //methodTest test=new soutTest1();
       //test.myMethod2();

        
          //creating a list of lists and accessing it wit a for loop 
        int [] list={7,9,0,6};
        List<List<String>> a=List.of(List.of("4","8","6"), List.of("0","23","56"), List.of("78","87","67"));
        String found=null;
        boy:   for (List<String> x : a){
            System.out.println();
            System.out.println();
               for (String v :x){
                System.out.print(v + ",");
                if (v.contains("3")){
                   found=v;
                   break boy
         //creating an ArrayList           
        ArrayList<Integer> x= new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(8);
        x.add(8);
                    

        int i=0;
        while (i<x.size()){
            ++i ;
            System.out.println(x.get(0));
        }

    }


                }





