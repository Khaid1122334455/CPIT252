
package com.mycompany.lab02;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;
import java.io.FileWriter;

public final class Logger {
    
  static DateTimeFormatter myFormatter;
  static String currentDateTimeString;
  private static String fileName;
  private static PrintWriter writer; 
  private static Logger logFile;
  
  
  private Logger() {

  }
  
  
  
  public void info (String message) {
    writer.println("INFO: " + message);
  }
  public void error (String message) {
    writer.println("Error: " + message);
  }


public static Logger getLogger() {
if(logFile == null){
logFile = new Logger();
myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
currentDateTimeString = LocalDateTime.now().format(myFormatter);
fileName = currentDateTimeString + ".txt";
try {
FileWriter fw = new FileWriter(fileName);
writer = new PrintWriter(fw, true);
}
catch (IOException ex) {
ex.printStackTrace();
}
    }
return logFile;

}

}