class VideoPlayer implements Player{

    private boolean onOff;
    private String video;
    private int volume;
    private int currentTime;

    public VideoPlayer(String video) {
        this.video = video;
        this.volume = 0;
        this.onOff = false;
        this.currentTime = 0;
    }

    public void start() {
        if (onOff == false) {
            this.onOff = true;
        }
    }

    public void stop() {
        if (onOff == true) {
            this.onOff = false;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume = this.volume + 5;
    }

    public void volumeDown() {
        this.volume = this.volume - 5;
    }

    public int getVolume() {
        return this.volume;
    }

    public void fastForward() {
        this.currentTime = this.currentTime + 5;
    }

    public void rewind() {
        this.currentTime = this.currentTime - 5;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

}