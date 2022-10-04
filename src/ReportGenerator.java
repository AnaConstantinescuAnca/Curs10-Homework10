import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator extends Classroom{

    public ReportGenerator(List<StudentGrade> list) {
        super(list);
    }


    //grade-reports.out
    public void generateReport() throws IOException {
        //List<String> studentGradeList = new ArrayList<>();
        StudentGrade notaMaximaStudent = super.getMaxGrade();

        BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports,out", true));
        writer.write("Cea mai mare nota: " );
        writer.write(notaMaximaStudent.getName() + " " + notaMaximaStudent.getGrade());
        writer.newLine();
        writer.write("Nota medie: " + super.getAverageGrade());
        writer.newLine();
        writer.write("Cea mai mica nota: " + super.getWorstGrade().getName() + " " + super.getWorstGrade().getGrade());
        writer.close();
    }


}
