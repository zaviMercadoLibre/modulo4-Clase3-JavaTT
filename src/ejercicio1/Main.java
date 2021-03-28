package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Persona arr[] = {new Persona("pedro",34), new Persona("lara",20), new Persona("daniel",33)};

        SortUtil.ordenar(arr);

        for (Persona p: arr) {
            System.out.println(p);
        }

        Celular arrC[] = {new Celular(34556,"juan"), new Celular(22345,"alfonso"),new Celular(17654,"jose")};
        SortUtil.ordenar(arrC);
        for (Celular c: arrC) {
            System.out.println(c);
        }
    }
}
