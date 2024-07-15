
process Esquiadores[i = 1 to N]:
    while (True):
        receive(subirPasajero)
        receive(sillaLlena)
        receive(finalizoRecorrido)

process Sillas[i = 1 to M]:
    while (True):
        receive(subiendoPasajeros)
        for (j=1 to 4):
            send(subirPasajero)
        for (j=1 to 4):
            send(sillaLlena)
        send(subiendoPasajeros) # emepezo recorrido
        for (j=1 to 4):
            send(finalizoRecorrido)

class Main():
    
    send(subiendoPasajeros)

    Sillas()
    Esquiadores()

