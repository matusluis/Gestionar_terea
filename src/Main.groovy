//Main.groovy

import java.util.Scanner

//crear el gestor de tarea

def gestor = new TareaManager()
def scanner = new Scanner(System.in)


while (true){
    println "\n----- Gestion de Tarea -----"
    println "1. Agregar tarea"
    println "2. Mostrar toda las tareas"
    println "3. Buscar tarea por titulo"
    println "4. Completar Tarea"
    println "5. Salir"
    println "Elige una opcion: "
   

    def opcion = scanner.nextInt()
    scanner.nextLine() //consumir nueva liena

    switch(opcion) {
        case 1:
            print "Ingrese el titulo de la tarea: "
            def titulo = scanner.nextLine
            
        break
    } 






}