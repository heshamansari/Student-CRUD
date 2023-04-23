package studentdetail.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import studentdetail.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	public void insert(Student student) {
		String query="insert into studentdetail (Rno, Name, Branch) value(?,?,?)";
		this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getBranch());
		}

	public List<Student> getstudents() {
		// TODO Auto-generated method stub
		String query="select * from studentdetail";
		List<Student> students= this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}
	
	public void deletestudent(Student student) {
		// TODO Auto-generated method stub
		String query="delete from studentdetail where Rno=?";
		this.jdbcTemplate.update(query,student.getId());
	}
	
	public void updatestudent(Student student) {
		// TODO Auto-generated method stub
		String query="update studentdetail set Name=?,Branch=? where Rno=?";
		this.jdbcTemplate.update(query,student.getName(),student.getBranch(),student.getId());
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
