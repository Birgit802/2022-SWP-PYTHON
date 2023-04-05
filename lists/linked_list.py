"""
Folgende Anforderungen sind gegeben:
- Datenstruktur als Objekt instanzierbar
- Ganzahl-werte als Werte der Datenstruktur
- programmiere Methode "am Ende Hinzufügen
- programmiere Ausgabe Länge der Datenstruktur
- Ausgabe aller Elemente
main mit exemplarischen (Zufallszahlen) Befüllen

:-) Einserkandidaten implemntieren auch andere übliche Listenmthoden!
"""
import random

class Box():
    def __init__(self, content=None, next_box=None):  # der Inhalt  und die Adresse= next_box
        self.content = content
        self.next_box = next_box  # zum vorstellen Adresse


class Linked_List():
    def __init__(self, first_box=None):  # ich schau mir an was wo drin ist
        self.first_box = first_box
#Methode kann verwendet werden ob nächste Box exisiert
#in den folgenden Methoden wurden eigene Abfragen geschrieben
    def has_next_box(self):  # oop self bei if und methode
        if self.first_box is None:  # gibt es überhaupt schon eine vorhandene box
            return False  # wenn nein dann gib false zurück
        # self.first_box.next_box :ich hole mir next_box über first_box von self(Linked_List)
        # Wenn die next_box, welche in first_box ist, wobei die firstbox in self/Linked_list ist,, nicht None ist, dann...
        if self.first_box.next_box is not None:  # wenn es eine box gibt
            return True  # wenn ja dann gib true zurück
        return False

# wird für andere Methoden nicht benutzt weil da Helper verwendet werden
    def next_box(self):  # (gehe zur nächsten box)
        box = self.first_box  # eine box holen
        next_box = box.next_box  # die nächste box mit der nächsten addresse--einfach . drücken
        self.first_box = next_box  # die box die ich gebaut hab soll jetzt die box mit der nächsten addresse sein
        # die erste box ist jetzt die box mit der neuen adresse

    def get_first_box(self):
        # box = self.first_box  # um was zu kriegen muss ich was bauen
        # goods = box.content
        # goods = self.first_box.content  # ich schau rein ob was drin ist, inhalt wurde in boxklasse
        # return goods  # festgelegt als content und dann geb ich content zurück
        return self.first_box.content

    def add_content_To_the_end(self, new_content):
        new_box = Box(content=new_content)
        if self.first_box is None:
            self.first_box = new_box
            return
        helper = self.first_box
        while helper.next_box is not None:
            # self.next_box() #funktioniert nicht mehr da ich die arbeit einem helper gegeben habe
            helper = helper.next_box
        helper.next_box = new_box  # zugreifen ist self.first_box.next_box- der wert vor dem = und wird mit new_box überschrieben

    def length_from_list(self):
        value = 0  # bei 0 fängt er zu zählen an ob was da ist
        if self.first_box is None:  # wenn die erste box nix ist gibt value=0 zurück
            return value  # wenn nix drin bin ich fertig
        helper = self.first_box
        value = 1  # startwert weil was drin ist
        while helper.next_box is not None:
            helper = helper.next_box
            value += 1  # erhöhe den wert und gib es zurück
        return value

    def delete (self,index):
        counter = 0
        if self.first_box is None:
            return
        helper = self.first_box
        counter = 1
        while helper.next_box is not None and counter < index:
            helper = helper.next_box
            counter +=1
        if helper.next_box is not None:
            helper.next_box= helper.next_box.next_box

    def __str__(self):
        out = ""
        if self.first_box is None:
            #print("Inhalt zu Beginn:\n nix drin ")
            return out
        helper = self.first_box
        while helper.next_box is not None:
            out += str(helper.content) + '\n'
            helper = helper.next_box
        out += str(helper.content)
        return out



if __name__ == '__main__':
    storage = Linked_List()
    #print( storage)
    print("Startlänge :\n" + str(storage.length_from_list()))  # hinzufügen
    storage.add_content_To_the_end("Teddybär")
    storage.add_content_To_the_end(765678)
    storage.add_content_To_the_end(27)
    #print(storage.length_from_list())  # ausgabe länge
    for i in range(10):
        storage.add_content_To_the_end(random.randrange(10))
    print("Länge der LinkedList: " + str(storage.length_from_list()))
    print("---------------------------------------------")
    print("Inhalte der LinkedList:\n" + str(storage.__str__()))
    storage.delete(2)
    print("******")
    print(storage)

