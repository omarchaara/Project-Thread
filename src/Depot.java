

import java.util.ArrayList;
import java.util.Random;


public class Depot {
    Product product ;
   int size;
   ArrayList<Product> array = new ArrayList() ;  
   

   public Depot(int size ){
             this.size = size ;
         }
   
   public synchronized void produce(){
      if(array.size()<size){
              
             array.add(new Product(new Random().nextInt()));
          System.out.println("the producer produce the data ");  
          if(array.size()>size)
          System.err.println("the array is full ");
       }
      
   }
   
   public synchronized void consume(){
        if(array.size()!=0){
            array.remove(0);
           System.out.println("the consumer  consume the data");   
            
        }
   }
     
  
}