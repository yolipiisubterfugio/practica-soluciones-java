import java.util.List;

import Model.Genero;
import Model.Director;
import Model.Pelicula;
import DAO.GeneroDAOImpl;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los DAOs
        GeneroDAO generoDAO = new GeneroDAOImpl();
        DirectorDAO directorDAO = new DirectorDAOImpl();
        PeliculaDAO peliculaDAO = new PeliculaDAOImpl();

        // Obtener todos los géneros
        List<Genero> generos = generoDAO.dameTodos();
        System.out.println("Todos los géneros:");
        for (Genero genero : generos) {
            System.out.println(genero);
        }
        
        // Obtener todos los directores
        List<Director> directores = directorDAO.dameTodos();
        System.out.println("\nTodos los directores:");
        for (Director director : directores) {
            System.out.println(director);
        }

        // Obtener todas las películas
        List<Pelicula> peliculas = peliculaDAO.dameTodos();
        System.out.println("\nTodas las películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        // Aquí puedes llamar a otros métodos según sea necesario
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
