package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException �߻�
		Class c = Class.forName(className);  //ClassNotFoundException �߻�
		return c;
	}


    public static void main(String[] args) {

		ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}