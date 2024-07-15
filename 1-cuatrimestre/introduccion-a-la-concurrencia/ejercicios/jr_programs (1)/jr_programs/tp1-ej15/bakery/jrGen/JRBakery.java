/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRBakery
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

	public Cap_ext_ op_p1_voidTovoid;
	public Cap_ext_ JRget_op_p1_voidTovoid() {
		return op_p1_voidTovoid;
	}
	public void JRset_op_p1_voidTovoid(Cap_ext_ op_p1_voidTovoid) {
		this.op_p1_voidTovoid = op_p1_voidTovoid;
	}

	public Cap_ext_ op_p0_voidTovoid;
	public Cap_ext_ JRget_op_p0_voidTovoid() {
		return op_p0_voidTovoid;
	}
	public void JRset_op_p0_voidTovoid(Cap_ext_ op_p0_voidTovoid) {
		this.op_p0_voidTovoid = op_p0_voidTovoid;
	}

	public JRBakery(JRBakery copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_p1_voidTovoid = copy.op_p1_voidTovoid;
	this.op_p0_voidTovoid = copy.op_p0_voidTovoid;

	}
	public JRBakery(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_p1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_p0_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRBakery(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_p1_voidTovoid = Cap_ext_.noop;
	this.op_p0_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRBakery(true);
	}
    }
