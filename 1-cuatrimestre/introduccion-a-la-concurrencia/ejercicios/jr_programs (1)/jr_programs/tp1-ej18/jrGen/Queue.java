/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import java.util.LinkedList;

public class Queue extends java.lang.Object {
    { JRinit(); }
    private LinkedList elementos;
    private int sizeMax;
    
    public Queue(int sizeMax) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.elementos = new LinkedList();
        // Begin Expr2
        this.sizeMax = sizeMax;
        JRprocess();
    }
    
    public void push(int elemento) {
        // Begin Expr2
        elementos.addLast(elemento);
    }
    
    public int pop() {
        // Return
        return (((Integer)elementos.removeFirst()));
        // End Return

    }
    
    public int peek() {
        // Return
        return (((Integer)elementos.getFirst()));
        // End Return

    }
    
    public boolean vacia() {
        // Return
        return (elementos.isEmpty());
        // End Return

    }
    
    public boolean llena() {
        if (this.longitud() == this.sizeMax) {
            // Return
            return (true);
            // End Return

        } else {
            // Return
            return (false);
            // End Return

        }
    }
    
    public int longitud() {
        // Return
        return (elementos.size());
        // End Return

    }
    
    @Override()
    public String toString() {
        String a = "";
        JRLoop6: for (Object i : this.elementos) {
            // Begin Expr2
            a = a + " , " + Integer.toString(((Integer)i));
        }
        // Return
        return (a);
        // End Return

    }
    protected boolean JRcalled = false;
    protected JRQueue jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRQueue();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
