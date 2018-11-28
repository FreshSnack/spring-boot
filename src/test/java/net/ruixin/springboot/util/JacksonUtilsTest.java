package net.ruixin.springboot.util;

import net.ruixin.springboot.entity.Student;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JacksonUtilsTest {

    @Test
    public void readValue() {
        String json = "{\"id\":30,\"name\":\"Tom\",\"address\":\"AnHui\"}";
        Student student = JacksonUtils.readValue(json, Student.class);
        System.out.println(student.getName());
    }

    @Test
    public void readList() {
        String json = "[{\"id\":30,\"name\":\"Tom\",\"address\":\"AnHui\"},{\"id\":20,\"name\":\"Lily\",\"address\":\"shanghai\"}]";
        List<Student> list = Arrays .asList(JacksonUtils.readValue(json, Student[].class));
        list.forEach(student->System.out.println(student.getName()));
    }

    @Test
    public void toJSon() {
        Student student = new Student();
        student.setId(30);
        student.setName("Tom");
        student.setAddress("AnhHui");
        System.out.println(JacksonUtils.toJSon(student));
    }

    @Test
    public void listToJson() {
        Student student1 = new Student();
        student1.setId(30);
        student1.setName("Tom");
        student1.setAddress("Anhui wuhu");
        Student student2 = new Student();
        student2.setId(20);
        student2.setName("Lily");
        student2.setAddress("shanghai");
        System.out.println(JacksonUtils.toJSon(Arrays.asList(student1,student2)));
    }
}