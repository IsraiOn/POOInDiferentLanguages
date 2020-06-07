from payment import Payment

class Card(Payment):
    id = int
    number = int
    cvu = int
    date = str

    def __init__(self, id, number, cvu, date):
        super().__init__(id)
        self.number = number
        self.cvu = cvu
        self.date = date