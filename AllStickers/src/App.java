import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Conexão HTTP + Busca Top250
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        URI address = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());       
        String body = response.body();        

        // Extração de Dados (título, poster, classificação)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> MoviesList = parser.parse(body);
        
        /* Testes
        System.out.println(body);
        System.out.println(MoviesList.size());
        System.out.println(MoviesList.get(0));
        */

        // Manipulação de Dados   
        var generator = new StickerGenerator();     
        for (Map<String, String> movie : MoviesList) 
        {
            String urlImage = movie.get("image");
            String title = movie.get("title");

            InputStream inputStream = new URL(urlImage).openStream();
            String archiveName = title + ".png";

            generator.createSticker(inputStream, archiveName);

            System.out.println(title);
            System.out.println(movie.get("imDbRating"));
            System.out.println();
        }
    }
}