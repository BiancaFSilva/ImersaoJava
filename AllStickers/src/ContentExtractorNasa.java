import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContentExtractorNasa implements ContentExtractor
{
    public List<Content> extractContent(String json)
    {
        JsonParser parser = new JsonParser();
        List<Map<String, String>> AttributeList = parser.parse(json);

        List<Content> contents = new ArrayList<>();

        for (Map<String, String> attributes : AttributeList) 
        {
            String urlImage = attributes.get("url");
            String title = attributes.get("title");

            var content = new Content(title, urlImage);
            contents.add(content);
        }

        return contents;
    }
}