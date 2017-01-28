
import org.hibernate.Session;

import com.vcs.factory.SessionFactory;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Session session1 = SessionFactory.getSession();
		System.out.println("Session1 : "+session1.hashCode());

		Student student = (Student) session1.get(Student.class, "1");
		System.out.println(student.getsName());
		session1.close();

		System.out.println("Change the DB data manually");
		Thread.sleep(30000);

		Session session2 = SessionFactory.getSession();
		System.out.println("Session2 : "+session2.hashCode());
		student = (Student) session2.get(Student.class, "1");
		System.out.println(student.getsName());
		System.out.println("Modified Data Replicated here");
		session2.close();

		System.out.println("In First level cache, Num of DB hits=Num of Session Objects");
	}

}
