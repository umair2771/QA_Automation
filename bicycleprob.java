class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }
    
    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        BiCycle myobj = new BiCycle(); 
        String temp = myobj.define_me();
        System.out.println("My ancestor is a cycle who is "+ temp );
    }
    
}
class bicycleprob{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
}
}