package zadanie;

import java.util.ArrayList;

public class Safe {
    public ArrayList<Alarm> alarms = new ArrayList<>();
    private final String pin;

    public Safe(String pin) {
        this.pin = pin;
    }

    //Alarm jako alarm czy alarm jako powiadomienie?
    public void addAlarm(Alarm notsafe){
        alarms.add(notsafe);
    }

    public void removeAlarm(Alarm notsafe){
        alarms.remove(notsafe);
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
        PinEvent pinEvent = new PinEvent(this);
        alarms.forEach(alarm -> alarm.alarmTurnOn(pinEvent));
        System.out.println("Invalid PIN");
    }

    private void correctPin() {
        PinEvent pinEvent = new PinEvent(this);
        alarms.forEach(alarm -> alarm.alarmTurnOff(pinEvent));
        System.out.println("Jackpot");
    }
}
