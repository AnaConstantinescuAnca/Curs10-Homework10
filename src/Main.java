import java.io.IOException;
import java.util.List;

public class Main {
    private static String pathFile = "files/grades.txt";


    public static void main(String[] args) throws IOException {
        List<StudentGrade> listOfStudentGrade = ReadFromFileGrades.ReadFromFile(pathFile);

        for (StudentGrade student : listOfStudentGrade) {
            System.out.println(String.format("Studentul %s are nota %d la disciplina %s",
                    student.getName(), student.getGrade(), student.getDiscipline()));
        }

        //afisam lista cu notele la matematica
        System.out.println("Afisam lista cu notele la Mathematics");
        Classroom classroom = new Classroom((listOfStudentGrade));
        System.out.println(classroom.getGradesForDiscipline("Mathematics"));

        //afisam lista notelor pentru student Dulf Siguror
        System.out.println("Afisam lista notelor pentru student Dulf Siguror");
        classroom = new Classroom(listOfStudentGrade);
        System.out.println(classroom.getGradesForStudent("Dulf Siguror"));

        //afisez lista cu studentii care au nota maxima la Mathematics
        Classroom maxGradeOfClassroom = new Classroom(listOfStudentGrade);
        maxGradeOfClassroom.getMaxGrade("Mathematics");

        //nota maxima pe clasa
        Classroom maxGradeClassroom  = new Classroom(listOfStudentGrade);
        maxGradeOfClassroom.getMaxGrade();

        //listez obiect Student cu nota cea mai mare la o disciplina
        System.out.println("Afisez Studentul cu nota cea mai mare la o disciplina");
        System.out.println(classroom.getMaxGrade("Mathematics").toString());

        //listez obiect Student cu nota cea mai mare din clasa
        System.out.println("Afisez studentul cu nota cea mai mare din clasa");
        System.out.println(classroom.getMaxGrade().toString());

        //media pe disciplina matematica
        Classroom averageClassroom = new Classroom(listOfStudentGrade);

        System.out.println(String.format("Media pe clasa la disciplina Mathematics este %d",
        averageClassroom.getAverageGrade("Mathematics")));

        //cea mai slaba nota din clasa pe materia Mathematics
        System.out.println("Afisez studentul cu nota cea mai slaba la materia Physics ");
        System.out.println(classroom.getWorstGrade("Physics").toString());

        //generez raport in fis grade-reports.out
        ReportGenerator report = new ReportGenerator(listOfStudentGrade);
        report.generateReport();




    }


}