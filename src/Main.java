

import java.util.ArrayList;
import java.util.Random;



public class Main {

   
    public static void main(String[] args) {
       Depot  D = new Depot(5) ;
       
        
       
       for(int i=0 ; i<Integer.parseInt(args[0]) ; i++)
           new Producer(D).start();
       
        for(int i=0 ; i<Integer.parseInt(args[1]); i++)
            new Consumer(D).start();
       
     
       
       }
      
       
    }
    