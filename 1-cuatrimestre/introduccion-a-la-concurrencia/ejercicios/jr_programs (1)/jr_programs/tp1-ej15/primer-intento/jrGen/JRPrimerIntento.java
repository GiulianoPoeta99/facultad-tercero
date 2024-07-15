/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPrimerIntento
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

	public Cap_ext_ op_process2_voidTovoid;
	public Cap_ext_ JRget_op_process2_voidTovoid() {
		return op_process2_voidTovoid;
	}
	public void JRset_op_process2_voidTovoid(Cap_ext_ op_process2_voidTovoid) {
		this.op_process2_voidTovoid = op_process2_voidTovoid;
	}

	public Cap_ext_ op_process1_voidTovoid;
	public Cap_ext_ JRget_op_process1_voidTovoid() {
		return op_process1_voidTovoid;
	}
	public void JRset_op_process1_voidTovoid(Cap_ext_ op_process1_voidTovoid) {
		this.op_process1_voidTovoid = op_process1_voidTovoid;
	}

	public JRPrimerIntento(JRPrimerIntento copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_process2_voidTovoid = copy.op_process2_voidTovoid;
	this.op_process1_voidTovoid = copy.op_process1_voidTovoid;

	}
	public JRPrimerIntento(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_process2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_process1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRPrimerIntento(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_process2_voidTovoid = Cap_ext_.noop;
	this.op_process1_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPrimerIntento(true);
	}
    }
