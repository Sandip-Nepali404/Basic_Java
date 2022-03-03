import java.io.*;

class Deserialize{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("object.txt");
		ObjectInputStream ois =  new ObjectInputStream(fis);

		Person p = (Person) ois.readObject();
		p.ShowInfo();
		ois.close();
		fis.close();
		
		
	}
} 