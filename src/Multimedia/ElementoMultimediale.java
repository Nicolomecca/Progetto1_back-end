package Multimedia;

public abstract class ElementoMultimediale {

    protected String titolo ;
    protected TipoElementoMultimediale tipo;

    public ElementoMultimediale (String titolo, TipoElementoMultimediale tipo) {
        this.titolo = titolo;
        this.tipo = tipo;
    }


}
