
package mx.unam.aragon.fes;

/**
 *
 * @author cakit
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado();
        emp1.setNombre("Jose");
        emp1.setSueldo(10000.0f);
        emp1.setHorasExtra(10);
        float cobro = emp1.calcularSueldo();
        System.out.println("Gran total:"+cobro);
        System.out.println(emp1.toString());
    }
}
