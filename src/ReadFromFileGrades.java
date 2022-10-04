import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class ReadFromFileGrades {
    private String pathFile;

    public ReadFromFileGrades(String pathFile) {
        this.pathFile = pathFile;
    }

    public static List<StudentGrade> ReadFromFile(String pathFile) throws IOException {
        System.out.println("Citesc din fisier : ");
        List<StudentGrade> lista = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lista.add(StudentFromLine(line));
        }
        return  lista;

    }
    private static StudentGrade StudentFromLine(String line) {
        String[] token = line.split(Pattern.quote("|"));
        return new StudentGrade(token[0], token[1], Integer.parseInt(token[2]));
    }

}