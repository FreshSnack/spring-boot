package com.amar.demo;

import com.amar.demo.entity.Employee;
import com.amar.demo.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author dingmx
 * @date 2019/1/8 21:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.amar.demo.app.JpaApplication.class)
public class JpaApplicationTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void testEmployeeRep() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setAge(10);
        employee.setGender("man");
        employee.setName("LiMing");
        employeeRepository.save(employee);
        employee = new Employee();
        employee.setId("2");
        employee.setAge(12);
        employee.setGender("woman");
        employee.setName("Lily");
        employeeRepository.save(employee);
    }

    @Test
    public void deleteEmployeeTest() {
        employeeRepository.deleteById("1");
    }

    @Test
    public void listEmployeeTest() {
        List<Employee> employeeList = employeeRepository.findAll();
        if (employeeList != null && employeeList.size() > 0) {
            for (Employee employee : employeeList) {
                System.out.println(employee.getId() + "|"
                        + employee.getName() + "|" + employee.getAge() + "|" + employee.getGender());
            }
        }
    }

}
