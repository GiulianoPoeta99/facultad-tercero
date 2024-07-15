/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRTestSetSem
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

	public Cap_ext_ op_p1_intTovoid;
	public Cap_ext_ JRget_op_p1_intTovoid() {
		return op_p1_intTovoid;
	}
	public void JRset_op_p1_intTovoid(Cap_ext_ op_p1_intTovoid) {
		this.op_p1_intTovoid = op_p1_intTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public JRTestSetSem(JRTestSetSem copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_p1_intTovoid = copy.op_p1_intTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;

	}
	public JRTestSetSem(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_p1_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRTestSetSem(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_p1_intTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRTestSetSem(true);
	}
    }
