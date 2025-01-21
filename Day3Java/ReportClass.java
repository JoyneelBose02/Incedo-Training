package Day3Java;
import java.util.*;

class ReportCard {
    private String name;
    private String surname;
    private String studentClass;
    private Map<String, String> subjects;

    //Creating a constructor
    public ReportCard(String name, String surname, String studentClass){
        this.name = name;
        this.surname = surname;
        this.studentClass = studentClass;
        this.subjects = new HashMap<>();
    }

    //Add subject, grade and judgement
    public void addSubject(String subject, String vote, String judgement){
        subjects.put(subject, "Vote: " + vote + " | Judgement: " + judgement);
    }

    //Display the report card in a formatted way
    public void displayReportCard(){
        System.out.println("Report Card for " + name + " " + surname);
        System.out.println("Class: " + studentClass);
        System.out.println("----------------");
        for(Map.Entry<String, String> entry: subjects.entrySet()){
            System.out.println("Subject: " + entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("----------------");
    }
}
class ReportCardPrinter {
    //Method to print one or more report cards
    public void printReportCards(List<ReportCard> reportCards){
        for(ReportCard reportCard: reportCards){
            reportCard.displayReportCard();
            System.out.println();
        }
    }
}
public class ReportClass {
    public static void main(String[] args) {
        //Creating Report Cards
        ReportCard student1 = new ReportCard("Amit", "Sharma", "12A");
        student1.addSubject("Math","A", "Excellent");
        student1.addSubject("Biology", "B", "Good");
        student1.addSubject("Physics","C", "Satisfactory");

        ReportCard student2 = new ReportCard("Rohan", "Singh", "12B");
        student2.addSubject("Math","A", "Excellent");
        student2.addSubject("Biology", "C", "Satisfactory");
        student2.addSubject("Physics","B", "Good");
        
        //Making an object of Reportcard printer
        ReportCardPrinter printer = new ReportCardPrinter();
        List<ReportCard> reportCards = new ArrayList<>();
        reportCards.add(student1);
        reportCards.add(student2);

        printer.printReportCards(reportCards);
    }
}
