package DataStructure.LinkedList;

import DataStructure.HashTable.SimpleHashTable.Employee;

/**
 * Created by Admin on 22.08.2019.
 */
public class Main {

    public static void main(String[] args) {

      Employee janeJones = new Employee("Jane", "Jones", 1);
      Employee jackRusso = new Employee("Jack", "Russo", 2);
        Employee billyBonnes = new Employee("Billy", "Bones", 3);
        Employee tamirJones = new Employee("Tamir", "Jones", 4);
        Employee rockRoker = new Employee("Rock", "Roker", 5);


        EmployeeLinkedList list = new EmployeeLinkedList();

      System.out.println(list.isEmpty());
        list.addToFront(jackRusso);
        list.addToFront(janeJones);
        list.addToFront(billyBonnes);
        list.addToFront(tamirJones);
        list.addToFront(rockRoker);


        System.out.println(list.getSize());

        list.printList();
    }
}
