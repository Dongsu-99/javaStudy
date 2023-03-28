package Academy;

public class MemberService {
    String id;
    String password;

     boolean login(String id, String password) {
        if (id.equals("hong")   && password.equals("12345") ) {//참조타입에서는 == 아니면 .equals
            return true;
        }else {
            return false;
        }
    }
     static void logout (String id){
        System.out.println("로그아웃 되었습니다");
    }

    public static void main(String[] args) {
        MemberService ms = new MemberService();

        System.out.println(ms.login("hong","12345"));
        System.out.println(ms.login("hong","12346"));
//        System.out.println(logout("d");
    }
}
