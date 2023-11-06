public class Car {
    private String marka;
    private  String madel;
    private String color;
    private double obem;
    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }
    public  String getMadel(){
        return madel;
    }
    public  void setMadel(String model){
        this.madel = model;
    }
    public  String getColor(){
        return  color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getObem(){
        return  obem;
    }
    public void setObem(double obem){
        this.obem = obem;
    }
    public void rescar(){
        System.out.println("Mашиналар:");
        System.out.println("marka = " + marka);
        System.out.println("madel = " + madel);
        System.out.println("obem = " + obem);
        System.out.println("color = " + color);
    }
}
