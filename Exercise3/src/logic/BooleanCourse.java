package logic;

public class BooleanCourse extends Course {
	protected boolean grade;

	public BooleanCourse(String name, boolean grade) {
		super(name);
		this.grade = grade;
	}


	@Override
	public boolean isPassed() {
		if(grade) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "(BooleanCourse): "+super.getName()+", grade: "+grade;
	}

}
