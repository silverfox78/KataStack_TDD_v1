import org.junit.Assert;
import org.junit.Test;

public class TestStack {
    @Test
    public void validaQueExistaStack(){
        String nombrePila = "pilaJano";
        Stack stack = new Stack(nombrePila);
        Assert.assertNotNull(stack);
    }

    @Test
    public void validaNombre(){
        String nombrePila = "pilaJano";
        Stack stack = new Stack(nombrePila);
        Assert.assertEquals(stack.getNombre(),nombrePila);
    }

    @Test
    public void validaPilaVacia()
    {
        String nombrePila = "pilaJano";
        Stack stack = new Stack(nombrePila);
        int valoresperado = 0;
        Assert.assertEquals(valoresperado, stack.getCantidad());
    }

    @Test
    public void validaCambioNombre () {
        String nombrePila = "pilaJano";
        Stack stack = new Stack(nombrePila);
        String nuevoNombre = "JanoPila";
        stack.setNombre(nuevoNombre);
        Assert.assertEquals(nuevoNombre, stack.getNombre());
    }

    @Test
    public void validaPush(){
        String nombrePila = "pilaJano";
        Stack stack = new Stack(nombrePila);
        String elemnto = "primero";
        stack.push(elemnto);
        int valoresperado = 1;
        Assert.assertEquals(valoresperado, stack.getCantidad());

    }
    @Test(expected = Exception.class)
    public void validaPopVacio() throws Exception {
        String nombrePila = "pilaJano";
        Stack stack = new Stack(nombrePila);
        String valorPila= stack.pop();
    }




    @Test
    public void validaPushPop() throws Exception {
        String nombrePila = "pilaJano";
        Stack stack = new Stack(nombrePila);
        String elemnto = "primero";
        stack.push(elemnto);
        String elemntoRecuperado = stack.pop();

        int valoresperado = 0;
        Assert.assertEquals(valoresperado, stack.getCantidad());

    }
    }
