package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

import java.time.LocalDateTime;

public abstract class Propiedad {
  protected int Ano_constr;
    protected String direccion;
    protected int Metros2;

  public Propiedad(int ano_constr, String direccion, int metros2) {
    Ano_constr = ano_constr;
    this.direccion = direccion;
    Metros2 = metros2;
  }

  public int getAno_constr() {
    return Ano_constr;
  }

  public void setAno_constr(int ano_constr) {
    Ano_constr = ano_constr;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public int getMetros2() {
    return Metros2;
  }

  public void setMetros2(int metros2) {
    Metros2 = metros2;
  }


}
