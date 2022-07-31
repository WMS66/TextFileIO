import java.util.ArrayList;
import java.io.*;

class TextFileIO{
    public static void writeFile(String fileName, ArrayList<String> data){
      try{
          FileWriter fw = new FileWriter(fileName);
          PrintWriter pw = new PrintWriter(fw);
          for(int i = 0; i < data.size(); i++){
              pw.println(data.get(i));
          }
          pw.close();
      }
      catch(IOException e){
          System.out.println("Error - Cannot write to file " + fileName);
      }
  }

  public static void readFile(String fileName, ArrayList<String> data){
    try{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            data.add(line);
        }
    }
    catch(IOException e){
        System.out.println("Error -  Cannot read from file " + fileName);

    }
  }

  public static void main(String [] args){
    // Create some data
    ArrayList<String> items = new ArrayList<String>();
    items.add("Bread");
    items.add("Milk");
    items.add("Pasta");
    items.add("Butter");

    readFile("shopping.txt", items);

    // Output to screen
    for(int i = 0; i < items.size(); i++){
        System.out.println(items.get(i));
    }
  // Output to file
  writeFile("shopping.txt", items);

  }
}
