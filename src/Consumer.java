

import java.util.Random;


public class Consumer extends Thread{
      Depot depot ;
    public Consumer(Depot depot){
        this.depot = depot ;
    }

    @Override
    public void run() {
       try{
           while(true){
               depot.consume() ;
               
               Thread.sleep(new Random().nextLong()) ;
           }
       }catch(Exception e){
           
       }
    }
    
}
