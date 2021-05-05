/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Answer for Question-12: Venkata Gopi Siva Sai Nallapati");
         ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(121, "harry king", 5500));
        list.add(new Employee(122, "newton williams", 8500));
        list.add(new Employee(123, "MS dhoni", 6000));
        list.add(new Employee(124, "chris morris", 3000));
        list.add(new Employee(125, "dane jone", 2800));
        list.add(new Employee(126, "harvey winston", 3300));
        list.add(new Employee(127, "evey Orton", 4500));
        System.out.println("*****Original list*****");
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("******Sorted based on id*****");
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
            }
        });
        System.out.println("******Sorted based on salary****");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return arg0.getEmpName().compareTo(arg1.getEmpName());
            }
        });
        System.out.println("*****Sorted based on name*****");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}
