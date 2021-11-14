import exercises.Exercise;
import org.junit.Assert;
import org.junit.Test;

public class ExerciseTest {

    Exercise exercise = new Exercise();

    @Test
    public void case_1() {
        Assert.assertEquals(exercise.toRomanNumber(1), "I");
    }

    @Test
    public void case_2() {
        Assert.assertEquals(exercise.toRomanNumber(4), "IV");
    }

    @Test
    public void case_3() {
        Assert.assertEquals(exercise.toRomanNumber(9), "IX");
    }

    @Test
    public void case_4() {
        Assert.assertEquals(exercise.toRomanNumber(58), "LVIII");
    }

    @Test
    public void case_5() {
        Assert.assertEquals(exercise.toRomanNumber(1994), "MCMXCIV");
    }
}
