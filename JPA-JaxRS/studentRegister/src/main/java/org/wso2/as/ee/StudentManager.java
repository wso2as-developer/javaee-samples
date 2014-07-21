package org.wso2.as.ee;

import java.util.List;

public interface StudentManager {

    public Student getStudent(int index);

    public Student addStudent(Student student);

    public Student removeStudent(int index);

    public List<Student> getAllStudents();

}
