"""
 der neuen box muss gezeigt werden welche box vorher ist
- der letzten box muss gezeigt werden das die neue box die nächste box ist.
- der gesamten liste muss gezeigt werden dass die neue box die letzte box ist





Erweiterung fürs 2te Semester:
- als doppelt verkettete Liste implementieren

- mit einer "arrayList" als Datenstruktur implementieren
 (aber nicht die Methoden der arrayListe benutzen,
  sondern Wrapper-Methoden schreiben)

- tabellarische Aufstellung erstellen über die Aufwandsklassen,
der einzelnen Methoden aus
 den drei implementierungen (einfach-verkettet, doppelt-verkettet, arrayList)
"""

import random
#länge und tostring von der simple übernommmen

from lists.linked_list import Linked_List


class Box():
    def __init__(self, content=None, next_box=None, previous_box=None):
        self.content = content
        self.next_box = next_box
        self.previous_box = previous_box #vorherige box

#dLinkedlist erbt von LinkedList
#sieht man in der main bei aufruf von länge und ausgabe
class DLinked_List(Linked_List): 
    def __init__(self, first_box=None, last_box=None):
        self.first_box = first_box
        self.last_box = last_box

    def add_content_To_the_end(self, new_content):
        new_box = Box(content=new_content)
        if self.first_box is None:
            self.first_box = new_box
            self.last_box = new_box
            return
        new_box.previous_box = self.last_box  # adresse von verheriger Box zeigt auf neue box
        self.last_box.next_box = new_box
        self.last_box = new_box

    def delete_double(self, pos, cur=None):
        l=self.length_from_list()
        if pos > l:
            return False
        if pos ==0:
            self.first_box= self.first_box.next_box
        elif pos == l-1:
            self.last_box= self.last_box.previous_box
        else:
            cur= cur.first_box
            for i in range(0,pos):
                cur.next_box.next_box. cur.next_box.previous_node= cur
                return True

if __name__ == '__main__':
    store = DLinked_List()
    for i in range(10):
        store.add_content_To_the_end((random.randrange(10)))
    #print(store.show_inside())
    store.add_content_To_the_end(1234)
    store.add_content_To_the_end("keine Zahl")
    print("Länge der LinkedList: " + str(store.length_from_list()))
    print("---------------------------------------------")
    print("Inhalte der LinkedList:\n" + str(store.__str__()))
    store.delete(2)
    print("******")
    print(store)


