public abstract class Animals {
    private String weight;
    private int age;
    private String gender;
    private String nickName;
    private String color;

    public Animals() {
    }

    public Animals(String weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Animal:" +
                "weight:" + weight + "->" +
                "age:" + age + "->" +
                "gender:" + gender + "->" +
                "nickName:" + nickName + "\n";
    }
}
