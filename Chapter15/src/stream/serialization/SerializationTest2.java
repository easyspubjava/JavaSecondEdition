package stream.serialization;


import java.io.*;

/*
class Person {
	
	String name;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
*//*
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}
	*//*
}*/


class Person2 implements Serializable{

	@Serial
	private static final long serialVersionUID = 8307928265648849333L;

	String name;
	String job;
	int i;
	int j;
	
	public Person2() {}

	public Person2(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
}

public class SerializationTest2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

	    Person personAhn = new Person("안재용", "대표이사");
	    Person personKim = new Person("김철수", "상무이사");
		
		FileOutputStream fos = new FileOutputStream("serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(personKim);
		oos.writeObject(personAhn);
		oos.close();

		FileInputStream fis = new FileInputStream("serial2.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person2 p1 = (Person2)ois.readObject();
		Person2 p2 = (Person2)ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}
}
