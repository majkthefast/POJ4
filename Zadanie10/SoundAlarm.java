package zadanie;

public class SoundAlarm implements Alarm{
    @Override
    public void alarmTurnOn(PinEvent PinEvent) {
        System.out.println("Playing : Mortal Kombat Theme Song Original");
    }

    @Override
    public void alarmTurnOff(PinEvent PinEvent) {
        System.out.println("Stopping : Mortal Kombat Theme Song Original");
    }
}