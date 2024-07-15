/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRItemD
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

	public Cap_ext_ op_consumer_voidTovoid;
	public Cap_ext_ JRget_op_consumer_voidTovoid() {
		return op_consumer_voidTovoid;
	}
	public void JRset_op_consumer_voidTovoid(Cap_ext_ op_consumer_voidTovoid) {
		this.op_consumer_voidTovoid = op_consumer_voidTovoid;
	}

	public Cap_ext_ op_producer_voidTovoid;
	public Cap_ext_ JRget_op_producer_voidTovoid() {
		return op_producer_voidTovoid;
	}
	public void JRset_op_producer_voidTovoid(Cap_ext_ op_producer_voidTovoid) {
		this.op_producer_voidTovoid = op_producer_voidTovoid;
	}

	public Cap_ext_ op_full_voidTovoid;
	public Cap_ext_ JRget_op_full_voidTovoid() {
		return op_full_voidTovoid;
	}
	public void JRset_op_full_voidTovoid(Cap_ext_ op_full_voidTovoid) {
		this.op_full_voidTovoid = op_full_voidTovoid;
	}

	public Cap_ext_ op_empty_voidTovoid;
	public Cap_ext_ JRget_op_empty_voidTovoid() {
		return op_empty_voidTovoid;
	}
	public void JRset_op_empty_voidTovoid(Cap_ext_ op_empty_voidTovoid) {
		this.op_empty_voidTovoid = op_empty_voidTovoid;
	}

	public JRItemD(JRItemD copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_consumer_voidTovoid = copy.op_consumer_voidTovoid;
	this.op_producer_voidTovoid = copy.op_producer_voidTovoid;
	this.op_full_voidTovoid = copy.op_full_voidTovoid;
	this.op_empty_voidTovoid = copy.op_empty_voidTovoid;

	}
	public JRItemD(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_consumer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_producer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_full_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_empty_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRItemD(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_consumer_voidTovoid = Cap_ext_.noop;
	this.op_producer_voidTovoid = Cap_ext_.noop;
	this.op_full_voidTovoid = Cap_ext_.noop;
	this.op_empty_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRItemD(true);
	}
    }
