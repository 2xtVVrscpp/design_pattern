public class NewStudentListIterator implements Iterator{
    private NewStudentList newStudentList;
    private int index;
    public NewStudentListIterator(NewStudentList list){
        this.newStudentList = list;
        this.index = 0;
    }
    public boolean hasNext(){
        if(newStudentList.getLastNum() > index){
            return true;
        }else{
            return false;
        }
    }
    public Student next(){
        Student s =  newStudentList.getStudentAt(index);
        index++;
        return s;
    }
}