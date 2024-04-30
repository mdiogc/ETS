
class Coche:
    def __init__(self):
        self.velocidad = 0

    def acelerar(self, incremento):
        self.velocidad += incremento

    def frenar(self, decremento):
        self.velocidad -= decremento

    def obtener_velocidad(self):
        return self.velocidad
