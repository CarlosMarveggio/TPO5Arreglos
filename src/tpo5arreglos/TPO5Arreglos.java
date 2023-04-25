

package tpo5arreglos;

/**
 *
 * @author SE31452
 */
public class TPO5Arreglos {

    public static void main(String[] args) {
                
        int bidim[][] = {{2, 5}, {7, 8, 9},{45,5,69,88}};
        int num[]= {2,8,9,12};
        
        Arreglo.sumarLista(num);
        Arreglo.buscarMayor(bidim);
        
        Arreglo.cuentaVocales("contar vocales");
       
        System.out.println("La cantidad de caracteres es "+Arreglo.cuentaCaracteres("contar vocales"));
        System.out.println("");
    }

}
