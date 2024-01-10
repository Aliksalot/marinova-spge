package Utils;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class KeyWriter{

  private File file;

  public KeyWriter(File file){
    this.file = file;
  }

  public boolean remove(String key){
    if(file == null){

      return false;
    }
    String buffer = "";

    try{
      Scanner read = new Scanner(file);
    }catch(IOException e){
      return false;
    }
    return false;
  }

  public boolean set(String key, String value){
    return false;
  }
}