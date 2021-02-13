package Movable;

public interface Movable {

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();



}


/*
Zaimplementuj interfejs Movable , który będzie zawierać de_nicję wspólnych
zachowań dla klas MovablePoint i MovableCircle . Będą to metody:
void moveUp()
void moveDown()
void moveLeft()
void moveRigth()
Klasa MovablePoint
Klasa MovablePoint powinna implementować interfejs Movable , a ponadto
powinna zawierać 4 pola typu int : x , y , xSpeed , ySpeed . Pola x , y powinny
de_niować współrzędne punktu, natomiast pola xSpeed , ySpeed powinny
określać o ile powinny zmieniać się odpowiednie współrzędne.
metody moveUp() oraz moveDown() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej y o wskazaną wartość:
ySpeed
metody moveLeft oraz moveRight() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej x o wskazaną wartość
xSpeed
Klasa MovableCircle
Klasa MovableCircle powinna implementować interfejs Movable , a ponadto
powinna zawierać (na zasadzie kompozycji) instancję klasy MovablePoint .
Dodatkowo powinna zawierać pole niezbędne do określenia promienia koła.
metody moveUp() oraz moveDown() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej y punktu MovablePoint o
wskazaną w nim wartość: ySpeed
metody moveLeft oraz moveRight() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej x punktu MovablePoint o
wskazaną w nim wartość: xSpeed
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie. Dodatkowo
uwzględnij w przykładzie reprezentację polimor_zmu

 */