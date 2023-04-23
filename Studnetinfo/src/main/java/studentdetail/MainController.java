package studentdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import studentdetail.dao.StudentDaoImpl;
import studentdetail.model.Student;

@Controller
public class MainController {
	
	@Autowired
	private StudentDaoImpl studentdaoimpl;
	
	@RequestMapping("/")
	public String home(Model m)
	{
		List<Student> students=studentdaoimpl.getstudents();
		m.addAttribute("student",students);
		return "index";
	}
	
	@RequestMapping("/add")
	public String addstudent()
	{
		return "add_student";
	}
	
	@RequestMapping(value = "/add-student",method = RequestMethod.POST)
	public String insertstudent(@ModelAttribute Student student)
	{
		studentdaoimpl.insert(student);
		return "redirect:/";
	}

	@RequestMapping("/delete")
	public String deletestudent()
	{
		return "delete_student";
	}
	
	@RequestMapping("/delete-student")
	public String delete(@ModelAttribute Student student)
	{
		studentdaoimpl.deletestudent(student);
		return "redirect:/";
	}
	
	@RequestMapping("/update")
	public String updatestudent()
	{
		return "update_student";
	}
	
	@RequestMapping(value = "/update-student",method = RequestMethod.POST)
	public String update(@ModelAttribute Student student)
	{
		studentdaoimpl.updatestudent(student);
		return "redirect:/";
	}
}
