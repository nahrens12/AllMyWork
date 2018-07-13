import java.util.ArrayList;

public class MemberHandler {

   static ArrayList<Member> Member = new ArrayList();

    public static void addMember(Member member) {
        Member.add(member);
    }


//    public static void deleteMember(String name) {
//
//        for(int i = 0; i< Member.size(); i++)
//        {
//            if(Member.get(i).getName().equals(name))
//            {
//                Member.remove(i);
//
//            }
//        }
//
//    }


    @Override
    public String toString() {
        return "Member" + Member;
    }
}


