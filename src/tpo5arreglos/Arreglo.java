package tpo5arreglos;

public class Arreglo {

    static void sumarLista(int[] num) {
        int n = 0, a = 0, suma = 0;
        double promedio = 0;
        for (int i = 0; i < num.length; i++) {
            a = num[i];
            suma = suma + a;
        }
        System.out.println("La suma del arreglo es: " + suma);
        promedio = suma / num.length;
        System.out.println("El promedio es: " + promedio);
    }

    public static void buscarMayor(int bidim[][]) {
        int mayor;
        mayor = bidim[0][0];
        for (int f = 0; f < bidim.length; f++) {
            for (int c = 0; c < bidim[f].length; c++) {
                if (mayor < bidim[f][c]) {
                    mayor = bidim[f][c];
                }
            }
        }
        System.out.println("El numero mayor del arreglo bidiensional es: " + mayor);
    }

    public static void cuentaVocales (String frase){
        int vocales = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i+1)){
                case "a":
                    vocales++;
                    break;
                case "e":
                    vocales++;
                    break;
                case "i":
                    vocales++;
                    break;
                case "o":
                    vocales++;
                    break;
                case "u":
                    vocales++;
                    break;
            }
        }
        System.out.println("La frase tiene "+vocales+" vocales.");
    }
    public static int cuentaCaracteres( String frase){
        int caracteres=0;
      return caracteres= frase.length();
        }
        
        
        
    }