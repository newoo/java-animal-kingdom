package animal.kingdom;

import org.junit.jupiter.api.Test;

import animal.kingdom.Zoo.*;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    @Test void zooBeingLoaded() {
        Zoo zoo = new Zoo();
        assertEquals(UserPosition.OUT, zoo.userPosition);
    }

    @Test void enteredZoo() {
        Zoo zoo = new Zoo();
        assertEquals(UserPosition.OUT, zoo.userPosition);

        zoo.beEntered();
        assertEquals(UserPosition.GATE, zoo.userPosition);
    }

    @Test void exitedZoo() {
        Zoo zoo = new Zoo();
        zoo.beExited();
        assertEquals(UserPosition.OUT, zoo.userPosition);
    }

    @Test void enteredTigerArea() {
        Zoo zoo = new Zoo();
        zoo.beEnteredTigerArea(); 
        assertEquals(UserPosition.TIGERAREA, zoo.userPosition);
    }
}
