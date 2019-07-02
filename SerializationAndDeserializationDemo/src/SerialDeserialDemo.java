import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDeserialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Save obj = new Save();
		obj.i=4;
		
		
		//  Serializing an object 
		File f = new File("obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		//Deserializing an object
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj2 = (Save)ois.readObject();
		System.out.println("Value of i in the deserialized object is "+obj2.i);
	}
}


class Save implements Serializable{
	int i;
}