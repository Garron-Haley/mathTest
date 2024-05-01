import static org.junit.Assert.*;

import javafx.scene.layout.Pane;
import org.junit.*;
import org.junit.Before;
import static org.junit.Assert.*;

import org.junit.Test;
public class GradeTest {
    Pane temp = new Pane();
    Grade grade = new Grade(1, temp);

    @Test
    public void testGrade(){
        Pane pane = grade.output();
        Pane tester = grade.output();
        assertEquals(tester, pane);
    }

}