//Bucle For Each


public class bucleForEach {
    public static void main(String[] args) {
        String[] nombres = {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis","Jose"};

      /*  for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
      */
        for (String i:nombres){
            System.out.println("Nombre: "+i);
        }
    }
}
