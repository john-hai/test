package Dbd;

import java.util.*;

/**
 *
 50 5
 2 1 2
 5 10 11 12 13 14
 2 0 1
 2 49 2
 4 6 7 8 2
 */
public class Tencent02 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int members = sn.nextInt();
        int group = sn.nextInt();
        Group[] groups = new Group[group];
        HashMap<Integer,Member> hs = new HashMap<>();
        for(int i=0;i<group;i++){
            int mem = sn.nextInt();
            groups[i] = new Group();
            for(int j=0;j<mem;j++){
                int temp = sn.nextInt();
                if(hs.containsKey(temp)){
                    hs.get(temp).groups.add(groups[i]);
                    groups[i].mates.add(hs.get(temp));
                }else{
                    Member newMember = new Member(temp);
                    newMember.groups.add(groups[i]);
                    hs.put(temp, newMember);
                    groups[i].mates.add(newMember);
                }
            }
        }
        HashSet<Integer> res = new HashSet();
        hs.get(0).announce(res);
        System.out.println(res.size());
    }
    private static class Member{
        int id;
        private List<Group> groups = new ArrayList<>();
        private Member(int id){
            this.id = id;
        }
        private void announce(HashSet<Integer> hasAned){
            if(hasAned.contains(id)) return;
            hasAned.add(id);
            for(Group g:groups){
                for(Member m:g.mates){
                    m.announce(hasAned);
                }
            }
        }
    }

    private static class Group{
        private List<Member> mates = new ArrayList<>();
    }

}
