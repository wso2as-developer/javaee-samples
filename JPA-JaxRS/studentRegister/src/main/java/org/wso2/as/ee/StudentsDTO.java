package org.wso2.as.ee;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Students")
public class StudentsDTO {
    List<StudentDTO> students;

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }

    public StudentsDTO(List<StudentDTO> students) {
        this.students = students;
    }

    public StudentsDTO() {

    }
}
