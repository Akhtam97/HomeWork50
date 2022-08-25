import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Random;

public class HW50 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put(DayOfWeek.MONDAY.name(), 0);
        map.put(DayOfWeek.TUESDAY.name(), 0);
        map.put(DayOfWeek.WEDNESDAY.name(), 0);
        map.put(DayOfWeek.THURSDAY.name(), 0);
        map.put(DayOfWeek.FRIDAY.name(), 0);
        map.put(DayOfWeek.SATURDAY.name(), 0);
        map.put(DayOfWeek.SUNDAY.name(), 0);

        Random rn = new Random();

        for (int i = 0; i<100;i++){
            LocalDate date = LocalDate.ofYearDay(2022,rn.nextInt(365)+1);
            Integer integer = map.get(date.getDayOfWeek().name());
            map.put(date.getDayOfWeek().name(),integer+1);
            System.out.println("Выбран" + date +" , это " + date.getDayOfWeek().name() + ". +1");
        }
        System.out.println(map);
    }
}
