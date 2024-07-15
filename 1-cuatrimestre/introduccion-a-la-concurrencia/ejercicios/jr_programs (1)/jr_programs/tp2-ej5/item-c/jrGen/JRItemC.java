/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRItemC
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

	public Cap_ext_ op_consumer_intTovoid;
	public Cap_ext_ JRget_op_consumer_intTovoid() {
		return op_consumer_intTovoid;
	}
	public void JRset_op_consumer_intTovoid(Cap_ext_ op_consumer_intTovoid) {
		this.op_consumer_intTovoid = op_consumer_intTovoid;
	}

	public Cap_ext_ op_producer_intTovoid;
	public Cap_ext_ JRget_op_producer_intTovoid() {
		return op_producer_intTovoid;
	}
	public void JRset_op_producer_intTovoid(Cap_ext_ op_producer_intTovoid) {
		this.op_producer_intTovoid = op_producer_intTovoid;
	}

	public Cap_ext_ op_full_voidTovoid;
	public Cap_ext_ JRget_op_full_voidTovoid() {
		return op_full_voidTovoid;
	}
	public void JRset_op_full_voidTovoid(Cap_ext_ op_full_voidTovoid) {
		this.op_full_voidTovoid = op_full_voidTovoid;
	}

	public Cap_ext_ op_mutexConsum_voidTovoid;
	public Cap_ext_ JRget_op_mutexConsum_voidTovoid() {
		return op_mutexConsum_voidTovoid;
	}
	public void JRset_op_mutexConsum_voidTovoid(Cap_ext_ op_mutexConsum_voidTovoid) {
		this.op_mutexConsum_voidTovoid = op_mutexConsum_voidTovoid;
	}

	public Cap_ext_ op_mutexProd_voidTovoid;
	public Cap_ext_ JRget_op_mutexProd_voidTovoid() {
		return op_mutexProd_voidTovoid;
	}
	public void JRset_op_mutexProd_voidTovoid(Cap_ext_ op_mutexProd_voidTovoid) {
		this.op_mutexProd_voidTovoid = op_mutexProd_voidTovoid;
	}

	public JRItemC(JRItemC copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_consumer_intTovoid = copy.op_consumer_intTovoid;
	this.op_producer_intTovoid = copy.op_producer_intTovoid;
	this.op_full_voidTovoid = copy.op_full_voidTovoid;
	this.op_mutexConsum_voidTovoid = copy.op_mutexConsum_voidTovoid;
	this.op_mutexProd_voidTovoid = copy.op_mutexProd_voidTovoid;

	}
	public JRItemC(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_consumer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_producer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_full_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutexConsum_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_mutexProd_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);

	}
	public JRItemC(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_consumer_intTovoid = Cap_ext_.noop;
	this.op_producer_intTovoid = Cap_ext_.noop;
	this.op_full_voidTovoid = Cap_ext_.noop;
	this.op_mutexConsum_voidTovoid = Cap_ext_.noop;
	this.op_mutexProd_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRItemC(true);
	}
    }
