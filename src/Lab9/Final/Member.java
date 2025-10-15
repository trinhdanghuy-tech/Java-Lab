package Lab9.Final;

import java.util.*;

public class Member implements Comparable<Member>{
    private int id;
    private String name;
    private int age;

    public Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Member other) {
        // So sánh theo tuổi trước
        if (this.age != other.age) {
            return Integer.compare(this.age, other.age);
        }
        // Nếu tuổi bằng nhau, so sánh theo tên (alphabet)
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id && age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
    public static void ManageMembers() {
        ArrayList<Member> members = new ArrayList<>();
        Member m1 = new Member(1, "Jack", 18);
        Member m2 = new Member(2, "Jill", 19);
        Member m3 = new Member(3, "Jane", 20);
        Member m4 = new Member(4, "Jane", 21);
        Member m5 = new Member(5, "Nick", 22);
        members.add(m1);
        members.add(m2);
        members.add(m3);
        members.add(m4);
        members.add(m5);
        System.out.println("Sau khi thêm");
        for (Member member : members) {
            System.out.println(member);
        }


    }
    public static void ManageMembers2() {
        HashSet<Member> memberSet = new HashSet<>();
        Member m1 = new Member(1, "Jack", 18);
        Member m2 = new Member(2, "Jill", 19);
        Member m3 = new Member(3, "Jane", 20);
        Member m4 = new Member(4, "Jane", 21);
        Member m5 = new Member(5, "Nick", 22);
        memberSet.add(m1);
        memberSet.add(m2);
        memberSet.add(m3);
        memberSet.add(m4);
        memberSet.add(m5);
        Member m6 = new Member(1, "Tim", 30);
        memberSet.add(m6);
        System.out.println("Sau khi thêm vào HashSet");
        for (Member member : memberSet) {
            System.out.println(member);
        }
    }

    public static void ManageMembers3() {
        TreeSet<Member> memberSet = new TreeSet<>();
        Member m1 = new Member(1, "Jack", 40);
        Member m2 = new Member(4, "Jill", 19);
        Member m3 = new Member(2, "Jane", 32);
        Member m4 = new Member(5, "Jane", 44);
        Member m5 = new Member(3, "Nick", 22);
        memberSet.add(m1);
        memberSet.add(m2);
        memberSet.add(m3);
        memberSet.add(m4);
        memberSet.add(m5);
        Member m6 = new Member(1, "Tim", 30);
        memberSet.add(m6);
        System.out.println("Sau khi thêm vào TreeSet");
        for (Member member : memberSet) {
            System.out.println(member);
        }
    }

    public static void ManageMembers4() {
        HashMap<Integer, Integer> pointMap = new HashMap<>();
        pointMap.put(2, 11);
        pointMap.put(3, 50);
        pointMap.put(4, 78);
        pointMap.put(1, 5);
        pointMap.put(16, 25);

        if (pointMap.containsKey(1)) {
            int currentPoint = pointMap.get(1);
            pointMap.put(1, currentPoint + 10);
        }

        System.out.println("Danh sách điểm thưởng");
        for (Map.Entry<Integer, Integer> entry : pointMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

    public static void ManageMembers5() {
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(7, "Jack", 18));
        members.add(new Member(1, "Jill", 19));
        members.add(new Member(5, "Jane", 20));
        members.add(new Member(4, "Jane", 21));
        members.add(new Member(2, "Nick", 22));

        TreeMap<Integer, String> idNameMap = new TreeMap<>();

        for (Member member : members) {
            idNameMap.put(member.getId(), member.getName());
        }

        System.out.println("TreeMap ID -> Name: ");
        for (Map.Entry<Integer, String> entry : idNameMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        ManageMembers();
        System.out.println("---------------------------------");
        ManageMembers2();
        System.out.println("---------------------------------");
        ManageMembers3();
        System.out.println("---------------------------------");
        ManageMembers4();
        System.out.println("---------------------------------");
        ManageMembers5();
    }
}
