

public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        System.out.println("===== TOUS LES ETUDIANTS =====");

        dao.getAllStudents().forEach(System.out::println);
    }
}