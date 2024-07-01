import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class solicitudMoneda {
   public Moneda consultaMoneda(String moneda1, String moneda2, double cantidad) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/efb153a796b90351d50cc845/pair/"
                +moneda1+"/"+moneda2+"/"+cantidad);


        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .GET()
                .build();
       HttpClient client = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda solicitada");
        }
    }
}
