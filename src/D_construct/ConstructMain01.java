package D_construct;

public class ConstructMain01 {

    public static void main(String[] args) {
        // Ctrl + P 단축키 활용하기
        //
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",16,95);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
