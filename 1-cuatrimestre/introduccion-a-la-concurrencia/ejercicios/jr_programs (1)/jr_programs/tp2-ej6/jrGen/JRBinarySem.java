/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRBinarySem
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

	public Cap_ext_ op_p_intTovoid;
	public Cap_ext_ JRget_op_p_intTovoid() {
		return op_p_intTovoid;
	}
	public void JRset_op_p_intTovoid(Cap_ext_ op_p_intTovoid) {
		this.op_p_intTovoid = op_p_intTovoid;
	}

	public JRBinarySem(JRBinarySem copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_p_intTovoid = copy.op_p_intTovoid;

	}
	public JRBinarySem(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_p_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRBinarySem(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_p_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRBinarySem(true);
	}
    }
