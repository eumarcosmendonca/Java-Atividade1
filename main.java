/*
Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser.
Assim, o número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex.
*/

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student;
		Set<Student> setCourse = new TreeSet<>();
		
		System.out.print("How many students for course A? ");
		Integer studentsCourseA = sc.nextInt();
		sc.nextLine();
		
		for (Integer i = 0; i < studentsCourseA; i++) {
			
			Integer studentNumber = sc.nextInt();
			sc.nextLine();
			student = new Student(studentNumber);
			setCourse.add(student);
			
		}
		System.out.println();
		
		System.out.print("How many students for course B? ");
		Integer studentsCourseB = sc.nextInt();
		sc.nextLine();
		
		for (Integer i = 0; i < studentsCourseB; i++) {
			
			Integer studentNumber = sc.nextInt();
			sc.nextLine();
			student = new Student(studentNumber);
			setCourse.add(student);
			
		}
		System.out.println();
		
		System.out.print("How many students for course C? ");
		Integer studentsCourseC = sc.nextInt();
		sc.nextLine();
		
		for (Integer i = 0; i < studentsCourseC; i++) {
			
			Integer studentNumber = sc.nextInt();
			sc.nextLine();
			student = new Student(studentNumber);
			setCourse.add(student);
			
		}
		System.out.println();
		
		System.out.println("Total students: " + setCourse.size());
		
		sc.close();

	}

}
