# Un Chef y tres ayudantes trabajan en una Pizzería de un modo muy particular. 
# Para hacer una pizza se requiere de tres ingredientes (además de la masa): salsa, queso y 
# morrones. Uno de los ayudantes tiene una cantidad infinita de salsa, otro de queso y 
# el restante de morrones, mientras que el Chef cuenta con una cantidad infinita de los 
# tres ingredientes. Las pizzas se hacen del siguiente modo: el Chef coloca sobre la masa 
# dos de los ingredientes de la pizza, avisa que hay una pizza lista para completar y 
# continúa con la preparación de la siguiente. El ayudante que tiene el ingrediente faltante 
# la completa y avisa que terminó. Recién en este momento, el Chef puede poner nuevamente 
# una pizza disponible a los ayudantes. Ud. debe escribir en pseudo codigo utilizando semáforos un 
# programa que simule esta situación y resuelva los problemas de sincronización que haya, 
# asegurando que tampoco se produzcan interbloqueos. Esta solución debe arrojar además 
# como resultado la cantidad de pizzas que se han hecho al final de la jornada.

array<semaforo>[3] ingredientes = [
    ayuSalsa = 0, 
    ayuQueso = 0, 
    ayuMorron = 0
]
semaforo pizza = 1
int contadorPizzas = 0

process chef:
    while (true):
        wait(pizza)
        signal(ingredientes[randomInt(0,2)])
        contadorPizzas++

process ayudanteSalsa:
    while (true):
        wait(ingredientes[0])
        print("Los ingredientes del chef son el queso y el morron")
        print("El ingrediente faltante es la salsa")
        signal(pizza)

process ayudanteQueso:
    while (true):
        wait(ingredientes[1])
        print("Los ingredientes del chef son la salsa y el morron")
        print("El ingrediente faltante es el queso")
        signal(pizza)

process ayudanteMorron:
    while (true):
        wait(ingredientes[2])
        print("Los ingredientes del chef son la salsa y el queso")
        print("El ingrediente faltante es el morron")
        signal(pizza)