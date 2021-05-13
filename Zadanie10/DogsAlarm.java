package zadanie;

public class DogsAlarm implements Alarm{
    @Override
    public void alarmTurnOn(PinEvent PinEvent) {
        System.out.println("Psy zostały wypuszczone");
    }

    @Override
    public void alarmTurnOff(PinEvent PinEvent) {
        System.out.println("Psy wróciły do budy");
    }
}
