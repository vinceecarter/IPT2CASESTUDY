/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

/**
 *
 * @author Asus
 */
public class BIODATA {
    //Vince Garcia Code
    static void Name(String Name) {
    System.out.println(Name);
  }
    static void SchoolName(){
        System.out.println("Tarlac State University");
    }
    static void Campus(){
        System.out.println("San Isidro Campus");
    }
    //Michelle Banaag Code
    static void Year(){
        System.out.println("3rd Year College");
    }
   
    static void Course(){
        System.out.println("Bachelor of Science Major in Information Technology");
    }
    static void Section(){
        System.out.println("Technical Service Management - 3C");
    
   
public static void main(String[] args) {
    //Vince Garcia Code
    System.out.println("---- User Details ----");
       Name("Vince Garcia");
       Name("Michelle Banaag");
       Name("Mark Ian Donato");
       
     System.out.println("---- University ----");
       SchoolName();
       
       System.out.println("---- University ----");
       Campus();
    
    
       //Michelle Banaag Code
       System.out.println("---- Year Level ----");
       Year();
  
        System.out.println("---- Course ----");
        Course();
        
         System.out.println("---- Section ----");
         Section();
       
    }

}
  
