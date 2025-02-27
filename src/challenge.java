public class challenge {
    public static void main(String[] args) {
       double myFirstValue = 80.00d;
       double mySecondValue = 20.00d;
       double myValueTotal = (myFirstValue + mySecondValue) * 100.00d;
       System.out.println("mytotalvalue = " + myValueTotal);
       double myRemainderValue = myValueTotal % 40.00d;
       System.out.println("myremaindervalue = " + myRemainderValue);
       boolean myVariableValue = (myRemainderValue == 0) ? true: false;
       System.out.println("is no remainder" + myVariableValue);
       if(!myVariableValue){
           System.out.println("Got some remainder");
       }
    }
}