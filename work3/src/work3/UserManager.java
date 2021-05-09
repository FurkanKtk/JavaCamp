package work3;

public class UserManager {
	//public void Add() {System.out.println("Kullanıcı eklendi " );}
	
	
	public void addStudent(Student student) 
	{
		System.out.println(student.getId()+" id'li öğrenci başarılı bir şekilde eklendi");
	}
	
	public void addInstructor(Instructor instructor) 
	{
		System.out.println(instructor.getId()+" id'li eğitmen başarılı bir şekilde eklendi");
	}
	public void login(User user) 
	{
		System.out.println("siteye "+user.getEmail()+" email adresi ile giriş yaptın.");
	}
	
	public void logout(User user) 
	{
		System.out.println("siteden "+user.getEmail()+" email adresi ile çıkış yaptın.");
	}
	
	public void signup(User user) 
	{
		System.out.println("siteye "+user.getEmail()+" email adresi ile kayıt oldun.");
	}

}
