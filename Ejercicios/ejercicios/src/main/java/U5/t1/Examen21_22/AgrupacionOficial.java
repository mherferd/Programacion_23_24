package U1.ejercicios.src.main.java.U5.t1.Examen21_22;

public abstract class AgrupacionOficial extends Agrupacion{
    protected Integrante[] Lista_Integrantes = new Integrante[0];
    protected int indice=0;

    public abstract void insertar_integrante(Integrante Integrante);
    public abstract boolean eliminar_integrante(Integrante Integrante);
    public abstract void caminito_del_falla();




}
