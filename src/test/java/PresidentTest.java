import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PresidentTest
{
    @Test
    public void mustReturnPresidentName()
    {
        President.getInstance().setPresidentName("Joe Biden");
        assertEquals("Joe Biden", President.getInstance().getPresidentName());
    }
}