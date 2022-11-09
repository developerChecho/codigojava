public class User extends account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public User(String name,String document, String email, String password, Integer id){

    }
       void printDataUser(){
           System.out.printf("User name: "+ name + "User document: " + document + "User email: " + email +"User password: " +
                   password);
       }
    }