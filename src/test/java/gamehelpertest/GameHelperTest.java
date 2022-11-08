package gamehelpertest;

import org.example.GameHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 To run test, change to public error given methods and variables
 * --------------------------------------------------------
 */
class GameHelperTest {
//    @Test
//    void shouldGetCharAsIntValue() {
//        char a = 'a';
//        assertEquals(97, a);
//    }
//
//    @Test
//    void shouldConvertIntToCharA() {
//        // given
//        int columnIndex = 0;
//
//        // expect
//        assertEquals('a', columnIndex + 97);
//    }
//
//    @Test
//    void shouldConvertIntToCharG() {
//        // given
//        int columnIndex = 6;
//
//        // expect
//        assertEquals('g', columnIndex + 97);
//    }
//
//    @Test
//    void shouldConvertIndexLocationToAlphaCoords() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//
//        // expect
//        assertEquals("f3", gameHelper.getAlphaCoordsFromIndex(26));
//        assertEquals("f6", gameHelper.getAlphaCoordsFromIndex(47));
//    }
//
//    @Test
//    void shouldNotLetStartupGoOverRightEdge() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//
//        // expect
//        assertFalse(gameHelper.startupFits(new int[]{26, 27, 28}, GameHelper.HORIZONTAL_INCREMENT));
//    }
//
//    @Test
//    void shouldAllowVerticalStartups() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//
//        // expect
//        assertTrue(gameHelper.startupFits(new int[]{26, 33, 40}, GameHelper.VERTICAL_INCREMENT));
//    }
////
//    @Test
//    void shouldNotLetStartupGoOverBottom() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//
//        // expect
//        assertFalse(gameHelper.startupFits(new int[]{47, 54, 61}, GameHelper.VERTICAL_INCREMENT));
//    }
//
//    @Test
//    void shouldBeAbleToPlaceHorizontalIntoEmptyGridStartingFromValidLocation() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//
//        // when
//        int[] startupCoords = new int[]{0, 1, 2};
//        boolean success = gameHelper.coordsAvailable(startupCoords);
//
//        // then
//        assertTrue(success);
//        assertArrayEquals(new int[]{0, 1, 2}, startupCoords);
//    }
//
//    @Test
//    void shouldBeAbleToPlaceVerticalIntoEmptyGridStartingFromValidLocation() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//
//        // when
//        boolean success = gameHelper.coordsAvailable(new int[]{0, 7, 14});
//
//        // then
//        assertTrue(success);
//    }
//
//    @Test
//    void shouldNotBeAbleToPlaceHorizontalIntoGridAtSameLocationAsExisting() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//        gameHelper.savePositionToGrid(new int[]{8, 9, 10}); // "B1"
//        System.out.println(gameHelper);
//
//        // when
//        boolean success = gameHelper.coordsAvailable(new int[]{9, 10, 11}); // "C1" - horizontal
//        System.out.println(gameHelper);
//
//        // then
//        assertFalse(success);
//    }
//
//    @Test
//    void shouldNotBeAbleToPlaceVerticalIntoGridAtSameLocationAsExisting() {
//        // given
//        GameHelper gameHelper = new GameHelper();
//        gameHelper.savePositionToGrid(new int[]{8, 9, 10}); // "B1"
//        System.out.println(gameHelper);
//
//        // when
//        int[] startupCoords = new int[]{1, 9, 16};
//        boolean success = gameHelper.coordsAvailable(startupCoords); // "A1" - vertical
//        System.out.println(gameHelper);
//
//        // then
//        assertFalse(success);
//    }
//
//    @Test
//    void shouldTurnIndexIntoAlphaCoords() {
//        GameHelper gameHelper = new GameHelper();
//        assertEquals("f3", gameHelper.getAlphaCoordsFromIndex(26));
//    }
}
