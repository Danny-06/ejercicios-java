public class Moneda {

  private String valor;
  private String lado;

  static String[] valores = {
    "1 Céntimo",
    "2 Céntimos",
    "5 Céntimos",
    "20 Céntimos",
    "50 Céntimos",
    "1 Euro",
    "2 Euros"
  };

  static String[] lados = {
    "Cara", "Cruz"
  };
 

  // Generación aleatorio de los valores de las monedas
  public Moneda() {
    this.valor = valores[Do.randomRange(0, valores.length - 1)];
    this.lado  = lados[Do.randomRange(0, lados.length - 1)];
  }

  // Especificación manual de los valores de las monedas
  public Moneda(String valor, String lado) {

    this.valor = valores[5];
    this.lado = lados[0];

    // Si el valor introducido coincide con alguno de los establecidos, se usará ese valor,
    // si no, se dará uno por defecto 
    for(String valorElement : valores) {
      if( valor.equals(valorElement) ) {
        this.valor = valor;
        break;
      }
    }

    // Si el valor introducido coincide con alguno de los establecidos, se usará ese valor,
    // si no, se dará uno por defecto
    for(String ladoElement : lados) {
      if( lado.equals(ladoElement) ) {
        this.lado = lado;
        break;
      }
    }
  
  }


  public String getValor() {
    return this.valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String getLado() {
    return this.lado;
  }

  public void setLado(String lado) {
    this.lado = lado;
  }

  @Override
  public String toString() {
    return this.valor + " - " + this.lado;
  }

}
