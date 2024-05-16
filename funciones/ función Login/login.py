import pytest

from triangulo import Triangulo

@pytest.fixture
def triangulo1():
    return Triangulo(3)

def test_area():
    assert triangulo1.calcular_area() == 3.897

def test_perimetro():
    assert triangulo1.calcular_perimetro() == 9
