public class obj {
    
    int wheels;
    String color;
    float currentfuel;


    obj(String color){
        wheels=4;
        currentfuel=7;
        this.color=color;
    }


   public obj start() {
    if (currentfuel > 8) {
        System.out.println("great fuel!");
    } else if (currentfuel > 4) {
        System.out.println("good fuel!");
    } else {
        System.out.println("low fuel!");
    }
    return this;
}


    public void drive(){
        if(currentfuel<4){
            System.out.println("low fuel!");
        }
        System.out.println("car is driving");
        currentfuel--;
    }

    public void addfuel(float fuel){
        currentfuel+=fuel;
    }

    public obj getfuel(){
        System.out.println(currentfuel);
        return this;
    }
}
