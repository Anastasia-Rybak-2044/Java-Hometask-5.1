import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest1 {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderlimit() {

        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

        }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverlimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

        }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderlimit() {
        BonusService service = new BonusService();

        long amount = 1_000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

        }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverlimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

        }
}