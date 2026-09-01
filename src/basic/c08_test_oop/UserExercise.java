package basic.c08_test_oop;

public class UserExercise {
    //Atributos
    private String userName;
    private String password;

    //Constructor
    public UserExercise(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }
    //Metodos
    public void SetUserName(String userName) {
        this.userName = userName;

    }

    public void SetPassword(String password) {
        this.password = password;
    }
    public boolean checkPassword(String inputPassword) {
        // En Java, para comparar Strings se usa .equals() en lugar de ==
        return this.password.equals(inputPassword);
    }

    }
