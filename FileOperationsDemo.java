import java.io.*;

/*
 * Program Name : FileOperationsDemo
 * Description  : Demonstrates reading, writing, and modifying a text file in Java
 * Author       : Jayashree A
 */

public class FileOperationsDemo {

    // File path (can be changed as needed)
    static String filePath = "sample.txt";

    public static void main(String[] args) {

        // Step 1: Write data to file
        writeFile();

        // Step 2: Read data from file
        readFile();

        // Step 3: Modify (append) data in file
        modifyFile();

        // Step 4: Read file again after modification
        readFile();
    }

    // Method to write data into a file
    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Java File Handling Example");
            bw.newLine();
            bw.write("This file demonstrates read, write, and modify operations.");
            bw.newLine();

            bw.close();
            System.out.println("File written successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file
    public static void readFile() {
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();

            br.close();

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to modify file (append new content)
    public static void modifyFile() {
        try {
            FileWriter fw = new FileWriter(filePath, true); // true = append mode
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("This line is added while modifying the file.");
            bw.newLine();

            bw.close();
            System.out.println("File modified successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while modifying the file.");
            e.printStackTrace();
        }
    }
}
