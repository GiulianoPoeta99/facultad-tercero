# Implemente una solución para el problema de la pizzería ya enunciado, 
# utilizando monitores de Hoare.

class Monitor:
    condvar pizza
    array<condvar>[3] ingredientes = [
        salsa,
        queso,
        morron
    ]
    condvar esperarAyuSalsa
    condvar esperarAyuQueso
    condvar esperarAyuMorron

    boolean hayPizza = False
    boolean ayuSalsaListo = False
    boolean ayuQuesoListo = False
    boolean ayuMorronListo = False

    def empezar_pizza(int ingrediete_faltante)
        if (hayPizza)
            cwait(pizza_finalizada)
        
        hayPizza = True
        
        csignal(pizza)
        csignal(pizza)
        csignal(pizza)
        if (!ayuSalsaListo)
            cwait(esperarAyuSalsa)
        if (!ayuQuesoListo)
            cwait(esperarAyuQueso)
        if (!ayuMorronListo)
            cwait(esperarAyuMorron)

        if (ingrediete_faltante = 0)
            csignal(ingredientes[0])
        elsif (ingrediete_faltante = 1)
            csignal(ingredientes[1])
        elsif (ingrediete_faltante = 2)
            csignal(ingredientes[2])
        
    
    def preparar_ayudante(int id_ayu)
        if (!hayPizza)
            cwait(pizza)
        
        if (id_ayu = 0)
            ayuSalsaListo = True
            csignal(esperarAyuSalsa)
            cwait(ingredientes[0])
            ayuSalsaListo = False
        elsif (id_ayu = 1)
            ayuQuesoListo = True
            csignal(esperarAyuQueso)
            cwait(ingredientes[1])
            ayuQuesoListo = False
        elsif (id_ayu = 2)
            ayuMorronListo = True
            csignal(esperarAyuMorron)
            cwait(ingredientes[2])
            ayuMorronListo = False

        hayPizza = False
        csignal(pizza_finalizada)
        
class Main:
    process Chef:
        while (True):
            Monitor.empezar_pizza(rint[0,2])

    process AyuQueso:
        while (True):
            Monitor.preparar_ayudante(0)

    process AyuSalsa:
        while (True):
            Monitor.preparar_ayudante(1)

    process AyuMorron:
        while (True):
            Monitor.preparar_ayudante(2)
