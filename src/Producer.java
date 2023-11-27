


import java.util.*;



public class Producer extends  Thread {
    Depot depot ;
    public Producer(Depot depot){
        this.depot = depot ;
    }
            
   
    @Override
    public void run() {
         try{
           while(true){
                 depot.produce();
                 
                Thread.sleep(1000);
             } 
         } catch(Exception exp){
                     
             }
    }
    
    }