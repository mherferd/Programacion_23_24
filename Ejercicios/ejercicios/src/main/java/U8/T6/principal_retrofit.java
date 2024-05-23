
package U8.T6;

import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
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
                        .baseUrl("https://my-json-server.typicode.com/chemaduran/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttpClient)
                        .build();

        API_Futbolistas service = retrofit.create(API_Futbolistas.class);


        System.out.println("Obtenemos el listado completo de futbolistas");
        try {
            Response<List<Futbolistas>> response = service.listFutbolistas().execute();
            if (response.isSuccessful()) {
                List<Futbolistas> futbolistas = response.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }


        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();

    }
}
