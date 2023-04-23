package studentdetail.dao;

import java.util.List;

import studentdetail.model.Student;

public interface StudentDao {
	
	public void insert(Student student);
	public List<Student> getstudents();
	public void deletestudent(Student student);
	public void updatestudent(Student student);

}
