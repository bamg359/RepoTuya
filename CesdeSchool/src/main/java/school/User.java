package school;

public class User {

    // Atributos
    private int id;
    private String name;
    private String mail;

    // Constructores

    public User(){

    }




    // Getters and Setters

    public int getId(){
        return this.id;
    }

    public void setId(int id){

        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    // Métodos

    public void createUser(){

        id = 1;

    }

    public void listUser(){


    }


}
