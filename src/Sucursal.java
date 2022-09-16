import java.util.ArrayList;
public class Sucursal {
    private ArrayList<Instrumento> instrumentos;
    private String nombre;
    public Sucursal(String nombre){
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }
    public void agregarInstrumento(Instrumento ins){

        this.instrumentos.add(ins);
    }

    public String getNombre() {
        return nombre;
    }
    public Instrumento borrarInstrumento(String id){
        Instrumento insABorrar = buscarInstrumento(id);
        this.instrumentos.remove(insABorrar);
        return insABorrar;
    }
    private Instrumento buscarInstrumento(String id){
        int i = 0;
        Instrumento insEncontrado = null;
        while (i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(id)){
           i++;
        }
        if (i < instrumentos.size()){
            insEncontrado = this.instrumentos.get(i);
        }
        return insEncontrado;
    }
    public void listarInstrumentos(){
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento);
        }
    }
    public double[] porcInstrumentosPorTipo(){
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
        double[] porcentajes = new double[CANT_INSTRUMENTOS];
        for (Instrumento instrumento : instrumentos){
            porcentajes[instrumento.getTipo().ordinal()]++;
        }
        absolutoaProcentaje(porcentajes);
        return porcentajes;
    }
    private void absolutoaProcentaje(double[] porcentajes){
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = (porcentajes[i]*100)/instrumentos.size();
        }
    }
    public ArrayList<Instrumento> instrumentosPorTipo (TipoInstrumento tipo){
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for(Instrumento instrumento : instrumentos){
            if(instrumento.getTipo() == tipo){
                instEncontrados.add(instrumento);
            }
        }
        return instEncontrados;
    }
}
