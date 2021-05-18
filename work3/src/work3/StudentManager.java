package work3;

public class StudentManager extends UserManager{
	
	public void add() 
	{
		
	}
	public void submitAssignment(Student student) {
		System.out.println(student.getFirstName()+ " ödevin başarılı bir şekilde yuklendi!");
	}
	
	public void deleteAssignment(Student student) {
		System.out.println(student.getFirstName()+ " ödevin başarılı bir şekilde  sistemden silindi!");
	}

}
