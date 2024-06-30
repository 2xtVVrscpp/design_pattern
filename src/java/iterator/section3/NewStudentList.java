import java.util.Vector;

public class NewStudentList extends StudentList implements Aggregate{
	protected Vector<Student> students;
	public NewStudentList(){
		super();
	}
	public NewStudentList(int studentCount){
		students = new Vector<Student>(studentCount);
	}
	public void add(Student student){
    	students.add(student);
    	last++;
    }
    public Student getStudentAt(int index){
    	return students.get(index);
    }
    public Iterator iterator(){
		return new NewStudentListIterator(this);
	}
    
}