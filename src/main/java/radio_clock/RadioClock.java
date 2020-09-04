package radio_clock;

public class RadioClock implements Radio, Clock {
    private Radio radio = new RadioImpl();
    private Clock clock = new ClockImpl();

    @Override
    public void c() {
        clock.c();
    }

    @Override
    public void d() {
        clock.d();
    }

    @Override
    public void a() {
        radio.a();
    }

    @Override
    public void b() {
        radio.b();
    }
}
