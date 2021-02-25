package ie.gmit;

public class Passenger {

    private String title;
    private String name;
    private int ID;
    private String phone;
    private int age;

    public Passenger(String title, String name, int ID, String phone, int age){
        setTitle(title);
        setName(name);
        setID(ID);
        setPhone(phone);
        setAge(age);
    }

    public String getTitle(){return title;}
    public String getName(){return name;}
    public int getID(){return ID;}
    public String getPhone(){return phone;}
    public int getAge(){return age;}

    public void setTitle(String title){
        if(title =="Mr"|| (title == "Mrs")||(title == "Ms"))
        {
            this.title =title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Title");
        }
    }
    public void setName(String name){
        if(name.length()>=3)
        {
            this.name =name;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Name");
        }
    }
    public void setID(int ID){
        String length = String.valueOf(ID);
        if(length.length() >=10)
        {
            this.ID =ID;
        }
        else
        {
            throw new IllegalArgumentException("Invalid ID");
        }
    }
    public void setPhone(String phone){
        if(phone.length()>=10)
        {
            this.phone =phone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
    }
    public void setAge(int age){

        if(age >=16)
        {
            this.age =age;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Age");
        }
    }
}
