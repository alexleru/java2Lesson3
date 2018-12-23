
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1. подсчет повторяющихся контактов");
        task1();

        System.out.println("Задание 2. Справочник котактов");
        Contacts contacts = new Contacts();
        contacts.add("Иванов", "8(916)001-01-01");
        contacts.add("Петров", "8(918)003-03-03");
        contacts.add("Сидоров", "8(915)004-04-04");
        contacts.add("Иванов", "8(916)005-05-05");
        contacts.add("Зельев", "8(917)007-06-06");
        contacts.get("Зельев");
        contacts.get("Иванов");

    }

//    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит список (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.
    private static void task1() {
        final int NUMBER_WORDS = 20; //Кол-во слов.
        Random random = new Random(); //случайная величина, использую при создании слова.
        ArrayList<String> listOfWords = new ArrayList();
        System.out.println("Список слов. Количество: " + NUMBER_WORDS);
        //случайно создаем слова (просто добавляю случайное число)
        for (int i = 0; i < NUMBER_WORDS; i++) {
            String word = "Слово"+random.nextInt(8);
            listOfWords.add(word);
            System.out.println(word);
        }
        //Создаем уникальный массив с помощьью  HashSet
        HashSet<String> listOfUniqWords = new HashSet<>();
        for (String word: listOfWords) {
            listOfUniqWords.add(word);
        }
        //Теперь воспользуемся HasMap, точнее наследника TreeMap для создания пары "Слово", "Как часто встречается"
        TreeMap<String, Integer> listOfWordandFrequency = new TreeMap<>();
        for (String uniqWord : listOfUniqWords){
            int freq = 0;
            for (String word : listOfWords){
                if(uniqWord.equals(word)) freq++;
            }
            listOfWordandFrequency.put(uniqWord, freq);
        }
        System.out.println(listOfWordandFrequency);
    }
}
