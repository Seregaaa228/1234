import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.Integer.parseInt;


public class TreeSetTask {
    public static void main(String[] args) throws IOException {
        Comparator<Worker> workersComparator = new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o1.getSalary() > o2.getSalary()) {
                    return -1;
                } else if (o2.getSalary() > o1.getSalary()) {
                    return 1;
                }
                return 0;
            }
        };


        TreeSet<Worker> worker = new TreeSet<>(workersComparator);


        Scanner scanner = new Scanner(System.in);



        System.out.println("Напишите данные сотрудника");
        System.out.println("Имя, Зарплата");

        while (true) {

            String s = scanner.nextLine();
            String j = scanner.nextLine();


            if (s.equals("")) break;
            worker.add(new Worker(s, parseInt(j)));
            System.out.println("Сотрудник Добавлен");

        }
        for(Worker p : worker){

            System.out.println(p.getName() + " " + p.getSalary());
        }





    }


}




