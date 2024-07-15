/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRUnOrganismo
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

	public Cap_ext_ op_bacteriaBlanca_intTovoid;
	public Cap_ext_ JRget_op_bacteriaBlanca_intTovoid() {
		return op_bacteriaBlanca_intTovoid;
	}
	public void JRset_op_bacteriaBlanca_intTovoid(Cap_ext_ op_bacteriaBlanca_intTovoid) {
		this.op_bacteriaBlanca_intTovoid = op_bacteriaBlanca_intTovoid;
	}

	public Cap_ext_ op_bacteriaRoja_intTovoid;
	public Cap_ext_ JRget_op_bacteriaRoja_intTovoid() {
		return op_bacteriaRoja_intTovoid;
	}
	public void JRset_op_bacteriaRoja_intTovoid(Cap_ext_ op_bacteriaRoja_intTovoid) {
		this.op_bacteriaRoja_intTovoid = op_bacteriaRoja_intTovoid;
	}

	public Cap_ext_ op_organismoX_voidTovoid;
	public Cap_ext_ JRget_op_organismoX_voidTovoid() {
		return op_organismoX_voidTovoid;
	}
	public void JRset_op_organismoX_voidTovoid(Cap_ext_ op_organismoX_voidTovoid) {
		this.op_organismoX_voidTovoid = op_organismoX_voidTovoid;
	}

	public Cap_ext_ op_mutex_roja_voidTovoid;
	public Cap_ext_ JRget_op_mutex_roja_voidTovoid() {
		return op_mutex_roja_voidTovoid;
	}
	public void JRset_op_mutex_roja_voidTovoid(Cap_ext_ op_mutex_roja_voidTovoid) {
		this.op_mutex_roja_voidTovoid = op_mutex_roja_voidTovoid;
	}

	public Cap_ext_ op_rojas_listo_voidTovoid;
	public Cap_ext_ JRget_op_rojas_listo_voidTovoid() {
		return op_rojas_listo_voidTovoid;
	}
	public void JRset_op_rojas_listo_voidTovoid(Cap_ext_ op_rojas_listo_voidTovoid) {
		this.op_rojas_listo_voidTovoid = op_rojas_listo_voidTovoid;
	}

	public Cap_ext_ op_mutex_entrar_voidTovoid;
	public Cap_ext_ JRget_op_mutex_entrar_voidTovoid() {
		return op_mutex_entrar_voidTovoid;
	}
	public void JRset_op_mutex_entrar_voidTovoid(Cap_ext_ op_mutex_entrar_voidTovoid) {
		this.op_mutex_entrar_voidTovoid = op_mutex_entrar_voidTovoid;
	}

	public Cap_ext_ op_blancas_listo_voidTovoid;
	public Cap_ext_ JRget_op_blancas_listo_voidTovoid() {
		return op_blancas_listo_voidTovoid;
	}
	public void JRset_op_blancas_listo_voidTovoid(Cap_ext_ op_blancas_listo_voidTovoid) {
		this.op_blancas_listo_voidTovoid = op_blancas_listo_voidTovoid;
	}

	public Cap_ext_ op_ingreso_blanca_voidTovoid;
	public Cap_ext_ JRget_op_ingreso_blanca_voidTovoid() {
		return op_ingreso_blanca_voidTovoid;
	}
	public void JRset_op_ingreso_blanca_voidTovoid(Cap_ext_ op_ingreso_blanca_voidTovoid) {
		this.op_ingreso_blanca_voidTovoid = op_ingreso_blanca_voidTovoid;
	}

	public Cap_ext_ op_mutex_blanca_voidTovoid;
	public Cap_ext_ JRget_op_mutex_blanca_voidTovoid() {
		return op_mutex_blanca_voidTovoid;
	}
	public void JRset_op_mutex_blanca_voidTovoid(Cap_ext_ op_mutex_blanca_voidTovoid) {
		this.op_mutex_blanca_voidTovoid = op_mutex_blanca_voidTovoid;
	}

	public Cap_ext_ op_mutex_vulnerable_voidTovoid;
	public Cap_ext_ JRget_op_mutex_vulnerable_voidTovoid() {
		return op_mutex_vulnerable_voidTovoid;
	}
	public void JRset_op_mutex_vulnerable_voidTovoid(Cap_ext_ op_mutex_vulnerable_voidTovoid) {
		this.op_mutex_vulnerable_voidTovoid = op_mutex_vulnerable_voidTovoid;
	}

	public JRUnOrganismo(JRUnOrganismo copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_bacteriaBlanca_intTovoid = copy.op_bacteriaBlanca_intTovoid;
	this.op_bacteriaRoja_intTovoid = copy.op_bacteriaRoja_intTovoid;
	this.op_organismoX_voidTovoid = copy.op_organismoX_voidTovoid;
	this.op_mutex_roja_voidTovoid = copy.op_mutex_roja_voidTovoid;
	this.op_rojas_listo_voidTovoid = copy.op_rojas_listo_voidTovoid;
	this.op_mutex_entrar_voidTovoid = copy.op_mutex_entrar_voidTovoid;
	this.op_blancas_listo_voidTovoid = copy.op_blancas_listo_voidTovoid;
	this.op_ingreso_blanca_voidTovoid = copy.op_ingreso_blanca_voidTovoid;
	this.op_mutex_blanca_voidTovoid = copy.op_mutex_blanca_voidTovoid;
	this.op_mutex_vulnerable_voidTovoid = copy.op_mutex_vulnerable_voidTovoid;

	}
	public JRUnOrganismo(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_bacteriaBlanca_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_bacteriaRoja_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_organismoX_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutex_roja_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_rojas_listo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_mutex_entrar_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);
	this.op_blancas_listo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[7]);
	this.op_ingreso_blanca_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[8]);
	this.op_mutex_blanca_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[9]);
	this.op_mutex_vulnerable_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[10]);

	}
	public JRUnOrganismo(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_bacteriaBlanca_intTovoid = Cap_ext_.noop;
	this.op_bacteriaRoja_intTovoid = Cap_ext_.noop;
	this.op_organismoX_voidTovoid = Cap_ext_.noop;
	this.op_mutex_roja_voidTovoid = Cap_ext_.noop;
	this.op_rojas_listo_voidTovoid = Cap_ext_.noop;
	this.op_mutex_entrar_voidTovoid = Cap_ext_.noop;
	this.op_blancas_listo_voidTovoid = Cap_ext_.noop;
	this.op_ingreso_blanca_voidTovoid = Cap_ext_.noop;
	this.op_mutex_blanca_voidTovoid = Cap_ext_.noop;
	this.op_mutex_vulnerable_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRUnOrganismo(true);
	}
    }
