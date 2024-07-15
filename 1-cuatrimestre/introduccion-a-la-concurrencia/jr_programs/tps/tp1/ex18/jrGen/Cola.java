/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class Cola extends java.lang.Object {
    { JRinit(); }
    private Object[] elementos;
    private int tamano;
    private int frente;
    private int finalCola;
    private int capacidad;
    
    public Cola(int capacidad) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.capacidad = capacidad;
        // Begin Expr2
        elementos = new Object[capacidad];
        // Begin Expr2
        tamano = 0;
        // Begin Expr2
        frente = 0;
        // Begin Expr2
        finalCola = -1;
        JRprocess();
    }
    
    public boolean encolar(Object elemento) {
        if (estaLlena()) {
            // Return
            return (false);
            // End Return

        }
        // Begin Expr2
        finalCola = (finalCola + 1) % capacidad;
        // Begin Expr2
        elementos[finalCola] = elemento;
        // Begin Expr2
        tamano++;
        // Return
        return (true);
        // End Return

    }
    
    public Object desencolar() {
        if (estaVacia()) {
            // Return
            return (null);
            // End Return

        }
        Object elementoDesencolado = elementos[frente];
        // Begin Expr2
        frente = (frente + 1) % capacidad;
        // Begin Expr2
        tamano--;
        // Return
        return (elementoDesencolado);
        // End Return

    }
    
    public Object frente() {
        if (estaVacia()) {
            // Begin Expr2
            System.out.println("La cola esta vacia.");
            // Return
            return (null);
            // End Return

        }
        // Return
        return (elementos[frente]);
        // End Return

    }
    
    public int tamano() {
        // Return
        return (tamano);
        // End Return

    }
    
    public boolean estaVacia() {
        // Return
        return (tamano == 0);
        // End Return

    }
    
    public boolean estaLlena() {
        // Return
        return (tamano == capacidad);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRCola jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRCola();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
