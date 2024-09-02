package D_construct;

public class MethodInitMain03 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1",17,92);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2",12,75);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }


}
