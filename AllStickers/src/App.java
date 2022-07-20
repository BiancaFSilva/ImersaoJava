import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        /*
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        ContentExtractor extractor = new ContentExtractorIMDb();
        */
        String url = "https://api.mocki.io/v2/549a5d8b/NASA-APOD-JamesWebbSpaceTelescope";  
        ContentExtractor extractor = new ContentExtractorNasa();
        
        var http = new ApiHttpClient();
        String json = http.searchData(url);
        
        List<Content> contents = extractor.extractContent(json);

        var generator = new StickerGenerator();     
        for (int i = 0; i < 3; i++) 
        {
            Content content = contents.get(i);
            
            InputStream inputStream = new URL(content.getImageUrl()).openStream();
            String archiveName = content.getTitle() + ".png";

            generator.createSticker(inputStream, archiveName);

            System.out.println(content.getTitle() + "\n");
        }
    }
}