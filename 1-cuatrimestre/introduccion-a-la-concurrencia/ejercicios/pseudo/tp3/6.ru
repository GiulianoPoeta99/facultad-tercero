# Use monitores de Hoare para implementar una solución al problema de los lectores y
# escritores de modo tal que se vean favorecidos escritores

class Monitor: 
    int lectores = 0
    int escritoresEsperando = 0
    boolean escritorActivo = false
    condvar leer
    condvar escribir

    def puedeLeer():
        while (escritorActivo || (escritoresEsperando > 0)):
            wait(leer)
        lectores++

    def terminoLectura():
        lectores --
        signal(escribir)

    def puedeEscribir():
        escritoresEsperando++
        while (escritorActivo || (lectoresEsperando > 0)):
            wait(escribir)
        escritoresEsperando--
        escritorActivo = true

    def terminoEscritura():
        escritorActivo = false
        if (escritoresEsperando > 0):
            signal(escribir)
        else:
            signal(leer)

class Main:
    process Escritor [int i = 1 to N]:
        Monitor.puedeEscribir()
        Monitor.terminoEscritura()

    process Lector [int i = 1 to M]:
        Monitor.puedeLeer()
        Monitor.terminoLectura()