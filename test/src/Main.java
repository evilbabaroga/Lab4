import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;


public class Main {
    public static void main(String[] args) {
        String uri = "https://dbpedia.org/resource/Skopje";
        Model model = ModelFactory.createDefaultModel();
        Resource skopje = model.createResource(uri);

        model.write(System.out);
    }
}
