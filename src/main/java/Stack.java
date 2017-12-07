public class Stack {
    private String nombre;
    private int contador;

    public Stack(String nombrePila) {
        this.nombre = nombrePila;
        this.contador=0;
    }

    public String getNombre() {

        return this.nombre;
    }

    public int getCantidad() {
        return this.contador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    public void push(String elemnto) {
        this.contador++;
    }

    public String pop() throws Exception {
        if(this.contador<=0){
            throw new Exception("pilaVacia");
        }
        this.contador=0;
        return "";

    }
}
