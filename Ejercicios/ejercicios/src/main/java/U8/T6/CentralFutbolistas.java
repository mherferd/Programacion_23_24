package U8.T6;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CentralFutbolistas {

        @GET("futbolistas_api_demo/jugadores")
        Call<List<Futbolistas>> listFutbolistas();

}

