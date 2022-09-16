public class Principal {
    public static void main(String[] args) {
        Sucursal s1 = new Sucursal("sucursala0i");
        Sucursal s2 = new Sucursal("sucursala02");
        s1.agregarInstrumento(new Instrumento("piano",21413,TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("violin",56353,TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("flauta",252345,TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("gaita",5635543,TipoInstrumento.VIENTO));
        s2.agregarInstrumento(new Instrumento("arpa",3463643,TipoInstrumento.CUERDA));


        Fabrica f = new Fabrica();

       s1.listarInstrumentos();
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
       // f.listarInstrumentos();
        Instrumento borrado =  f.borrarInstrumento("piano");
       /* System.out.println(borrado);
        f.listarInstrumentos();*/
        double[] porcs = f.porcInstrumentosPorTipo("sucursala02");

        for (int i = 0; i < porcs.length; i++) {
            System.out.println(porcs[i]);
        }
    }
}
