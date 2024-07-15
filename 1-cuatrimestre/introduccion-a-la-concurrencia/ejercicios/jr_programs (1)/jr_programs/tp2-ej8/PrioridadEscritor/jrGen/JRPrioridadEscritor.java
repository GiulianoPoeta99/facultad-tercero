/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPrioridadEscritor
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

	public Cap_ext_ op_mutexWriters_voidTovoid;
	public Cap_ext_ JRget_op_mutexWriters_voidTovoid() {
		return op_mutexWriters_voidTovoid;
	}
	public void JRset_op_mutexWriters_voidTovoid(Cap_ext_ op_mutexWriters_voidTovoid) {
		this.op_mutexWriters_voidTovoid = op_mutexWriters_voidTovoid;
	}

	public Cap_ext_ op_mutexReaders_voidTovoid;
	public Cap_ext_ JRget_op_mutexReaders_voidTovoid() {
		return op_mutexReaders_voidTovoid;
	}
	public void JRset_op_mutexReaders_voidTovoid(Cap_ext_ op_mutexReaders_voidTovoid) {
		this.op_mutexReaders_voidTovoid = op_mutexReaders_voidTovoid;
	}

	public Cap_ext_ op_blockWrite_voidTovoid;
	public Cap_ext_ JRget_op_blockWrite_voidTovoid() {
		return op_blockWrite_voidTovoid;
	}
	public void JRset_op_blockWrite_voidTovoid(Cap_ext_ op_blockWrite_voidTovoid) {
		this.op_blockWrite_voidTovoid = op_blockWrite_voidTovoid;
	}

	public Cap_ext_ op_blockRead_voidTovoid;
	public Cap_ext_ JRget_op_blockRead_voidTovoid() {
		return op_blockRead_voidTovoid;
	}
	public void JRset_op_blockRead_voidTovoid(Cap_ext_ op_blockRead_voidTovoid) {
		this.op_blockRead_voidTovoid = op_blockRead_voidTovoid;
	}

	public JRPrioridadEscritor(JRPrioridadEscritor copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_escritor_intTovoid = copy.op_escritor_intTovoid;
	this.op_lector_intTovoid = copy.op_lector_intTovoid;
	this.op_mutexWriters_voidTovoid = copy.op_mutexWriters_voidTovoid;
	this.op_mutexReaders_voidTovoid = copy.op_mutexReaders_voidTovoid;
	this.op_blockWrite_voidTovoid = copy.op_blockWrite_voidTovoid;
	this.op_blockRead_voidTovoid = copy.op_blockRead_voidTovoid;

	}
	public JRPrioridadEscritor(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_escritor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_lector_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutexWriters_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutexReaders_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_blockWrite_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_blockRead_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JRPrioridadEscritor(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_escritor_intTovoid = Cap_ext_.noop;
	this.op_lector_intTovoid = Cap_ext_.noop;
	this.op_mutexWriters_voidTovoid = Cap_ext_.noop;
	this.op_mutexReaders_voidTovoid = Cap_ext_.noop;
	this.op_blockWrite_voidTovoid = Cap_ext_.noop;
	this.op_blockRead_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPrioridadEscritor(true);
	}
    }
