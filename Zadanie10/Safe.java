
package zadanie;

import java.util.ArrayList;

public class Safe {
    public ArrayList<Alarm> alarms = new ArrayList<>();
    private final String pin;

    PoliceAlarm policja = new PoliceAlarm();
    BarsAlarm kraty = new BarsAlarm();
    DogsAlarm pieski = new DogsAlarm();
    SoundAlarm sound = new SoundAlarm();

    public Safe(String pin) {
        this.pin = pin;
    }

    //Alarm jako alarm czy alarm jako powiadomienie?
    public void addAlarm(){
        alarms.add(policja);
        alarms.add(kraty);
        alarms.add(pieski);
        alarms.add(sound);
    }

    public void enterPin(String hasło){
        if (hasło.equals(pin)){
            correctPin();
        }
        else{
            wrongPin();
        }
    }
    private void wrongPin() {
        addAlarm();
        PinEvent pinEvent = new PinEvent(this);
        alarms.forEach(alarm -> alarm.alarmTurnOn(pinEvent));
    }

    private void correctPin() {
        PinEvent pinEvent = new PinEvent(this);
        alarms.forEach(alarm -> alarm.alarmTurnOff(pinEvent));
        System.out.println("Jackpot");
    }
}