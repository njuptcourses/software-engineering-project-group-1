/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_vote;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static javax.management.Query.value;
/**
 *
 * @author Hugod
 */
public class IO {
     static int value;
   
     //static File file1 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can1.txt");
     
    //Writing To File System for Can1
     /* public int getVal()
       {
        return value;
       }
       
       public void setId(int val)
       {
           this.value = val;
       }*/
       
    public static void Write1()
    {
      File file1 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can1.txt");
      try{ 
           PrintWriter output;
           output = new PrintWriter(file1);
           output.println(IO.value);
           System.out.println("success");
           output.close();
      }
      catch(IOException ex)
      {
       System.out.println("ErrorF");
      }
    }
    
    //Writing To File System for Can2
    public  void Write2()
    {
        //VoteMain r = new VoteMain();
       File file2 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can2.txt");
      try{ 
       PrintWriter output = new PrintWriter(file2);
       output.println(IO.value);
       output.close();
      }
      catch(IOException ex)
      {
       System.out.println("ErrorF");
      }
    }
    
    
    //Writing To File System for Can3
    public  void Write3()
    {
        VoteMain r = new VoteMain();
       File file3 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can3.txt");
      try{ 
       PrintWriter output = new PrintWriter(file3);
       output.print(IO.value);
       output.close();
      }
      catch(IOException ex)
      {
       System.out.println("ErrorF");
      }
    }
    
    
    public  void Write4()
    {
        VoteMain r = new VoteMain();
       File file4 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can4.txt");
      try{ 
       PrintWriter output = new PrintWriter(file4);
       output.print(IO.value);
       output.close();
      }
      catch(IOException ex)
      {
       System.out.println("ErrorF");
      }
    }
    
    
    
    
    
    public static void Read1()
    {   
        int value;
        File file1 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can1.txt");
        Scanner input;
        try {
            input = new Scanner(file1);
            while (input.hasNext())
            {
             value = input.nextInt();
      // value = Integer.parseInt(val);
               value++;
       System.out.printf("value: %d", value);
          IO.value = value;
          System.out.println("io val:"+ IO.value);
            
           
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
       
    } 
     
     public static void Read2()
    {   
        int value;
        File file2 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can2.txt");
        Scanner input;
        try {
            input = new Scanner(file2);
            while (input.hasNext())
            {
             value = input.nextInt();
      // value = Integer.parseInt(val);
               value++;
       System.out.printf("value: %d", value);
          IO.value = value;
          System.out.println("io val:"+ IO.value);
            
           
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
       
    } 
    

     public static void Read3()
    {   
        int value;
        File file3 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can3.txt");
        Scanner input;
        try {
            input = new Scanner(file3);
            while (input.hasNext())
            {
             value = input.nextInt();
      // value = Integer.parseInt(val);
               value++;
       System.out.printf("value: %d", value);
          IO.value = value;
          System.out.println("io val:"+ IO.value);
            
           
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
    } 
    
    
    
     public static void Read4()
    {   
        int value;
        File file4 = new File ("/Users/apple/NetBeansProjects/LogWithDB/Can4.txt");
        Scanner input;
        try {
            input = new Scanner(file4);
            while (input.hasNext())
            {
             value = input.nextInt();
      // value = Integer.parseInt(val);
               value++;
       System.out.printf("value: %d", value);
          IO.value = value;
          System.out.println("io val:"+ IO.value);
            
           
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args)
    {  int value = 0;
     
    
    
         Read1();
         Write1();
    
    }
    
    
}
