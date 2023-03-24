package spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDetails {
	List <String> skills;
	Set<String>mobiles;
	Map<String, String> marks;
	
	

@Override
public String toString() {
	return "StudentDetails [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
	
	
}

public StudentDetails() {
	super();
	
}

public List<String> getSkills() {
	return skills;
}

public void setSkills(List<String> skills) {
	this.skills = skills;
}

public Set<String> getMobiles() {
	return mobiles;
}

public void setMobiles(Set<String> mobiles) {
	this.mobiles = mobiles;
}

public Map<String, String> getMarks() {
	return marks;
}

public void setMarks(Map<String, String> marks) {
	this.marks = marks;
}

public StudentDetails(List<String> skills, Set<String> mobiles, Map<String, String> marks) {
	super();
	this.skills = skills;
	this.mobiles = mobiles;
	this.marks = marks;
}



}
