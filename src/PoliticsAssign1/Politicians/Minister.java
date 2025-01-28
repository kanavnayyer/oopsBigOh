/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliticsAssign1;

/**
 *
 * @author kanav
 */
public class Minister extends MP {
   private float ministerSpendLimit=1000000;
   private boolean canBeArrested;

  
   // constuctor
    public Minister(String name, String constituency) {
        super(name, constituency);
        
          
    }
    
    @Override
     boolean doesExceedLimit(){
    return super.spending>ministerSpendLimit;
    // super called
    }
     
     
     @Override// over ridden for minister as in mp also
     boolean canCommisionerArrest(){
         if(
      doesExceedLimit()){
         canBeArrested=true;
         return true;}
         return false;
     }
      public String getName() {
        return super.getName();
    }
// getter
    public String getConstituency() {
        return super.getConstituency();
    }
    
    
    // getter
    public float getSpend(){
    
        return super.spending;
    }
    
   
}
