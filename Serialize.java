import java.io.*;

class Person implements Serializable{
	String name;
	int age;

	public Person(String name , int age){
		this.name=name;
		this.age=age;	
	}


	public void ShowInfo(){
	
	System.out.println("name:"+this.name+"\nAge:"+this.age);
	}

}
 
class Serialize{
	public static void main(String[] args) throws IOException{
		
		Person p =new Person("Sandip",21);

		FileOutputStream fos = new FileOutputStream("object.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(p);
		os.close();
		fos.close();
	}
}