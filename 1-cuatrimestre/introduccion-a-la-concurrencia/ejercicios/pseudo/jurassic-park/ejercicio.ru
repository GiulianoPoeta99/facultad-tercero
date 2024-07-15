
int VEHICULOS_TOTALES = 10
int ESPACIO_VR = 20
int MINIMO_GENTE = 12

int vehiculosEnUso = 0
int clienteEnSala = 0

sem saleVehiculo = 0
sem iniciaRecorrido = 0
sem finalizaRecorrido = 0
sem ingresaCliente = 0
sem iniciaFuncion = 0
sem finalizaFuncion = 0

process visitante:
    while (true):
        print("Entra al museo")
        print("Sale del museo y va a los vehiculos")
        signal(solicitanVehiculo) # pide vehiculo
        wait(saleVehiculo) # espera vehiculo para el safari
        signal(iniciaRecorrido) # inicia recorrido
        wait(finalizaRecorrido) # finaliza recorrido
        signal(ingresaCliente) # ingresa cliente al vr
        wait(iniciaFuncion) # inica funcion
        wait(finalizaFuncion) # finaliza fucion
        print("Se va del parque")

process vehiculo:
    while (true):
        wait(solicitanVehiculo)
        if (vahiculosEnUso === VEHICULOS_TOTALES):
            print("No hay vehiculos")
        else:
            vehiculosEnUso++
            signal(saleVehiculo)
            print("Un visitante salio en un vehiculo")
            wait(iniciaRecorrido)
            print("Se inicio el recorrido")
            # ...
            vehiculosEnUso--
            print("Se finalizo el recorrido")
            signal(finalizaRecorrido)

process salaVR:
    while (true):
        wait(ingresaCliente)
        if (clienteEnSala === ESPACIO_VR):
            print("Sala llena")
        else:
            clienteEnSala++
            if (clienteEnSala >= MINIMO_GENTE):
                print("Inicia funcion")
                signal(iniciaFuncion)
                print("Finaliza función")
                clienteEnSala = 0
                signal(finalizaFuncion)
            else:
                print("Esperando gente")