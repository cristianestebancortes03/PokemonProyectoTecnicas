import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class Gson {

    // Convierte una lista de objetos Entrenador a JSON y lo escribe en un archivo.
    public void toJson(List<Entrenador> entrenadores, FileWriter writer) throws IOException {
        writer.write("[\n");
        for (int i = 0; i < entrenadores.size(); i++) {
            Entrenador entrenador = entrenadores.get(i);
            writer.write("{\n");
            writer.write("\"nombre\": \"" + entrenador.getNombre() + "\",\n");
            writer.write("\"equipo\": [\n");
            for (int j = 0; j < entrenador.getEquipo().size(); j++) {
                Pokemon pokemon = entrenador.getEquipo().get(j);
                writer.write("{\n");
                writer.write("\"nombre\": \"" + pokemon.getNombre() + "\",\n");
                writer.write("\"salud\": " + pokemon.getSalud() + ",\n");
                writer.write("\"ataque\": " + pokemon.getPuntosDeAtaque() + "\n");
                writer.write("}");
                if (j < entrenador.getEquipo().size() - 1) writer.write(",");
                writer.write("\n");
            }
            writer.write("]\n");
            writer.write("}");
            if (i < entrenadores.size() - 1) writer.write(",");
            writer.write("\n");
        }
        writer.write("]\n");
        writer.flush();
    }

    // Lee un archivo JSON y convierte el contenido en una lista de objetos Entrenador.
    public List<Entrenador> fromJson(FileReader reader, Type listType) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder jsonBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            jsonBuilder.append(line.trim());
        }
        String json = jsonBuilder.toString();

        // Aquí puedes implementar un analizador JSON personalizado.
        throw new UnsupportedOperationException("El análisis JSON aún no está implementado.");
    }
}
