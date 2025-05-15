class RadioPlayer implements Player{

    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    private int index;

    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0.0;
        this.index = 0;
    }

    public void start() {
        if (onOff == false) {
            this.onOff = true;
            this.station =  this.stationList[0];
        }
    }

    public void stop() {
        if (onOff == true) {
            this.onOff = false;
            this.station = 0;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume = this.volume + 2;
    }

    public void volumeDown() {
        this.volume = this.volume - 2;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        index++;
        station = stationList[index];
    }

    public void previous() {
        index--;
        station = stationList[index];
    }

    public double getStation() {
        return this.station;
    }
}