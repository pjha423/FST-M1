import pytest

def test_addition():
    n1=10
    n2=20

    sum = n1+n2
    assert sum == 30

def test_substraction():
    n1=20
    n2=10

    diff = n1-n2

    assert diff == 10

def test_multiplication():  
    n1 = 5
    n2 = 5

    mult = n1*n2

    assert mult == 25

def test_Division():
    n1 = 100
    n2 = 5

    div = n1/n2

    assert div == 20
              