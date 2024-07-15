/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRFilosofos
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_done_voidTovoid;
	public Cap_ext_ JRget_op_done_voidTovoid() {
		return op_done_voidTovoid;
	}
	public void JRset_op_done_voidTovoid(Cap_ext_ op_done_voidTovoid) {
		this.op_done_voidTovoid = op_done_voidTovoid;
	}

	public Cap_ext_ op_quintoFilosofo_voidTovoid;
	public Cap_ext_ JRget_op_quintoFilosofo_voidTovoid() {
		return op_quintoFilosofo_voidTovoid;
	}
	public void JRset_op_quintoFilosofo_voidTovoid(Cap_ext_ op_quintoFilosofo_voidTovoid) {
		this.op_quintoFilosofo_voidTovoid = op_quintoFilosofo_voidTovoid;
	}

	public Cap_ext_ op_filosofo_intTovoid;
	public Cap_ext_ JRget_op_filosofo_intTovoid() {
		return op_filosofo_intTovoid;
	}
	public void JRset_op_filosofo_intTovoid(Cap_ext_ op_filosofo_intTovoid) {
		this.op_filosofo_intTovoid = op_filosofo_intTovoid;
	}

	public JRFilosofos(JRFilosofos copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_quintoFilosofo_voidTovoid = copy.op_quintoFilosofo_voidTovoid;
	this.op_filosofo_intTovoid = copy.op_filosofo_intTovoid;

	}
	public JRFilosofos(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_quintoFilosofo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_filosofo_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRFilosofos(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_quintoFilosofo_voidTovoid = Cap_ext_.noop;
	this.op_filosofo_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRFilosofos(true);
	}
    }
