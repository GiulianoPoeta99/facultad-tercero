# Implemente una solución para el problema de la pizzería ya enunciado, 
# utilizando monitores de Hoare.

class Monitor:
    condvar pizza
    struct Ayudante = {
        condvar ingrediente,
        condvar esperar,
        condvar esperarListo,
        bool listo = False
    }
    array<Ayudante>[3] ayudantes = [
        Ayudante salsa = new Ayudante(),
        Ayudante queso = new Ayudante(),
        Ayudante morron = new Ayudante()
    ]

    boolean hayPizza = False

    def empezar_pizza(int ingrediente_faltante)
        if (hayPizza)
            cwait(pizza_finalizada)
        hayPizza = True
        csignal(pizza)
        if (!ayudantes[0].listo)
            cwait(ayudantes[0].esperar)
        csignal(pizza)
        if (!ayudantes[1].listo)
            cwait(ayudantes[1].esperar)
        csignal(pizza)
        if (!ayudantes[2].listo)
            cwait(ayudantes[2].esperar)

        csignal(ayudantes[ingrediente_faltante].ingrediente)

    def preparar_ayudante(int id_ayu)
        if (ayudantes[id_ayu].listo)
            cwait(ayudantes[id_ayu].esperarListo)
        ayudantes[id_ayu].listo = True
        csignal(ayudantes[id_ayu].esperar)
        cwait(ayudantes[id_ayu].ingrediente)
        hayPizza = False
        csignal(pizza_finalizada)
        
class Main:
    process Chef:
        while (True):
            Monitor.empezar_pizza(rint(0,2))

    process AyuQueso:
        while (True):
            Monitor.preparar_ayudante(0)

    process AyuSalsa:
        while (True):
            Monitor.preparar_ayudante(1)

    process AyuMorron:
        while (True):
            Monitor.preparar_ayudante(2)
