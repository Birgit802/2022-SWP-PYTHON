# Cheatsheets
# https://www.w3schools.com/python/python_lists.asp
# https://www.w3schools.com/python/python_ref_list.asp
# https://www.programiz.com/python-programming/dictionary
# https://www.delftstack.com/de/howto/python/python-pretty-print-dictionary/
#https://www.python-forum.de


import random
import pprint

# Listen und Dictionary festlegen
my_list = []
my_dict = {}

# befüllen von Liste und Dictionary
for i in range(1, 46):
    my_list.append(i)
    my_dict[i] = 0

j = 1
# für die 1000 Ziehungen
for x in range(1001):
    # Lottoziehung -> 6 Zahlen
    while j < 6:
        # random wert mit Länge der Liste
        value = random.randint(0, len(my_list) - j)
        # wert an der Stelle der zufallszahl-wert1
        wert1 = my_list[value]
        # letzter wert der noch gezogen werden darf -wert2
        wert2 = my_list[len(my_list) - j]
        # austauschen der oben gezogen zahlen
        my_list[value] = wert2
        my_list[len(my_list) - j] = wert1
        # erhöhen des wertes im Dictionary
        my_dict[value + 1] += 1
        # Erhöhung Zähler
        j += 1  # j = j + 1 so in Java
    # zurücksetzen des zählers
    j = 1
# ausgabe des dict
# alles in einer Reihe
#print(my_dict)

# formatierte Ausgabe
print("Die gezogenen Zahlen:")
pprint.pprint(my_dict)
