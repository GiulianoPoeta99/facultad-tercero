/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPrioridadLector
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

	public Cap_ext_ op_escritor_intTovoid;
	public Cap_ext_ JRget_op_escritor_intTovoid() {
		return op_escritor_intTovoid;
	}
	public void JRset_op_escritor_intTovoid(Cap_ext_ op_escritor_intTovoid) {
		this.op_escritor_intTovoid = op_escritor_intTovoid;
	}

	public Cap_ext_ op_lector_intTovoid;
	public Cap_ext_ JRget_op_lector_intTovoid() {
		return op_lector_intTovoid;
	}
	public void JRset_op_lector_intTovoid(Cap_ext_ op_lector_intTovoid) {
		this.op_lector_intTovoid = op_lector_intTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_readWrite_voidTovoid;
	public Cap_ext_ JRget_op_readWrite_voidTovoid() {
		return op_readWrite_voidTovoid;
	}
	public void JRset_op_readWrite_voidTovoid(Cap_ext_ op_readWrite_voidTovoid) {
		this.op_readWrite_voidTovoid = op_readWrite_voidTovoid;
	}

	public JRPrioridadLector(JRPrioridadLector copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_escritor_intTovoid = copy.op_escritor_intTovoid;
	this.op_lector_intTovoid = copy.op_lector_intTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_readWrite_voidTovoid = copy.op_readWrite_voidTovoid;

	}
	public JRPrioridadLector(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_escritor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_lector_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_readWrite_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRPrioridadLector(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_escritor_intTovoid = Cap_ext_.noop;
	this.op_lector_intTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_readWrite_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPrioridadLector(true);
	}
    }
