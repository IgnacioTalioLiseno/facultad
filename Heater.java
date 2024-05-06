    
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private float temperatura;
    private float min;
    private float max;
    private float increment;
    //hola
    /**
     * Constructor for objects of class Heater
     */
    public Heater(float minTemp, float maxTemp)
    {
        // initialise instance variables
        temperatura=15;
        increment=5;
        min=minTemp;
        max=maxTemp;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public float getTemp(){
        return temperatura;
    }
    
    public float warmer(){
     assert (temperatura+increment<=max):"Peligro, se supero la temperatura maxima";
     temperatura=temperatura+increment;
     return temperatura;
    
     
        }

        
    public float cooler(){
     assert (temperatura-increment>=min):"Peligro, temperatura muy baja";
     temperatura=temperatura-increment;
     return temperatura;
        
    }   
    
    public String cantTemperaturasxtremas(){
    if(temperatura>35){
    return "la temperatura es extrema, es mayor a 35";
    }else if(temperatura<-15){
    return "la temperatura es extrema, es menor a -15";
    }
    else{return "la temperatura es optima";}    
    }
    
} 
