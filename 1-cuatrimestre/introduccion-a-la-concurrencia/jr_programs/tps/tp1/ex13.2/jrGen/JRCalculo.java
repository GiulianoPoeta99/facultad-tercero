/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRCalculo
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

	public Cap_ext_ op_calcularDenominador_voidTovoid;
	public Cap_ext_ JRget_op_calcularDenominador_voidTovoid() {
		return op_calcularDenominador_voidTovoid;
	}
	public void JRset_op_calcularDenominador_voidTovoid(Cap_ext_ op_calcularDenominador_voidTovoid) {
		this.op_calcularDenominador_voidTovoid = op_calcularDenominador_voidTovoid;
	}

	public Cap_ext_ op_calcularNumerador_voidTovoid;
	public Cap_ext_ JRget_op_calcularNumerador_voidTovoid() {
		return op_calcularNumerador_voidTovoid;
	}
	public void JRset_op_calcularNumerador_voidTovoid(Cap_ext_ op_calcularNumerador_voidTovoid) {
		this.op_calcularNumerador_voidTovoid = op_calcularNumerador_voidTovoid;
	}

	public Cap_ext_ op_calcularExponente_voidTovoid;
	public Cap_ext_ JRget_op_calcularExponente_voidTovoid() {
		return op_calcularExponente_voidTovoid;
	}
	public void JRset_op_calcularExponente_voidTovoid(Cap_ext_ op_calcularExponente_voidTovoid) {
		this.op_calcularExponente_voidTovoid = op_calcularExponente_voidTovoid;
	}

	public Cap_ext_ op_calcularBase_voidTovoid;
	public Cap_ext_ JRget_op_calcularBase_voidTovoid() {
		return op_calcularBase_voidTovoid;
	}
	public void JRset_op_calcularBase_voidTovoid(Cap_ext_ op_calcularBase_voidTovoid) {
		this.op_calcularBase_voidTovoid = op_calcularBase_voidTovoid;
	}

	public Cap_ext_ op_calcularMultiplicacion_voidTovoid;
	public Cap_ext_ JRget_op_calcularMultiplicacion_voidTovoid() {
		return op_calcularMultiplicacion_voidTovoid;
	}
	public void JRset_op_calcularMultiplicacion_voidTovoid(Cap_ext_ op_calcularMultiplicacion_voidTovoid) {
		this.op_calcularMultiplicacion_voidTovoid = op_calcularMultiplicacion_voidTovoid;
	}

	public JRCalculo(JRCalculo copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_calcularDenominador_voidTovoid = copy.op_calcularDenominador_voidTovoid;
	this.op_calcularNumerador_voidTovoid = copy.op_calcularNumerador_voidTovoid;
	this.op_calcularExponente_voidTovoid = copy.op_calcularExponente_voidTovoid;
	this.op_calcularBase_voidTovoid = copy.op_calcularBase_voidTovoid;
	this.op_calcularMultiplicacion_voidTovoid = copy.op_calcularMultiplicacion_voidTovoid;

	}
	public JRCalculo(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_calcularDenominador_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_calcularNumerador_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_calcularExponente_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_calcularBase_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_calcularMultiplicacion_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);

	}
	public JRCalculo(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_calcularDenominador_voidTovoid = Cap_ext_.noop;
	this.op_calcularNumerador_voidTovoid = Cap_ext_.noop;
	this.op_calcularExponente_voidTovoid = Cap_ext_.noop;
	this.op_calcularBase_voidTovoid = Cap_ext_.noop;
	this.op_calcularMultiplicacion_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRCalculo(true);
	}
    }
