import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class GameScoreCalculatorTest {

    private GameScoreCalculator calculator = new GameScoreCalculator();
  
    @Test
    public void testCalculateScore_LevelZeroBonusNegative_IllegalArgumentException() {
        // given
        int levelCompleted = 0;
        int bonusPoints = -1;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelZeroBonusZero_IllegalArgumentException() {
        // given
        int levelCompleted = 0;
        int bonusPoints = 0;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelZeroBonusFortyNine_IllegalArgumentException() {
        // given
        int levelCompleted = 0;
        int bonusPoints = 49;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }
   
    @Test
    public void testCalculateScore_LevelZeroBonusFifty_IllegalArgumentException() {
        // given
        int levelCompleted = 0;
        int bonusPoints = 50;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelZeroBonusTwoHundred_IllegalArgumentException() {
        // given
        int levelCompleted = 0;
        int bonusPoints = 200;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelOneBonusNegative_IllegalArgumentException() {
        // given
        int levelCompleted = 1;
        int bonusPoints = -1;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelOneBonusZero_Expected100() {
        // given
        int levelCompleted = 1;
        int bonusPoints = 0;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(100, score);
    }

    @Test
    public void testCalculateScore_LevelOneBonusFortyNine_Expected149() {
        // given
        int levelCompleted = 1;
        int bonusPoints = 49;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(149, score);
    }

    @Test
    public void testCalculateScore_LevelOneBonusFifty_Expected150() {
        // given
        int levelCompleted = 1;
        int bonusPoints = 50;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(150, score);
    }

    @Test
    public void testCalculateScore_LevelOneBonusTwoHundred_Expected300() {
        // given
        int levelCompleted = 1;
        int bonusPoints = 200;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(300, score);
    }

    @Test
    public void testCalculateScore_LevelFiveBonusNegative_IllegalArgumentException() {
        // given
        int levelCompleted = 5;
        int bonusPoints = -1;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelFiveBonusZero_Expected500() {
        // given
        int levelCompleted = 5;
        int bonusPoints = 0;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(500, score);
    }

    @Test
    public void testCalculateScore_LevelFiveBonusFortyNine_Expected549() {
        // given
        int levelCompleted = 5;
        int bonusPoints = 49;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(549, score);
    }

    @Test
    public void testCalculateScore_LevelFiveBonusFifty_Expected600() {
        // given
        int levelCompleted = 5;
        int bonusPoints = 50;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(600, score);
    }

    @Test
    public void testCalculateScore_LevelFiveBonusTwoHundred_Expected900() {
        // given
        int levelCompleted = 5;
        int bonusPoints = 200;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(900, score);
    }

    @Test
    public void testCalculateScore_LevelTenBonusNegative_IllegalArgumentException() {
        // given
        int levelCompleted = 10;
        int bonusPoints = -1;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelTenBonusZero_Expected1000() {
        // given
        int levelCompleted = 10;
        int bonusPoints = 0;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(1000, score);
    }

    @Test
    public void testCalculateScore_LevelTenBonusFortyNine_Expected1049() {
        // given
        int levelCompleted = 10;
        int bonusPoints = 49;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(1049, score);
    }

    @Test
    public void testCalculateScore_LevelTenBonusFifty_Expected1100() {
        // given
        int levelCompleted = 10;
        int bonusPoints = 50;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(1100, score);
    }

    @Test
    public void testCalculateScore_LevelTenBonusTwoHundred_Expected1400() {
        // given
        int levelCompleted = 10;
        int bonusPoints = 200;

        // when
        int score = calculator.calculateScore(levelCompleted, bonusPoints);

        // then
        assertEquals(1400, score);
    }

    @Test
    public void testCalculateScore_LevelElevenBonusNegative_IllegalArgumentException() {
        // given
        int levelCompleted = 11;
        int bonusPoints = -1;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelElevenBonusZero_IllegalArgumentException() {
        // given
        int levelCompleted = 11;
        int bonusPoints = 0;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelElevenBonusFortyNine_IllegalArgumentException() {
        // given
        int levelCompleted = 11;
        int bonusPoints = 49;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelElevenBonusFifty_IllegalArgumentException() {
        // given
        int levelCompleted = 11;
        int bonusPoints = 50;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testCalculateScore_LevelElevenBonusTwoHundred_IllegalArgumentException() {
        // given
        int levelCompleted = 11;
        int bonusPoints = 200;

        // when 
        Executable executable = () -> calculator.calculateScore(levelCompleted, bonusPoints);
        
        // then
        assertThrows(IllegalArgumentException.class, executable);
    }

}