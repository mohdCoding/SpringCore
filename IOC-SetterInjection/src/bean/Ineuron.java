package bean;

import java.util.ArrayList;

public class Ineuron {

	private Course course = null;
	private ArrayList list = null;

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		System.out.println("Container setting the list");
		this.list = list;
	}

	public void setCourse(Course course) {
		System.out.println("Settin course by container");
		this.course = course;
	}
	
	public Course getCourse() {
		return course;
	}

	
	@Override
	public String toString() {
		return "Ineuron [course=" + course + ", list=" + list + "]";
	}
	
	
}
