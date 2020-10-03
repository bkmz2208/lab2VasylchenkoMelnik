public class Car {

    //переменные

    private long id;
    private String company;
    private String model;
    private int year;
    private String color;
    private int price;
    private String registerNumber;

    //Конструктор
    public Car() {

    }

    public Car(long id, String company, String model, int year, String color, int price, String registerNumber) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setRegidterNumber(String registerNumber){
        this.registerNumber=registerNumber;
    }


    public long getId(){
        return this.id;
    }
    public String getCompany(){
        return this.company;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }
    public String getRegisterNumber(){
        return this.registerNumber;
    }
    public String toString(){
        return ("Id: "+ getId()+" Company: "+ getCompany()+" Model: "+getModel()+" Year: "+getYear()+" Color: "+
                getColor()+" Price: "+getPrice()+" RegisterNumber: "+getRegisterNumber());
    }
}