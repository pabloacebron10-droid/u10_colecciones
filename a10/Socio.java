package a10;

public class Socio implements Comparable <Socio> {
    private String dni;
    private String nombre;

    Socio(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object ob){
        return this.dni.equals(((Socio)ob).getDni());
    } 

    @Override
    public int compareTo(Socio s1){
        return this.dni.compareTo(s1.getDni());
    }

    @Override
    public String toString(){
        return "Nombre: " + this.getNombre() + " || DNI: " + this.getDni() + "\n";
    }

    @Override
        public int hashCode() {
            return dni.hashCode();
        }
    

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
   
}
