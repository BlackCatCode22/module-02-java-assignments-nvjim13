// 8/5/24
// fileIO.java

import java.io.*;

public class fileIO {
    public static void main(String[] args) {


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is another line.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}