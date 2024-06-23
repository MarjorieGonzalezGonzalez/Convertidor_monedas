import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaValorMoneda {
    public Pais BuscaValor(String baseMoneda, String targetMoneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a696d3bf1e73406f158bfb41/pair/"+baseMoneda+"/"+targetMoneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pais.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esta moneda");
        }

    }
}

