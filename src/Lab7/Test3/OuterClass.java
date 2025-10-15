package Lab7.Test3;

public class OuterClass {
    private String name;
    private int age;

    public OuterClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static class InnerClass {
        private String cccd;
        private String address;
        public InnerClass(String cccd, String address) {
            this.cccd = cccd;
            this.address = address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getAddress() {
            return address;
        }

        public void setCccd(String cccd) {
            this.cccd = cccd;
        }
        public String getCccd() {
            return cccd;
        }
    }
}
