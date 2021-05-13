package zadanie;

public class BarsAlarm implements Alarm{
    @Override
    public void alarmTurnOn(PinEvent PinEvent) {
        System.out.println("Zabezpieczono sejf");
    }

    @Override
    public void alarmTurnOff(PinEvent PinEvent) {
        System.out.println("Sejf został odbezpieczony");
    }
}