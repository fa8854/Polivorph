public class Data {

    private static final String VALID_CHAR= "absdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private Data(){

    }

    public static boolean validate(String login, String password, String confrimPassword){
        try {
            check(login, password, confrimPassword);
        } catch (wrongPasswordException e) {
            throw new RuntimeException(e);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;

    }
    private static void check(String login,
                              String password,
                              String confrimPassword) throws wrongPasswordException, WrongLoginException{
    if(!valedate(login)){
        throw new WrongLoginException("Логин не правельный");
    }
        if(!valedate(password)){
            throw new wrongPasswordException("Пароль не верный");
        }
        if (!password.equals(confrimPassword)){
            throw new wrongPasswordException("Пароль не верный");
        }
    }

    private static boolean valedate(String s){
        if (s.length() > 20){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(!VALID_CHAR.contains(String.valueOf(s.charAt(i)))){
                return false;
            }
        }
        return true;


       
    }



}
