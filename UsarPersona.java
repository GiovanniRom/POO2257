
package mx.unam.aragon.fes;

/**
 *
 * @author cakit
 */
public class UsarPersona {
    public static void main(String[] args) {
        System.out.println("Programa usar persona");
        
        int edad=0;
        
        Persona per1=new Persona();
        Persona per2=new Persona();
        
        System.out.println(per1.getNombre());
        
        per2.setNombre("Giovanni");
        System.out.println(per2.getNombre());
        
        System.out.println(per2.toString());
        per2.setEdad(18);
        System.out.println(per2.toString());
    }
}
