import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // 🔹 1️⃣ Récupérer tous les étudiants avec leur classe
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        String sql =
            "SELECT s.id, s.name, s.email, s.age, c.name AS class_name " +
            "FROM student s " +
            "JOIN class c ON s.class_id = c.id";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                students.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("class_name")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }


    // 🔹 2️⃣ Récupérer un étudiant par ID
    public Student getStudentById(int id) {

        String sql =
            "SELECT s.id, s.name, s.email, s.age, c.name AS class_name " +
            "FROM student s " +
            "JOIN class c ON s.class_id = c.id " +
            "WHERE s.id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("class_name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    // 🔹 3️⃣ Ajouter un étudiant
    public void addStudent(String name, String email, int age, int classId) {

        String sql =
            "INSERT INTO student (name, email, age, class_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, age);
            ps.setInt(4, classId);

            ps.executeUpdate();
            System.out.println("Étudiant ajouté avec succès !");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // 🔹 4️⃣ Filtrer par nom de classe
    public List<Student> getStudentsByClass(String className) {

        List<Student> students = new ArrayList<>();

        String sql =
            "SELECT s.id, s.name, s.email, s.age, c.name AS class_name " +
            "FROM student s " +
            "JOIN class c ON s.class_id = c.id " +
            "WHERE c.name = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, className);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                students.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("class_name")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }


    // 🔹 5️⃣ Récupérer les cours des étudiants
    public void getStudentCourses() {

        String sql =
            "SELECT s.name, c.title " +
            "FROM student s " +
            "JOIN enrollment e ON s.id = e.student_id " +
            "JOIN course c ON e.course_id = c.id";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String studentName = rs.getString("name");
                String courseTitle = rs.getString("title");

                System.out.println(studentName + " -> " + courseTitle);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}