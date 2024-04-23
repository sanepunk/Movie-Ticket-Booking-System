package Updation;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Updation 
{
  public static void getter(String SS)
  {
    String filename = "movie-ticket-booking\\History.txt"; // Change this to your file's name
  
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) 
    {
              // Open the file for writing, with "true" parameter to enable append mode
      writer.write(SS); // Write a line of text
      writer.newLine(); // Move to the next line
               // Move to the next line
              // You can write more lines here as needed

      System.out.println("History Updated Successfully.");
    } 
    catch (IOException e) 
    {
      System.err.println("Error writing to the file: " + e.getMessage());
    }
  
  }
}
