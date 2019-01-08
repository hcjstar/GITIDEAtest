package com.troy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hechaojun
 * @Description: 测试lambda
 * @ClassName: TestLambda
 * @date 2019/1/8 10:33
 */
public class TestLambda {

    List<Employee> emps = Arrays.asList(
            new Employee(23,"张三",4545.22),
            new Employee(53,"李四",5353.22),
            new Employee(19,"王五",1212.32),
            new Employee(33,"马六",4545.22),
            new Employee(45,"田七",5432.22));

    @Test
    public void test1(){
        //List<Employee> employees = filterEmployeeByAge(emps);
        List<Employee> employees = filterEmployeeBySalary(emps);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public List<Employee> filterEmployeeByAge(List<Employee> lists){

        List<Employee> emps = new ArrayList<>();

        for (Employee employee : lists) {
            if (employee.getAge() >= 30){
                emps.add(employee);
            }
        }

        return emps;
    }

    public List<Employee> filterEmployeeBySalary(List<Employee> lists){

        List<Employee> emps = new ArrayList<>();

        for (Employee employee : lists) {
            if (employee.getSalary() >= 5000){
                emps.add(employee);
            }
        }

        return emps;
    }

    //解决方案一 策略模式
    public List<Employee> filterEmployee(List<Employee> lists,MyPredicate<Employee> predicate){
        List<Employee> emps = new ArrayList<>();
        for (Employee employee : lists) {
            if (predicate.test(employee)){
                emps.add(employee);
            }
        }

        return emps;
    }

    @Test
    public void test2(){
        List<Employee> employees = filterEmployee(emps,new FilterEmployeeForAge());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }



    //解决方案二 匿名内部类
    @Test
    public void test3(){
        List<Employee> employees = filterEmployee(emps, new FilterEmployeeForAge() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 20;
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //解决方案三 lambda表达式
    @Test
    public void test4(){
        filterEmployee(emps,(e) -> e.getSalary() >= 5000.00);
    }
}
