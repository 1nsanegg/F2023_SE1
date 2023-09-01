package tut3.Ex1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\tuan1\\Desktop\\SE1\\src\\tut3\\text";
        String output = "C:\\Users\\tuan1\\Desktop\\SE1\\src\\tut3\\output";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        BufferedWriter writer = new BufferedWriter(new BufferedWriter(new FileWriter(output)));
        while ((line = reader.readLine()) != null) {
            writer.write(line.replaceAll("[\\s\\r\\n\\t\\f]", ""));
            writer.newLine();

        }
        writer.close();
    }

}
