package work3;

public class InstructorManager extends UserManager{
	
	public void add() 
	{
		
	}
	
	public void addAssignment(Instructor instructor) 
	{
		System.out.println("Eğitmen "+instructor.getFirstName()+" "+instructor.getLastName()+" sisteme ödev yükledin");
	}
	
	public void checkAttendance(Student student) {
		System.out.println(student.getFirstName()+" " + student.getLastName() + " Bugün dersine katıldı");
	}

}
