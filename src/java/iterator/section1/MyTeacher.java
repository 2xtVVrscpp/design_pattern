//import Teacher.Teacher;

public class MyTeacher extends Teacher{
    private StudentList studentList;
    public void createStudentList(){
        this.studentList = new StudentList(5);
        studentList.add(new Student("赤井亮太",1));
        studentList.add(new Student("赤羽里美",2));
        studentList.add(new Student("岡田美央",2));
        studentList.add(new Student("西森俊介",1));
        studentList.add(new Student("中ノ森玲菜",2));
    }
	public void callStudents(){
	    int size = studentList.getLastNum();
	    for(int i=0;i<size;i++)
	        System.out.println(studentList.getStudentAt(i).getName());
	}
}