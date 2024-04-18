import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Genero;

public class GeneroDAOimpl implements GeneroDAO {
    private static final String URL = "C:/Users/YolandaHernández/Downloads/YolandaHernandezPracticasSolucionesJava";

    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";

    @Override
    public List<Genero> dameTodos() {
        List<Genero> generos = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM generos");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String nombreGenero = resultSet.getString("nombre");
                Genero genero = Genero.valueOf(nombreGenero.toUpperCase()); // Suponiendo que los nombres en la base de datos coinciden con los enums
                generos.add(genero);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de errores, considera manejar las excepciones de manera más apropiada
        }

        return generos;
    }
}
