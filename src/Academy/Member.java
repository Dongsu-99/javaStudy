package Academy;

public class Member {
    String id;
    String name;
    String password;
    int age;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Member() {

    }


    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
        Member user2 = new Member("강자바", "java");
        Member user0 = new Member();
    }
}
