import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
public static void main (String[] args){
    List<Employee> employees = Arrays.asList( /* Условия задачи, создал лист, где добавил новые объекты сотрудников с отделами и именами (Не привык к нему)*/
            new Employee("Ivan", "IT", 5000),
            new Employee("Maria", "HR", 4500),
            new Employee("Ivan", "IT", 5000), // Дубликат
            new Employee("Petr", "IT", 6000),
            new Employee("Anna", "HR", 4700)
    );
    HashMap<String, List<Employee>> map = new HashMap<>();
    for (Employee emp : employees) { // Прошелся по листу

        map.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);// Не понял как работает метод (нейронка написала)
    }


    for (HashMap.Entry<String, List<Employee>> entry : map.entrySet()) {               // Не до конца понимаю как работает Entry и .entrySet()
        System.out.println("Отдел: " + entry.getKey());
        for (Employee emp : entry.getValue()) {
            System.out.println("  " + emp.getName() + " - " + emp.getPukpuk());

        }


    }
//    System.out.println(map.keySet());
//    System.out.println(map.values());
//    System.out.println(map.enrySet());
}



    //: List<Employee> employees = Arrays.asList(
//            new Employee("Ivan", "IT", 5000),
//            new Employee("Maria", "HR", 4500),
//            new Employee("Ivan", "IT", 5000), // Дубликат
//            new Employee("Petr", "IT", 6000),
//            new Employee("Anna", "HR", 4700)
//    );
//
//    Создайте HashMap<String, List<Employee>>, где ключ — это отдел (department), а значение — список сотрудников в этом отделе.
//    Выведите содержимое карты в консоль в формате: Отдел: [Список сотрудников].
//    Важно: Используйте метод computeIfAbsent или merge для элегантного добавления элементов, избегая проверок if (map.containsKey(...)).
//




//
//

}
