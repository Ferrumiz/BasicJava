package transferobject;

import java.io.*;

public class TransferApp {

    public static void main(String[] args) throws IOException {
        Book book = new Book("BookOne", 500, "AuthorOne");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(path);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(book);

        objectOutputStream.close();
        outputStream.close();


//        private Book loadObject(String path) {
//            try (FileInputStream inputStream = new FileInputStream(path);
//                 ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
//                return (Book) objectInputStream.readObject();
//            } catch (IOException e) {
//                System.out.println("We have a problem " + e.getMessage());
//            } catch (ClassCastException | ClassNotFoundException exception) {
//                System.out.println("No such class" + exception.getMessage());
//            }
//            return null;
//        }


    }
}
