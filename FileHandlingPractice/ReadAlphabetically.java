import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadAlphabetically {
    public static void main(String[] args) {
        System.out.print("Please enter text to be parsed\n> ");
        File file=new File("input.txt");
        FileWriter writer;
        Scanner reader;
        try {
            file.createNewFile();
            // System.out.println("**created file");
        } catch (IOException e) {
            System.out.println("File already exists...");
            return;
        }
        try {
            writer=new FileWriter(file,true);
            // System.out.println("**writer created");
        } catch (IOException e) {
            System.out.println("Error creating file writer...");
            return;
        }
        Scanner input=new Scanner(System.in);
        // System.out.println("**input scanner created");
        try {
            writer.write(input.nextLine()+" ");
            writer.flush();
            // System.out.println("**writing next to file");
        } catch (IOException e) {
            System.out.println("error writing block; some data loss may occur...");
        }
        // System.out.println("**reached end of file");
        int wordCount=0,phraseCount=0,count;
        // System.out.println("**intialized counters");
        // System.out.println("**beggining read");
        System.out.println("");
        for(int charPointer=97;charPointer<=122;++charPointer){
            // System.out.println("**reading for char "+(char)charPointer);
            try {
                reader=new Scanner(file);
                // System.out.println("**created reader scanner");
            } catch (FileNotFoundException e) {
                System.out.println("File not found...");
                input.close();
                try {
                    writer.close();
                } catch (IOException e1) {
                    System.out.println("Error closing writer...");
                }
                return;
            }
            count=0;
            String words="";
            while(reader.hasNext()){
                String word=reader.next().toLowerCase();
                // System.out.println("**found word "+word);
                if(word.charAt(0)==charPointer){
                    // System.out.println("**word counted; incrementing");
                    ++wordCount;
                    ++count;
                    if(word.contains(".")||word.contains("?")||word.contains("!")||word.contains(";"))++phraseCount;//System.out.println("**end of phrase found; incrementing counter");
                    words+=word+" ";
                }
            }
            // System.out.println("**reached end for char");
            System.out.println(words+"--> word count for "+(char)charPointer+": "+count);
            reader.close();
        }
        // System.out.println("**read complete");
        System.out.println("\ntotal word count: "+wordCount+"\ntotal phrase count: "+phraseCount);
        input.close();
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("Error closing writer...");
        }
    }
}