public class People {
    private String name;
    private String birthday;
    private String idCard;

    public People(String name, String birthday, String idCard) {
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", idCard=" + idCard +
                '}';
    }
}
