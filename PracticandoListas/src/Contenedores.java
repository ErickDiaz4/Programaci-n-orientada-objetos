import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Contenedores implements Comparable<Contenedores>{

    private List<Contenedores> TodosLosContenedores;
    private Integer identificacion;
    private String descripcion;
    private Boolean materialesPeligrosos;

    public Contenedores(int identificacion, String descripcion, Boolean materialesPeligrosos) {
        TodosLosContenedores = new ArrayList<>();
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedores otroscontenedores) {
        return Integer.compare(identificacion , otroscontenedores.identificacion);
    }

    @Override
    public String toString() {
        return "Contenedor con Id: #" + identificacion + " de procedencia: " + descripcion
                + " con material de risgo peligroso: " + materialesPeligrosos;
    }

    public void mostrarTodosLosContenedores(){
        List<Contenedores> raraProcedencia = new ArrayList<>();
        for (Contenedores contenedores : raraProcedencia) {
            if(contenedores.materialesPeligrosos == true){
                raraProcedencia.add(contenedores);
            }
        }
        for (Contenedores contenedores : raraProcedencia) {
            System.out.println(toString());
        }
    }


}
