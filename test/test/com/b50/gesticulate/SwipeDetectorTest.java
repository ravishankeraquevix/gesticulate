package test.com.b50.gesticulate;

import android.view.MotionEvent;
import com.b50.gesticulate.SwipeDetector;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: aglover
 * Date: 3/18/13
 * Time: 10:20 PM
 */
public class SwipeDetectorTest {
    @Test
    public void testSwipeUpDetected() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(400);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(200);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isUpSwipe(eventOne, eventTwo, 300f);
        assertTrue("isUpSwipe was not true?", value);
    }

    @Test
    public void testSwipeUpNotDetectedVelocityNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(400);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(200);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isUpSwipe(eventOne, eventTwo, 100f);
        assertFalse("isUpSwipe was true?", value);
    }

    @Test
    public void testSwipeUpNotDetectedDueToMinDistanceNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(300);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(200);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isUpSwipe(eventOne, eventTwo, 300f);
        assertFalse("isUpSwipe was true?", value);
    }

    @Test
    public void testSwipeDownDetected() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(200);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(400);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isDownSwipe(eventOne, eventTwo, 300f);
        assertTrue("isDownSwipe was not true?", value);
    }

    @Test
    public void testSwipeDownNotDetectedVelocityNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(200);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(400);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isDownSwipe(eventOne, eventTwo, 100f);
        assertFalse("isUpSwipe was true?", value);
    }

    @Test
    public void testSwipeDownNotDetectedDueToMinDistanceNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(200);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(300);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isDownSwipe(eventOne, eventTwo, 300f);
        assertFalse("isDownSwipe was true?", value);
    }

    @Test
    public void testSwipeLeftDetected() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setX(400);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setX(200);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isLeftSwipe(eventOne, eventTwo, 300f);
        assertTrue("isLeftSwipe was not true?", value);
    }

    @Test
    public void testSwipeLeftNotDetectedVelocityNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setX(400);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setX(200);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isLeftSwipe(eventOne, eventTwo, 100f);
        assertFalse("isLeftSwipe was true?", value);
    }

    @Test
    public void testSwipeLeftNotDetectedDueToMinDistanceNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(400);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(300);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isLeftSwipe(eventOne, eventTwo, 300f);
        assertFalse("isLeftSwipe was true?", value);
    }

    @Test
    public void testSwipeRightDetected() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setX(200);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setX(400);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isRightSwipe(eventOne, eventTwo, 300f);
        assertTrue("isRightSwipe was not true?", value);
    }

    @Test
    public void testSwipeRightNotDetectedVelocityNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setX(200);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setX(400);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isRightSwipe(eventOne, eventTwo, 100f);
        assertFalse("isRightSwipe was true?", value);
    }

    @Test
    public void testSwipeRightNotDetectedDueToMinDistanceNotReached() throws Exception {
        MotionEvent eventOne = new MotionEvent();
        eventOne.setY(200);
        MotionEvent eventTwo = new MotionEvent();
        eventTwo.setY(300);
        SwipeDetector detector = new SwipeDetector();
        boolean value = detector.isRightSwipe(eventOne, eventTwo, 300f);
        assertFalse("isRightSwipe was true?", value);
    }
}
