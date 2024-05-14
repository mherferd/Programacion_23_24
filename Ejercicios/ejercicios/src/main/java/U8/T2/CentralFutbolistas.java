package U8.T2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import java.util.List;

public interface CentralFutbolistas {

        @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores")
        Call<List<Futbolistas>> listFutbolistas();

        @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores/{id}")
        Call<Futbolistas> getFutbolistaId(@Path("id") Integer id);


}

