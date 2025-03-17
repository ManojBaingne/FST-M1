class Car:
    'Car class'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " +self.model +" has started moving")

    def stop(self):
        print(self.manufacturer + " " +self.model +" has stopped moving")

    

c1 = Car("Tata","Zest", "2019", "Manual", "Red")
c2 = Car("Maruti", "800", "2010", "Manual", "White")
c3 = Car("Ford", "Figo", "1015", "Automatic", "Black")

c1.accelerate()
c1.stop()

c2.accelerate()
c2.stop

c3.accelerate()
c3.stop()