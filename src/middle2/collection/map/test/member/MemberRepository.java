package middle2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, String> map = new HashMap<>();

    public void save(Member member) {
        map.put(member.getId(), member.getName());
    }

    public Member findById(String id) {
        String name = map.get(id);
        if (name == null) return null;
        return new Member(id, name);
    }

    public Member findByName(String name) {
        String id = "";
        for (String s : map.keySet()) {
            if (map.get(s).equals(name)) {
                id = s;
            }
        }
        if (id.equals("")) return null;
        return new Member(id, name);
    }

    public void remove(String id) {
        map.remove(id);
    }

}
