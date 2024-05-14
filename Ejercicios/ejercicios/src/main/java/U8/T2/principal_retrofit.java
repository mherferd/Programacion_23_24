package U8.T2;

import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class principal_retrofit {
    public static void main(String[] args) {

        OkHttpClient okHttpClient =
                new OkHttpClient.Builder()
                        .connectTimeout(1, TimeUnit.MINUTES)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .writeTimeout(15, TimeUnit.SECONDS)
                        .build();

        Retrofit retrofit =
                new Retrofit.Builder()
                        .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttpClient)
                        .build();

        CentralFutbolistas service = retrofit.create(CentralFutbolistas.class);
        Futbolistas futbolistas = null;
        final Integer FutbolistaID = 2;

        System.out.println("Obtenemos el listado completo de ventas");
        try {
            Response<List<Futbolistas>> response = service.listFutbolistas().execute();
            if (response.isSuccessful()) {
                List<Futbolistas> futbolistas1 = response.body();
                System.out.println(futbolistas1);
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("Obtenemos una futbolistas concreta, identificada por el id " + FutbolistaID);
        try {
            Response<Futbolistas> response = service.getFutbolistaId(FutbolistaID).execute();
            if (response.isSuccessful()) {
                futbolistas = response.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }

        System.out.println();
        System.out.println();


        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();

        System.out.println();
        System.out.println("Imprimimos el objeto futbolistas: ");
        System.out.println(futbolistas);
    }
}