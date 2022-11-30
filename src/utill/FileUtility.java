package utill;

import java.io.*;

public class FileUtility {

    public static Object readObject(String fileName)  {
        Object obj = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            obj = objectInputStream.readObject();

        } finally {
            return obj;

        }


    }

    public static boolean writeObjToFile(Serializable object, String fileName) throws RuntimeException {

        try (ObjectOutput obj = new ObjectOutputStream(new FileOutputStream(fileName))) {
            obj.writeObject(object);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException(ex);

        }


    }
}
