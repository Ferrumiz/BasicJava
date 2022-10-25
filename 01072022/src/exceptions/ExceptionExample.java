package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {

    //finally - код в блоке выполняется всегда (за исключением когда упала JVM, убит процесс, System.exit(0))
    //Как пример при наличии оператора return в блоке try и в блоке finally - вернется из finally.

    //try-with-resources - можно создать объекты как параметры try,  которые имплементируют интерфейс ФгещСдщыуфиду
    //после окончания работы блока try, у данных объектов будет вызван метод close().

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            reader.readLine();
//        } catch (IOException e) {
//            System.out.println(anInt);
//        } finally {
//            {
//                reader.close();
//            }
//        }

//        private void intputString(BufferedReader reader) {
//            try {
//
//            } catch (IOException e) {
//                System.out.println(anInt);
//            } finally {
//                {
//                    reader.close();
//                }
//            }
//
//        }

//        private int getInt() {
//            int i = 0;
//            try{
//                i=10;
//                return i;
//            }finally {
//                i=15;
//                return i;
//            }
//        }
    }
}
