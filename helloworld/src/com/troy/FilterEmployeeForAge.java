package com.troy;

/**
 * @author hechaojun
 * @Description: 2
 * @ClassName: FilterEmployeeForAge
 * @date 2019/1/8 10:48
 */
public class FilterEmployeeForAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return  employee.getAge() >= 30;
    }
}
