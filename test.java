public void foo(int bar) {
    // main class
    // does something
}

public void foo(int bar) {
    System.out.println("does something more");
    super.foo(); // does something
}

class Sport {
    private int playerCount;
    private int fieldArea;

    public Sport() {
        playerCount = 10;
        fieldArea = 360;
    }

    public Sport(int playerCount, int fieldArea) {
        this.playerCount = playerCount;
        this.fieldArea = fieldArea;
    }   
}

class RacquetSport extends Sport {
    private RacquetObject racquet;

    public RacquetSport(RacquetObject racquet) {
        super();
        this.racquet = racquet;
    }

    public RacquetSport(int playerCount, int fieldArea, RacquetObject racquet) {
        super(playerCount, fieldArea);
        this.racquet = racquet;
    }
}

class Tennis extends RacquetSport {
    private String courtType;

    public Tennis() {

    }
}

Tennis tennisCourt = new Tennis("clay");