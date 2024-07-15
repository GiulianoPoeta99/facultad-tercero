# El sistema en cuestión es un doble procesador (cpu0 y cpu1), cuya carga de procesos
# es administrada por un monitor llamado despachador que Ud. debe implementar. Este
# monitor (despachador de procesos en este caso) se encarga entonces de asignar CPUs
# libre a los N procesos que la requieren por medio de una llamada al monitor 
# “despachador.adquirirCPU(Pid)”. Cuando un proceso hace el requerimiento, el monitor
# verifica si se encuentra disponible alguna de las 2 CPUs y en caso afirmativo, sin mediar
# ninguna política de planificación en particular (salvo la propia disciplina de colas implementadas en el monitor) se le asigna. 
# En caso de no haber ninguna CPU disponible
# el proceso que intenta la adquisición es bloqueado hasta que otro proceso en ejecución
# termine y ese procesador pueda ser nuevamente asignado. La solución debe ser tal que
# en todo momento el monitor debe conocer como mínimo el estado de cada uno de los
# procesadores (libre / ocupado) y al final de la corrida, debe proporcionar el total de
# asignaciones realizadas a cada uno de los procesadores.

class Despachador():
    condvar esperando
    cpu0_ocu = False
    cpu1_ocu = False

    def adquirir_cpu():
        if (cpu0_ocu && cpu1_ocu):
            cwait(esperando)
        
        if (!cpu0_ocu):
            cpu0_ocu = True
            return 0
        elsif (!cpu1_ocu):
            cpu1_ocu = True
            return 1

    def liberar_cpu(int cpu):
        if (cpu == 0):
            cpu0_ocu = False
            csignal(esperando)
        elsif (cpu == 1):
            cpu1_ocu = False
            csignal(esperando)


class Main():
    process Procesos[i = 1 to N]:
        while (True):
            cpu = Despachador.adquirir_cpu()
            # Ejecuta el proceso
            Despachador.liberar_cpu(cpu)