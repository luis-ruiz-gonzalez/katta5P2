package katta5P2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import katta5P2.model.Mail;

public class MailListReader {

    public static List<Mail> read (String fileName){
       List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("email.txt")));     
            IteratorReader iteratorReader = new IteratorReader(reader);
            
            for(String line : iteratorReader)
                if(Mail.isMail(line))
                    list.add(new Mail(line));
        }catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
        /*
        catch(FileNotFoundException e){
            System.out.println("File not found" + e.getMessage());
        }
        */
        
        
        return list; 
    }
}
