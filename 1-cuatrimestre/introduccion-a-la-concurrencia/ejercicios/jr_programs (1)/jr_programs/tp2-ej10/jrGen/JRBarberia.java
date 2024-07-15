/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRBarberia
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

	public Cap_ext_ op_customer_intTovoid;
	public Cap_ext_ JRget_op_customer_intTovoid() {
		return op_customer_intTovoid;
	}
	public void JRset_op_customer_intTovoid(Cap_ext_ op_customer_intTovoid) {
		this.op_customer_intTovoid = op_customer_intTovoid;
	}

	public Cap_ext_ op_barber_voidTovoid;
	public Cap_ext_ JRget_op_barber_voidTovoid() {
		return op_barber_voidTovoid;
	}
	public void JRset_op_barber_voidTovoid(Cap_ext_ op_barber_voidTovoid) {
		this.op_barber_voidTovoid = op_barber_voidTovoid;
	}

	public Cap_ext_ op_cobrar_voidTovoid;
	public Cap_ext_ JRget_op_cobrar_voidTovoid() {
		return op_cobrar_voidTovoid;
	}
	public void JRset_op_cobrar_voidTovoid(Cap_ext_ op_cobrar_voidTovoid) {
		this.op_cobrar_voidTovoid = op_cobrar_voidTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_barbero_voidTovoid;
	public Cap_ext_ JRget_op_barbero_voidTovoid() {
		return op_barbero_voidTovoid;
	}
	public void JRset_op_barbero_voidTovoid(Cap_ext_ op_barbero_voidTovoid) {
		this.op_barbero_voidTovoid = op_barbero_voidTovoid;
	}

	public Cap_ext_ op_clientes_voidTovoid;
	public Cap_ext_ JRget_op_clientes_voidTovoid() {
		return op_clientes_voidTovoid;
	}
	public void JRset_op_clientes_voidTovoid(Cap_ext_ op_clientes_voidTovoid) {
		this.op_clientes_voidTovoid = op_clientes_voidTovoid;
	}

	public JRBarberia(JRBarberia copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_customer_intTovoid = copy.op_customer_intTovoid;
	this.op_barber_voidTovoid = copy.op_barber_voidTovoid;
	this.op_cobrar_voidTovoid = copy.op_cobrar_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_barbero_voidTovoid = copy.op_barbero_voidTovoid;
	this.op_clientes_voidTovoid = copy.op_clientes_voidTovoid;

	}
	public JRBarberia(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_customer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_barber_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_cobrar_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_barbero_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_clientes_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JRBarberia(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_customer_intTovoid = Cap_ext_.noop;
	this.op_barber_voidTovoid = Cap_ext_.noop;
	this.op_cobrar_voidTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_barbero_voidTovoid = Cap_ext_.noop;
	this.op_clientes_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRBarberia(true);
	}
    }
