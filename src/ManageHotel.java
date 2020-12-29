import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ManageHotel {
    Map<String, Hotel> list = new HashMap();
    Set<String> keyList = list.keySet();

    public void addPeople(String idCard, Hotel hotel) {
        list.put(idCard, hotel);
    }

    public void disPlayAll() {
        for (String key : keyList) {
            System.out.println(list.get(key));
        }
    }

    public void billPlease(String idCard) {
        for (String key : keyList) {
            if (idCard.equalsIgnoreCase(list.get(key).getPeople().getIdCard())) {
                System.out.println(list.get(key));
                System.out.println("số tiền cần trả là" + list.get(key).getTotalMoney());
                list.remove(list.get(key));
                return;
            }
        }
        System.out.println("không có trong danh sách");

    }


}
