
class Monitor
    int MAX_PISTA = M-2
    int MAX_PISTA_VIP = 2
    int cant_en_pista = 0
    int cant_vip_en_pista = 0
    bool vip_esperando = False
    bool despojado = False

    condvar pista_llena
    condvar vip_lleno

    def entrar_pista(bool es_vip):
        if (cant_en_pista = MAX_PISTA):
            cwait(pista_llena)
        if (cant_vip_en_pista = MAX_PISTA_VIP)
            vip_esperando = True
            cwait(vip_lleno)
        if (vip_esperando):
            despojado = True
            cwait(espera_vip)

        if (es_vip)
            cant_vip_en_pista++
        else
            cant_en_pista++

    def salir_pista(bool es_vip):
        if (vip_esperando)
            vip_esperando = False
            csignal(vip_lleno)
        elsif (despojado)
            despojado = False
            csignal(espera_vip)
        
        if (cant_en_pista = MAX_PISTA):
            csignal(pista_llena)

        if (es_vip)
            cant_vip_en_pista--
        else
            cant_en_pista--

class Main
    process Normal[i=1 to N]:
        while (True):
            Monitor.entrar_pista(False)
            Monitor.salir_pista(False)

    process VIP[i=1 to R]:
        while (True):
            Monitor.entrar_pista(True)
            Monitor.salir_pista(True)

    Normal()
    VIP()
