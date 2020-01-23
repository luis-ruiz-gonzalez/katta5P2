package katta5p2.main;

import java.util.List;
import katta5P2.model.Histogram;
import katta5P2.model.Mail;
import katta5P2.view.HistogramDisplay;
import katta5P2.view.MailHistogramBuilder;
import katta5P2.view.MailListReader;

public class Katta5P2 {

    private String fileName;
    private List<Mail> mailList;
    private Histogram histogram;
    private HistogramDisplay histogramDisplay;
    
    public static void main(String[] args) {
        Katta5P2 katta5P2 = new Katta5P2();
        katta5P2.execute();
    }

    private void execute(){
        input();
        process();
        output();
    }
    
    private void input() {
        fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);  
    }

    private void output() {
        histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
       
}
