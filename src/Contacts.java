import java.util.Map;
import java.util.TreeMap;
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии. Следует учесть,
// что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

public class Contacts {
    private TreeMap<Integer, String> surnames = new TreeMap<>();
    private TreeMap<Integer, String> numbers = new TreeMap<>();

    public void add(String surname, String number){
        int id = this.surnames.size();
        this.surnames.put(id, surname);
        this.numbers.put(id, number);
    }

    public void get(String searchName){
        for(Map.Entry<Integer, String> surname: surnames.entrySet()){
            if (searchName.equals(surname.getValue()))
            System.out.println("| Фамилия: " + surname.getValue() + " | телефон: " + numbers.get(surname.getKey())+ " |");
        }
    }

    public void printInfo() {
        for(Map.Entry<Integer, String> surname: surnames.entrySet()){
            System.out.println("| Фамилия: " + surname.getValue() + " | телефон: " + numbers.get(surname.getKey())+ " |");
        }
    }
}
