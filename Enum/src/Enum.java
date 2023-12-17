
public class Enum {

	public static void main(String[] args) {
		Teacher mTeacher = new Teacher(1, Branch.MATH);
	    Teacher pTeacher = new Teacher(2, Branch.PHYSICS);
	    Teacher cTeacher = new Teacher(3, Branch.CS);
	    Teacher eTeacher = new Teacher(4, Branch.ENG);
		
		Teacher[] teachers = {mTeacher, pTeacher, cTeacher, eTeacher};
		for(Teacher teacher: teachers) {
			System.out.println("Teacher ID: " + teacher.getId());
			System.out.println("Branch: " + teacher.getBranch()+ ": "+teacher.getBranch().getScore());
		}
	}

}
