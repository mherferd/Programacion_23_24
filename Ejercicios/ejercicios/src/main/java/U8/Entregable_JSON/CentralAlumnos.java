package U8.Entregable_JSON;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralAlumnos {
    @GET("json_entrega1/alumnos")
    Call<List<Alumnos>> listaAlumnos();

    @GET("json_entrega1/alumnos/{alumnos_id}")
    Call<Alumnos> getAlumnoID(@Path("alumnos_id") Integer alumnos_id);

    @GET("json_entrega1/alumnos/{alumnos_id}/asignaturas")
    Call<List<Asignaturas>> listaAsignaturas(@Path("alumnos_id") Integer alumnos_id);
}
