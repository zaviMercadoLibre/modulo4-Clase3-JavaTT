package ejercicio1;

public class Persona implements Precedable<Persona>{
    private String nombre;
    private int dni;


    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getDni() {
        return this.dni;
    }

    @Override
    public int precedeA(Persona p){

        if(p.dni < dni){
            return 1;
        }else if(p.dni > dni){
            return -1;
        }else {
            return 0;
        }

    }
    @Override
    public String toString(){
        return "nombre: "+getNombre() + " ,dni: "+this.getDni();
    }
}
