// tarea.groovy
class Tarea{
    String titulo
    String descripcion
    int prioridad // 1 = Alta, 2 = Media, 3 = Baja
    boolean completo = false

    //constructor
    Tarea(String titulo, String descripcion, int prioridad){
        this.titulo = titulo
        this.descripcion = descripcion
        this.prioridad = prioridad
    }

    // metodo para marcar la tarea como completar
    void completar(){
        completa = true
    }

    //metodo para representar la tarea como cadena
    String toString(){
        return "Tarea(titulo: $titulo, prioridad: prioridad, completada: $completada)"
    }














}