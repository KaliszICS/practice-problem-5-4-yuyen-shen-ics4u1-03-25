class MusicPlayer implements Player{

    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int index;

    public MusicPlayer (String[] musicList) {
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
        this.index = 0;
    }

    public void start() {
        if (onOff == false) {
            this.onOff = true;
            currentSong = musicList[0];
        }
    }

    public void stop() {
        if (onOff == true) {
            this.onOff = false;
            this.currentSong = "";
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume = this.volume + 1;
    }

    public void volumeDown() {
        this.volume = this.volume - 1;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        index++;
        currentSong = musicList[index];
    }

    public void previous() {
        index--;
        currentSong = musicList[index];
    }

    public String getCurrentSong() {
        return this.currentSong;
    }
}