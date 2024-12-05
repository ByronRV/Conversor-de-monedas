import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    //Su clave API: 95f33eb4aa4c2a67945e453f
    //Ejemplo de solicitud: https://v6.exchangerate-api.com/v6/95f33eb4aa4c2a67945e453f/latest/USD
    public Moneda buscaMoneda (){
        String clave = "95f33eb4aa4c2a67945e453f";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+clave+"/latest/USD");

        // httprequest (Solicitud)
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        // httpresponse (Respuesta)
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No encontré esta moneda ");
        }


    }
}
