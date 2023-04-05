# list= [i for i in range(1,10)]
# print(list)
"""
 programmiere Methode "am Ende Hinzufügen
- programmiere Ausgabe Länge der Datenstruktur
- Ausgabe aller Elemente
main mit exemplarischen (Zufallszahlen) Befüllen
"""
import random


class Arraylist():
    def __init__(self):
        self._list = []

    def add_content_To_the_end(self, new_content):  # das ist der wrapper
        self._list.append(new_content)

    def length_from_list(self):
        return len(self._list)

    def __str__(self):
        return self._list.__str__()

    def delete(self, index):
        del self._list[index]


if __name__ == '__main__':
    store = Arraylist()
    store.add_content_To_the_end("Teddy")
    print(store.length_from_list())
    print(store)
    for i in range(1, 10):
        store.add_content_To_the_end(random.randrange(10))
    print(store)
    store.delete(0)
    print(store)

