package reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionApp {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException, InstantiationException {

        //1.Example to get data from private variable
        SpecialBook specialBook = new SpecialBook();
        Class<? extends SpecialBook> clazz = specialBook.getClass();
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(specialBook, "Hello");
        String name = (String) field.get(specialBook);
        System.out.println(name);

        //2. Get all info about object
        new ReflectionApp().printObjectInfo(specialBook);

        //3.
        //1. создать объект specialbook
        //2. иниц. поля
        //3.вывести объект
        //4.используя reflection api установить "Hello" для всех приватных полей

        System.out.println();
        SpecialBook sb = new SpecialBook("one", 5, "two");
        System.out.println(sb);
        Class classBook = sb.getClass();
        Field[] declaredFields = classBook.getDeclaredFields();
        for(Field ourField : declaredFields){
            int modifiers = ourField.getModifiers();
            if(Modifier.isPrivate(modifiers)) {
                ourField.setAccessible(true);
                ourField.set(sb, "Hello");
            }
        }
        System.out.println(sb);

        classBook = sb.getClass();
        Method turn = classBook.getDeclaredMethod("turn");
        turn.setAccessible(true);
        turn.invoke(sb);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read = bufferedReader.readLine();
        bufferedReader.close();

        Class aClass = Class.forName(read);
        Object book = aClass.newInstance();
        System.out.println(book.toString());



    }

    private void printObjectInfo(Object infoObject) {
        Class aClass = infoObject.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(System.out::println);
        System.out.println("Constructors");
        Constructor[] constructors = aClass.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println("Methods");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
        System.out.println("Parent class");
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass);

    }

}
