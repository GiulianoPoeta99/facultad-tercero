# El sistema en estudio es una playa de estacionamiento que tiene una única puerta de
# entrada y salida, con capacidad para albergar N vehículos en cada una de sus 2 plantas
# (PB y 1P), lo que da una capacidad total de 2xN. Todos los vehículos intentan ingresar,
# con la única condición que haya espacio, una vez que consiguen el ingreso (por PB)
# deben ubicarse en una de las N cocheras si es que éstas no están todas ocupadas, en
# caso contrario, debe subir al 1er. Piso y ubicarse allí. Se sabe que luego de unos instantes,
# todos los vehículos, se retiran de la playa, obviamente por la misma puerta de entrada.
# Ud. Debe simular este sistema utilizando mensajes para solucionar los inconvenientes
# que se planteen de situaciones de concurso y sincronización. La solución debe contemplar
# como mínimo: 
# a) que no ingresen mas vehículos que los permitidos, 
# b) que no haya más de N vehículos en cada piso en todo instante, 
# c) que obligatoriamente los vehículos llenen la PB y luego el 1P, 
# d) debido a que la puerta de acceso es reducida, sólo puede pasar un vehículo a la vez, tanto entrando como saliendo, 
# e) cada vehículo tiene sus propios tiempos, es decir la estancia en la playa puede ser distinta en todos casos, 
# el instante en que desee entrar a la playa puede ser también distinto, 
# f) el sistema debe proporcionar en todo momento que se requiera, el total de vehículos estacionados en cada piso.



process Vehiculo[i=1 to M]
    while (True)
        if ((cantPB = N) && (cant1P = N))
            # se va temporalmente
            sleep(rint(0,1000))
        else
            # intenta estacionar
            recieve(entrada)
            recieve(lugarLibre) # si hay lugar entra, si no espera
            recieve(mutexCant)
            if (cantPB <= N)
                estacionoEnPB = True
                cantPB++
            else (cant1P <= N)
                estacionoEnPB = False
                cant1P++
            send(mutexCant)
            send(entrada)
            # estaciona
            sleep(rint(0,1000)) # tiempo estacionado
            # se va
            recieve(entrada)
            recieve(mutexCant)
            if (estacionoEnPB)
                cantPB--
            else
                cant1P--
            send(mutexCant)
            send(entrada)
            # se fue


class Main():
    N = 20 # cantidad por planta
    TOTAL = 2*N # cantidad total
    M = 100

    int cantPB = 0
    int cant1P = 0

    chan mutexCant

    chan entrada
    chan lugarLibre
    chan lleno

    send(mutexCant)

    send(entrada)
    for (i=1 to TOTAL)
        send(lugarLibre)

    Vehiculo()