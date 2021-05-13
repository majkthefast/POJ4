package zadanie;

public class PoliceAlarm implements Alarm{
    @Override
    public void alarmTurnOn(PinEvent PinEvent) {
        System.out.println("Ochrona została powiadomiona");
    }

    @Override
    public void alarmTurnOff(PinEvent PinEvent) {
        System.out.println("Ochrona wraca do bazy");
    }
}
