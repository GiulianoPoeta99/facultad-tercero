# Utilice mensajes para proporcionar una solución al clásico problema 
# "productor/consumidorçon las siguientes variantes:
# e) Búffer acotado, n productores y m consumidores.

#N productores y M consumidores

proceso Productores[int i = 1 to N]: 
    while(true):
        recieve(puedeProducir);
        send(puedeConsumir);

proceso Consumidores[int i = 1 to M]:
    while(true):
        recieve(puedeConsumir);
        send(puedeProducir);

class Main
    chan puedeProducir;
    chan puedeConsumir; 

    for(int i =1 to N):
        send(puedeProducir);
    
    Productores()
    Consumidores()