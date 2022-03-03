import java.io.*;
class Person implements Serializable{
	String name;
	int age;

	public Person(String name , int age){
		this.name=name;
		this.age=age;	
	}


	public void ShowInfo(){
	
	System.out.println("name:"+this.name+"Age:"+this.age);
	}

}
 