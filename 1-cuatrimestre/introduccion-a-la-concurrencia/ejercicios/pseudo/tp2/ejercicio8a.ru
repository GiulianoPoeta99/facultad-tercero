# Problema de lectores y escritores: Hay un objeto de datos (por ejemplo, un arreglo) que es utilizado por varios 
# procesos, unos leen y otros que escriben. Mientras uno escribe, ningún otro proceso podrá acceder. Sí se permite a 
# varios procesos leer simultáneamente.
# Implemente soluciones al problema de “lectores / escritores” utilizando semáforos en pseudo codigo en las que:
# a) Los lectores tienen prioridad. 
# b) Los escritores tienen prioridad.

int CANTIDAD_LECTORES = N
int CANTIDAD_ESCRITORES = M

int cantidadLectores = 0

semaforo escritor = 1
semaforo mutexCantidadLectores = 1

process escritor(int i=0 to M):
    while (true):
        wait(escritor)

        delay(5)
        
        signal(escritor)

process lector(int i=0 to N):
    while (true):
        wait(mutexCantidadLectores)
        cantidadLectores++
        if (cantidadLectores === 1):
            wait(escritor)
        signal(mutexCantidadLectores)

        delay(5)

        wait(mutexCantidadLectores)
        cantidadLectores--
        if (cantidadLectores === 0):
            signal(escritores)
        signal(mutexCantidadLectores)