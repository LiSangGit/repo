package exercise;

import java.util.Random;

public class ConstructorTest {
	public static void main(String[] args){
		Employee3[] staff=new Employee3[3];
		staff[0]=new Employee3("harry",3000);
		staff[1]=new Employee3(6000);
		staff[2]=new Employee3();
		
		for(Employee3 e:staff)
		{
			System.out.println("name:"+e.getName()+",id:"+e.getId()+",salary:"+e.getSalary());
		}
	}
}
class Employee3
{
	public Employee3(String aName,double aSalary)
	{
		name=aName;
		salary=aSalary;
	}
	public Employee3(double aSalary)
	{
		this("Employee #"+nextId,aSalary);
	}
	public Employee3()
	{
		
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getId()
	{
		return id;
	}
	private static int nextId;
	private int id;
	private String name="";
	private double salary;
	static
	{
		Random generator=new Random();
		nextId=generator.nextInt(10000);
	}
	{
		id=nextId;
		nextId++;
	}
}
