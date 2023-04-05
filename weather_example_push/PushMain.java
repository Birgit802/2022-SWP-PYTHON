package weather_example_push;
/*
Modellieren Sie eine Wetterstation mittels Observer Pattern.

Ein Zentrale misst Temperatur und Luftfeuchtigkeit.
Diverse Anzeigen geben die Messwerte mittels
Bilschirm oder Farbsignalen aus.
Überlegen Sie wie man PUSH und PULL Variante
implementiert werden würde. (Also zwei Lösungen)
https://www.philipphauer.de/study/se/design-pattern/observer.php
http://www.tornau.name/2014/02/das-observer-pattern-beobachter-muster/
 */

public class PushMain {

    public static void main(String[] args) {
        Center center = new Center();
        Display d = new Display(center);
        ColorDisplay cd = new ColorDisplay(center);
       // center.setState(15, 25.7);
        cd.update(45,77);
        d.update(45,77);
        cd.update(31,66);
        d.update(12,25);
    }
}
