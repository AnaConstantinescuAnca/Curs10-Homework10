import java.util.*;

public class Classroom extends StudentGrade {
    private List<StudentGrade> list;

    public Classroom(List<StudentGrade> list) {
        this.list = list;
    }


    public List<StudentGrade> getList() {
        return list;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> note = new ArrayList<>();
        for (StudentGrade student : list) {
            if (student.getDiscipline().equals(discipline)) {
                note.add(student.getGrade());
            }
        }

        return note;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> note = new ArrayList<>();
        for (StudentGrade studentGrade : getList()) {
            if (studentGrade.getName().equals(student)) {
                note.add(studentGrade.getGrade());
            }
        }
        return note;
    }


    public Integer getAverageGrade(String discipline) {
        //List<Integer> list1 = new ArrayList<>();
        Integer average;
        Integer sumaNote = 0;
       Integer numarDisciplina=0;

        for (int i = 0; i<list.size();i++){

            if(list.get(i).getDiscipline().equals(discipline)){
                sumaNote += list.get(i).getGrade();
                numarDisciplina ++;
            }
        }
        return average=sumaNote/numarDisciplina;

    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade student = new StudentGrade(null, null, 0);
        for (StudentGrade studentGrade : list) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (studentGrade.getGrade() > student.getGrade()) {
                    student.setName(studentGrade.getName());
                    student.setDiscipline(studentGrade.getDiscipline());
                    student.setGrade(studentGrade.getGrade());
                }
            }
        }
        return student;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade student = new StudentGrade(null, null, 0);
        for (StudentGrade studentGrade : list) {
            if (studentGrade.getGrade() > student.getGrade()) {
                student.setName(studentGrade.getName());
                student.setDiscipline(studentGrade.getDiscipline());
                student.setGrade(studentGrade.getGrade());
            }
        }
        return student;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade student = new StudentGrade(null, null, 10);
        for (StudentGrade studentGrade : list) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (studentGrade.getGrade() < student.getGrade()) {
                    student.setName(studentGrade.getName());
                    student.setDiscipline(studentGrade.getDiscipline());
                    student.setGrade(studentGrade.getGrade());
                }
            }
        }

        return student;
    }

    //nota medie
    public int getAverageGrade() {
        int notaMedie = 0;
        for (int i = 0; i < list.size(); i++) {
            notaMedie += list.get(i).getGrade();
        }
        notaMedie = notaMedie / list.size();
        return notaMedie;
    }

    public StudentGrade getWorstGrade() {
        StudentGrade student = new StudentGrade(null, null, 10);
        for (StudentGrade studentGrade : list) {
            if (studentGrade.getGrade() < student.getGrade()) {
                student.setName(studentGrade.getName());
                student.setDiscipline(studentGrade.getDiscipline());
                student.setGrade(studentGrade.getGrade());
            }
        }
        return student;
    }

}