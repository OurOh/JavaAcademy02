package D_construct;

public class ConstructMain02 {

    public static void main(String[] args) {

        //member2의 점수를 빼도 점수는 호출된다. 생성자 오버로딩
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",16);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
