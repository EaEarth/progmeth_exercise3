package logic;

public class GradedCourse extends Course {
	protected int score;

	public GradedCourse(String name ,int score) {
		super(name);
		this.score = score;
	}

	@Override
	public boolean isPassed() {
		if(score >50) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "(GradedCourse): "+super.getName()+", score: "+score;
	}

}
