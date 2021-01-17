package animal.kingdom;

class Zoo {
    enum UserPosition {
        OUT, GATE, TIGERAREA, BEARAREA
    }

    UserPosition userPosition = UserPosition.OUT;

    Zoo beEntered() {
        userPosition = UserPosition.GATE;
        return this;
    }

    Zoo beExited() {
        userPosition = UserPosition.OUT;
        return this;
    }

    Zoo beEnteredTigerArea() {
        userPosition = UserPosition.TIGERAREA;
        return this;
    }
}