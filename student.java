package entities;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private Integer studentNumber;

	public Student(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public int compareTo(Student other) {
		return this.studentNumber.compareTo(other.getStudentNumber());
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNumber, other.studentNumber);
	}
	
}
