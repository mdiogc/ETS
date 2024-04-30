
class Triangulo:
    def __init__(self, lado):
        self.lado = lado

    def calcular_area(self):
        return round(self.lado ** 2 * 3**0.5 / 4, 3 )

    def calcular_perimetro(self):
        return 3 * self.lado
