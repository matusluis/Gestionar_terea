//TareaManager.groovy
class TareaManager {
    List<Tarea> tarea = []

    //Agregar una tarea

    void agregarTarea(String  titulo, String descripcion, int prioridad){
        def nuevaTarea = new Tarea(titulo, descripcion, prioridad)
        tarea.add(nuevaTarea)
        println "Tarea agregada: ${nuevaTarea}"
    }

    // Mostrar toda las tarea 
    void mostrarTarea(){
        println "Lista de tarea:"
        tarea.each{ tarea --> println terea }
    }

    //Buscar tarea por titulo usando ex´resion regulares
    void buscarTarea(String regex){
        println "Buscar tarea que coicidan con '$regex':"
        def coicidencia = tarea.findAll { tarea -->
            tarea.titulo == ~ /$regex/
        }

        coicidencia.each { println it }
    }

    //marca una tarea como completada
    void completarTarea(String titulo)
        def tarea = tarea.find { it.titulo == titulo }
        if (tarea) {
            tarea.completar()
            println "tarea completada: ${tarea}"
        } else{
            println "Tarea no encontrada con titulo: $titulo"
        }

    }
}
