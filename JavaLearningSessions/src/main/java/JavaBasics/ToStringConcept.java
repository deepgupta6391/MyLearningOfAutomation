package JavaBasics;

public class ToStringConcept {

	String name;
	String course;
	String time;

	public ToStringConcept() {

	}

	public ToStringConcept(String name, String course, String time) {
		this.name = name;
		this.course = course;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Training [name=" + name + ", course=" + course + ", time=" + time + "]";
	}

	public static void main(String[] args) {
		ToStringConcept tr = new ToStringConcept("Deeps","Java","1:37");
		System.out.println(tr.toString());
		System.out.println(tr.name);
		
		ToStringConcept tr1=new ToStringConcept();
		System.out.println(tr1.toString());

	}

}
