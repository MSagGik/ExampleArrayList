import java.util.ArrayList;

public class ExampleArrayList {


    public static void main(String[] args) {

        // Создание экземпляра класса ArrayList с именем ссылки name
        ArrayList<String> name = new ArrayList<String>();

        // Добавление элементов в name с помощью метода add
        name.add("Лада");
        name.add("Волга");
        name.add("Шевроле");
        name.add("Мустанг");
        name.add("Рено");

        // Изменение элемента ArrayList с индексом 3
        name.set(3, "Форд");

        // Создание второго экземпляра класса ArrayList с именем ссылки name
        ArrayList<String> nameJapan = new ArrayList<String>();
        nameJapan.add("Сузуки");
        nameJapan.add("Мазда");
        nameJapan.add("Субару");

        // Слияние коллекций
        name.addAll(nameJapan);

        System.out.println(name);
    }
}

