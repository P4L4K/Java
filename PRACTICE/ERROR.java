class AgeNotEligibleException extends Exception{
     public AgeNotEligibleException(String msg){
        super(msg);
     }
}
class ERROR{


public void vote(int age) throws AgeNotEligibleException{
      if (age<18){
        throw new AgeNotEligibleException("AGE GREATER THAN 18");
      }
      else{
        System.out.println("Eligible");
      }
}

public static void main(String args[]){
    ERROR obj=new ERROR();
    try{
        obj.vote(12);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        System.out.println("done!");
    }
}
}