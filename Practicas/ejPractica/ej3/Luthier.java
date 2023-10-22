package ejPractica.ej3;

public class Luthier {
    public void afinar(Instrumento instrumento) {
        switch (instrumento.getTipo()) {
            case CUERDA:
                instrumento.setAfinacion(Afinacion.DO);
            case VIENTO:
                instrumento.setAfinacion(Afinacion.LA);
                break;
            case PERCUSION:
                instrumento.setAfinacion(Afinacion.RE);
                break;
        }
    }
}