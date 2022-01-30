

public class Cars1 {
    private int doors;
    private int wheels;              // These are the fields -- doors, wheels, model, engine, color
    private String model;                               // state and behaviour
    private String engine;
    private String color;

    public void setmodel(String model){
        String carname=model.toLowerCase();
        if(carname.equals("bmw") || carname.equals("benz")) {
            this.model = model;
        }else{
            this.model="invalid model";
        }
    }
    public String getmodel(){
        return this.model;   // return model;  -- same
    }
}
