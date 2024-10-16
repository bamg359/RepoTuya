package school;

public class Student extends User{

    String studentType;


    @Override
    public void createUser() {
        super.createUser();
    }


    @Override
    public void listUser() {
        super.listUser();
    }
    // Sobrecarga de métodos (Method Overload)
    public boolean identifyUser(){

        boolean identified = true;

        return identified;
    }

    public boolean identified(String qr){
        boolean identified = true;

        return identified;
    }
}
