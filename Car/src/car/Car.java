
package car;

/**
 *
 * @author shep
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    float weight = 1670;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Noodle car";
    
    int inCar = 1;
    int maxNumOfPeopleInCar = 5;
    
    public Car(int customMaxSpeed, float customWeight, boolean customIsTheCarOn, String customNameOfCar){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        nameOfCar = customNameOfCar;
        
    }
    
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() { 
        return this.maxSpeed;
    }
    
    public float getWeight() {
        return this.weight;
    }
    
    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }
    
    
    public void printVariables() {
        System.out.println("The max speed of the car is " + maxSpeed);
        System.out.println("The min speed of the car is " + minSpeed);
        System.out.println("The weight of the car is " + weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
    
    public void bestCondition() {
        maxSpeed = 120;
        nameOfCar = "Shep's Car";
        condition = condition;
        isTheCarOn = true;
        System.out.println("The car is on = " + isTheCarOn);
                
    }
    
    public void lowerCondition() {
        condition = 'C';
        nameOfCar = "Small car";
        maxSpeed = maxSpeed - 10;
    }
    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10 );
    }
    public void getIn() {
        if (inCar < maxNumOfPeopleInCar){
            inCar ++;
            System.out.println("Someone got in");
        
        } else { 
            System.out.println("Car is full" + inCar + "=" + maxNumOfPeopleInCar);
                }
    }
    
    public void getOut() {
        if (inCar > 0){            
            inCar --;
        } else { 
            System.out.println("No one is in the car");
        }
    
        System.out.println(inCar);
    }
    
    public void turnTheCarOn() {
        if (!isTheCarOn){
            isTheCarOn = true;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("First Cr");
        Car myCar = new Car(500, 1000, true, "Noodle Car");
        myCar.getOut();
        myCar.getOut();
        
            

    }
    
}
