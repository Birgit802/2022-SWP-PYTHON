"""insgesamt 52 Pokerkarten
beinhalten die vier Farben Kreuz, Pik, Herz und Karo
sowie die Karten 2, 3, 4, 5, 6, 7, 8, 9, 10,
    Bube, Dame, König und Ass
    wie kann man die Pokerkarten modellieren (vier Farben, 13 Symbole)
    -ich möchte etwas mit 2 Werten ausgeben--Spielfeld wie Java--for
    -Funktionalität vom Lotto mit etwas ausgeben

    """

from random import random, randrange

# Liste anlegen Karten und gezogene
# erste for-loop für die 4 Farben
# zweite for-loop  für alles andere
#
card_deck = []
taken_cards = []
for i in range(4):
    for j in range(1, 14):
        card_deck.append(str(i) + "|" + str(j))

# Kontrolle loops funktionieren
# Ausgabe geordnet
# print(card_deck)


# 5 Karten ausgeben


for i in range(5):
    card_length = len(card_deck) - 1
    card_index = randrange(0, card_length)
    card_value = card_deck[card_index]
    card_deck[card_index], card_deck[card_length - i] = card_deck[card_length - i], card_value
    taken_cards.append(card_value)

print(card_deck)
print()
print(taken_cards)


