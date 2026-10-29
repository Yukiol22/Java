public class Television {
    private int channel;
    private boolean isOn;

    public Television(){
        channel = 1;
        isOn = false;
    }

    public void setChannel(int channel) {
        if (this.channel > 10){
            this.channel = 1;
        }else {
            this.channel = channel;
        }

    }
    public boolean isOn() {
        return isOn;
    }

    public int getChannel() {
        return channel;
    }
     boolean pressOnOff(){
         isOn = !isOn;
         return isOn;
    }
}
