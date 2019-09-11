package ecutb.peter;

public enum Valör {en(1), fem(5), tio(10), tjugo(20), femtio(50), hundra(100), femhundra(500), tusen(1000);

private int valör;

    Valör(int valör) {
        this.valör = valör;
    }

    public int getValör() {
        return valör;
    }
    public void setValör(int valör) {
        this.valör = valör;
    }







}


