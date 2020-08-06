package javaC.Schildt.Chapter_13.Reading_and_writing_data_to_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println(
                    "Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException е) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (IOException е) {
            System.out.println("Oшибкa чтения из файла");
        }

        try {
            fin.close();
        } catch (IOException е) {
            System.out.println("Oшибкa закрытия файла");
        }
    }
}
