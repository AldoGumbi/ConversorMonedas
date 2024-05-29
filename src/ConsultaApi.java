import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Moneda obtenerMonedas(String baseCode, String targetCode){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5b93dd8e96a89659233d9bf5/pair/"+baseCode+"/"+targetCode);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontre esa Moneda");

        }

    }
}
