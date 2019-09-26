package logic;

public abstract class Course implements Cloneable {

	  private String name;

	  public Course(String name){      // ... with constructor
	    this.name = name;
	  }

	  public abstract boolean isPassed();
	  
	  public abstract String toString();
	  
	  public boolean equals (Object o) {
		  if(this == o) {
			  return true;
		  }
		  if(o == null) {
			  return false;
		  }
		  if(!(o instanceof Course)) {
			  return false;
		  }
		  if(this.getClass()!=o.getClass()) {
			  return false;
		  }
		  if(this.getName() == ((Course)o).getName()) {
			  return true;
		  }
		  return false;
	  }
		  
		
		  
	 protected Object clone() {
		try {
			Course c = (Course)super.clone();
			return c;
		}catch(CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	 } 
		  

	  public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  
	}



