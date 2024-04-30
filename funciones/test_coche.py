import pytest

from coche import Coche

@pytest.fixture
def coche1():
    return Coche()
    
def test_acelerar():
    coche1.acelerar(50)
    assert coche1.obtener_velocidad() == 50

def test_frenar():
    coche1.acelerar(50)
    coche1.frenar(20)
    assert coche1.obtener_velocidad() == 30