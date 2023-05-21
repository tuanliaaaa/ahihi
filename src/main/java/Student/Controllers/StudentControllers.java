package Student.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Student.Model.Student;
import Student.Repository.StudentRepository;
@RestController
@RequestMapping("/ApiV1")
public class StudentControllers {
	@Autowired
	private StudentRepository studentRepository; 
	
	
	@GetMapping("/AllStudent")
	
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	@PostMapping("/AllStudent")
	public Student postStudent(@RequestBody Student	 student) {
		return studentRepository.save(student);
	}
	@DeleteMapping("/StudentByID/{studentID}")
	public String deleteStudent(@PathVariable String studentID ) {
		Student student = studentRepository.findById(studentID).get();
		studentRepository.delete(student);
		return "thanh công";
	}
	@PatchMapping("/StudentByID/{studentID}")
	public Student patchStudent(@PathVariable String studentID ,@RequestBody Student studentPatch) {
		Student student = studentRepository.findById(studentID).get();
		student.setDate(studentPatch.getDate());
		student.setDate(studentPatch.getDate());
		student.setDate(studentPatch.getDate());
		student.setDate(studentPatch.getDate());
		return studentRepository.save(student);
	}
}
