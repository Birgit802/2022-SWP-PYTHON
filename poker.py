"""insgesamt 52 Pokerkarten
beinhalten die vier Farben Kreuz, Pik, Herz und Karo
sowie die Karten 2, 3, 4, 5, 6, 7, 8, 9, 10,
    Bube, Dame, König und Ass
    wie kann man die Pokerkarten modellieren (vier Farben, 13 Symbole)
    -ich möchte etwas mit 2 Werten ausgeben--Spielfeld wie Java--for
    -Funktionalität vom Lotto mit etwas ausgeben

    """





# 4 Farben
# 9 Zahlen und 4 Bilder
#https://www.spielanleitung.org/poker/reihenfolge.html



from random import random
#listen festlegen
cards = []
picked_cards = []

#erste for-loop für die 4 Farben 
#zweite for-loop  für alles andere
def deck():
    for i in range(4):
        for j in range (1,14):
            cards.append(str(i)+"/"+str(j))
 
 # 5 Karten ausgeben
def getCards():
    picked_cards.clear()
    for i in range(5):
        length = len(cards)-1
        index = randrange(0,length)
        value = cards[index]
        cards[index], cards[length-i] = cards[length-i], value
        picked_cards.append(value)


def highestCard():
    value = []
    for i in picked_cards:
        value.append(int(i.split("/")[1])) #typecast von string auf int
    return True

 #https://www.techiedelight.com/de/find-duplicate-items-python-list/
def pair():
    value = []
    for i in picked_cards:
        value.append(int(i.split("/")[1]))
    dup = [x for i, x in enumerate(value) if x in value[:i]]#nachschauen ob Wert öfters vorkommt 
    if len(dup) == 2:
        return True
    return False

    
#4 gleiche
def twoPairs():
    value = []
    for i in picked_cards:
        value.append(int(i.split("/")[1]))
    dup = [x for i, x in enumerate(value) if x in value[:i]]#liste festgelegt
    if len(dup) == 4:
        return True
    return False

#3 gleiche
def triple():
    #https://www.lima-city.de/thread/einfache-doppelte-dreifache-elemente-einer-liste-ausgeben 
    value = []
    trip = []
    for i in picked_cards:
        value.append(int(i.split("/")[1]))
    for i in range(len(value)):                  
        if value.count(value[i])==3: 
            trip.append(value[i])
    if len(trip) == 3:
        return True
    return False

#5 in einer reihe
#1 ist die Ass, wenn an der Stelle 4 im Array die 13 
# und an 0 die 1 ist---> 1 tauschen an 13 anhängen
def straight():
    value = []
    for i in picked_cards:
        value.append(int(i.split("/")[1]))
    value.sort()
    if value[4] == 13:
        if value[0] == 1:
            value.remove(1)
            value.append(14)
    if value == list(range(min(value), max(value)+1)):
        return True
    return False
    
#fünf von derselben Farbe
def flush():
    value = []
    flush = []
    for i in picked_cards:
        value.append(int(i.split("/")[0]))
    for i in range(len(value)):                  
        if value.count(value[i])==5:
            flush.append(value[i])
    if len(flush) == 5:
        return True
    return False

#paar und drilling
def fullHouse():
    if pair() and triple():
        return True
    return False

#vier gleiche
def fourOfaKind():
    value = []
    four = []
    for i in picked_cards:
        value.append(int(i.split("/")[1]))
    for i in range(len(value)):                  
        if value.count(value[i])==4:
            four.append(value[i])
    if len(four) == 4:
        return True
    return False

#Reihenfolge in gleicher Farbe
def straightFlush():
    if flush() and straight():
        return True
    return False

#A,K, Q, J, 10, gleiche Farbe
def royalFlush():
    value = []
    for i in picked_cards:
        value.append(int(i.split("/")[1]))
    value.sort()
    if value[4] == 13:
        if value[0] == 1:
            value.remove(1)
            value.append(14)
    if flush():
        if value [0] == 10:
            if value [1] == 11:
                if value [2] == 12:
                    if value [3] == 13:
                        if value[4] == 14:
                            return True
    return False

def howOften():
    if royalFlush():
        dict["Royal Flush"] += 1
    elif straightFlush():
        dict["Straight Flush"] += 1
    elif fourOfaKind():
        dict["Four of a kind"] += 1
    elif fullHouse():
        dict["Full House"] += 1
    elif flush():
        dict["Flush"] += 1
    elif straight():
        dict["Straight"] += 1
    elif triple():
        dict["triple"] += 1
    elif twoPairs():
        dict["two Pair"] += 1
    elif pair():
        dict["Pair"] += 1
    elif highestCard():
        dict["highest Card"] += 1


if __name__ == "__main__":
    
    dict = {
        "highest Card" : 0.0,
        "Pair" : 0.0,
        "two Pair" : 0.0,
        "triple" : 0.0,
        "Straight" : 0.0,
        "Flush" : 0.0,
        "Full House" : 0.0,
        "Four of a kind" : 0.0,
        "Straight Flush" : 0.0,
        "Royal Flush" : 0.0,
    }
   
    
   
    
    deck()
    repeat = 100000
    for i in range(repeat):
        getCards()
        howOften()
        
    #Wahrscheinlichkeit
    for i in dict:
        dict[i] = (dict[i] / repeat) * 100
    print(dict)
