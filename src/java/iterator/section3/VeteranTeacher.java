public class VeteranTeacher extends Teacher{
	private NewStudentList list;
	public void createStudentList(){
		list = new NewStudentList(3);
		list.add(new Student("中川雄介",1));
		list.add(new Student("板東恵美",2));
		list.add(new Student("水島太郎",1));
	}
	public void callStudents(){
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(((Student)itr.next()).getName());
		}
	}		
}