
class Car:
    
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color 

    def accelerate(self):
        print(self.manufacturer +" " +self.model +" "+" is moving")

    def stop(self):
        print(self.manufacturer +" " +self.model +" "+" has stopped moving")

car1 = Car("TATA", "Nexon", "2016", "Manual", "Blue")
car2 = Car("TATA", "Nexon", "2016", "Manual", "Blue")

car1.accelerate()
car1.stop()


