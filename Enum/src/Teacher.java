public class Teacher{
	private int id;
	private Branch branch;
	public Teacher(int id, Branch branch){
		setId(id);
		this.branch=branch;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public Branch getBranch() {
	return branch;
}

}