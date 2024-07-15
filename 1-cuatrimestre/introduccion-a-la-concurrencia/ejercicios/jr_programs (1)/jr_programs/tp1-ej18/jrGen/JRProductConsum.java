/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRProductConsum
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

	public Cap_ext_ op_consumir_voidTovoid;
	public Cap_ext_ JRget_op_consumir_voidTovoid() {
		return op_consumir_voidTovoid;
	}
	public void JRset_op_consumir_voidTovoid(Cap_ext_ op_consumir_voidTovoid) {
		this.op_consumir_voidTovoid = op_consumir_voidTovoid;
	}

	public Cap_ext_ op_productor_voidTovoid;
	public Cap_ext_ JRget_op_productor_voidTovoid() {
		return op_productor_voidTovoid;
	}
	public void JRset_op_productor_voidTovoid(Cap_ext_ op_productor_voidTovoid) {
		this.op_productor_voidTovoid = op_productor_voidTovoid;
	}

	public JRProductConsum(JRProductConsum copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_consumir_voidTovoid = copy.op_consumir_voidTovoid;
	this.op_productor_voidTovoid = copy.op_productor_voidTovoid;

	}
	public JRProductConsum(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_consumir_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_productor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRProductConsum(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_consumir_voidTovoid = Cap_ext_.noop;
	this.op_productor_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRProductConsum(true);
	}
    }
