public class Hotel {
    private People people;
    private int numberDay;
    private String kindOfRoom;


    public People getPeople() {
        return people;
    }

    public Hotel(People people, int numberDay, String kindOfRoom) {
        this.people = people;
        this.numberDay = numberDay;
        this.kindOfRoom = kindOfRoom;
    }

    public int setPrice() {
        int price = 0;
        switch (kindOfRoom) {
            case "small":
                price = 1000;
                break;
            case "vip":
                price = 2000;
                break;
            case "super vip":
                price = 4000;
                break;
        }
        return price;
    }

    public int getTotalMoney() {
        return numberDay *setPrice();
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "people=" + people +
                ", numberDay=" + numberDay +
                ", kindOfRoom='" + kindOfRoom + '\'' +"Price= "+setPrice()+
                '}';
    }
}

