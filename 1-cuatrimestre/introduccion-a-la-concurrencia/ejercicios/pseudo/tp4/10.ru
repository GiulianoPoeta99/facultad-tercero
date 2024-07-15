# Utilizando semáforos, implemente en JR las definiciones de estructuras de datos
# y primitivas necesarias para proveer un sistema de pasaje de mensajes con las siguientes
# características:
# a) Con direccionamiento indirecto, utilizando mailboxes.
# b) Provea forma de sincronización con send no bloqueante y receive bloqueante.
# c) Indique la disciplina de cola que utiliza (no se requiere una en particular).
# d) Funciona la solución obtenida en un sistema distribuido?.

import Queue # cola basada en una linked list para que sea infinita

Queue mail_box = new Queue()
sem mutex_mail_box = 1
sem mensaje_disponible = 0

def send(any|nil cuerpo) -> nil:
    wait(mutex_mail_box)
    mail_box.meter(cuerpo)
    signal(mutex_mail_box)
    signal(mensaje_disponible)

def receive() -> any|nil:
    wait(mensaje_disponible)
    wait(mutex_mail_box)
    cuerpo = mail_box.sacar()
    signal(mutex_mail_box)
    return cuerpo

# no funciona en distribuidos porque los semaforos no funcionan en sistemas distribuidos