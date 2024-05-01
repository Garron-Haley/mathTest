import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Grade {
    int grade;
    Pane pane;
    Grade(){
        grade = 0;
        pane = null;
    }
    Grade(int newGrade, Pane newPane){
        grade = newGrade;
        pane = newPane;
    }


    void setGrade(int newGrade, Pane newPane){
        grade = newGrade;
        pane = newPane;

    }
    Pane output(){
        if (grade == 10){
            Line line = new Line();
            line.setStartX(0);
            line.setEndX(500);
            line.setLayoutY(30);
            Text label = new Text("Your Score is " + grade + " out of 10");
            label.setLayoutX(100);
            label.setLayoutY(25);
            label.setFont(new Font("Times new Roman",25));
            Text congrats = new Text("You got 100% congratulations!!! ");
            Text grade = new Text("Your grade is an A");
            congrats.setFont(new Font("times new roman", 18));
            grade.setFont(new Font("times new roman", 18));
            congrats.setLayoutY(50);
            grade.setLayoutY(100);
            pane.getChildren().addAll(congrats, grade, label, line);
        }
        if (grade == 9){
            Line line = new Line();
            line.setStartX(0);
            line.setEndX(500);
            line.setLayoutY(30);
            Text label = new Text("Your Score is " + grade + " out of 10");
            label.setLayoutX(100);
            label.setLayoutY(25);
            label.setFont(new Font("Times new Roman",25));
            Text congrats = new Text("You got 90% Well Done! ");
            Text grade = new Text("Your grade is an A");
            congrats.setFont(new Font("times new roman", 18));
            grade.setFont(new Font("times new roman", 18));
            congrats.setLayoutY(50);
            grade.setLayoutY(100);
            pane.getChildren().addAll(congrats, grade, label, line);
        }
        if (grade == 8){
            Line line = new Line();
            line.setStartX(0);
            line.setEndX(500);
            line.setLayoutY(30);
            Text label = new Text("Your Score is " + grade + " out of 10");
            label.setLayoutX(100);
            label.setLayoutY(25);
            label.setFont(new Font("Times new Roman",25));
            Text congrats = new Text("You got 80% Good Job");
            Text grade = new Text("Your grade is an B");
            congrats.setFont(new Font("times new roman", 18));
            grade.setFont(new Font("times new roman", 18));
            congrats.setLayoutY(50);
            grade.setLayoutY(100);
            pane.getChildren().addAll(congrats, grade, label,line);
        }
        if (grade == 7){
            Line line = new Line();
            line.setStartX(0);
            line.setEndX(500);
            line.setLayoutY(30);
            Text label = new Text("Your Score is " + grade + " out of 10");
            label.setLayoutX(100);
            label.setLayoutY(25);
            label.setFont(new Font("Times new Roman",25));
            Text congrats = new Text("You got 70% ");
            Text grade = new Text("Your grade is an C");
            congrats.setFont(new Font("times new roman", 18));
            grade.setFont(new Font("times new roman", 18));
            congrats.setLayoutY(50);
            grade.setLayoutY(100);
            pane.getChildren().addAll(congrats, grade, label, line);
        }
        if (grade == 6){
            Line line = new Line();
            line.setStartX(0);
            line.setEndX(500);
            line.setLayoutY(30);
            Text label = new Text("Your Score is " + grade + " out of 10");
            label.setLayoutX(100);
            label.setLayoutY(25);
            label.setFont(new Font("Times new Roman",25));

            Text congrats = new Text("You got 60% ");
            Text grade = new Text("Your grade is an C");
            congrats.setFont(new Font("times new roman", 18));
            grade.setFont(new Font("times new roman", 18));
            congrats.setLayoutY(50);
            grade.setLayoutY(100);
            pane.getChildren().addAll(congrats, grade, label, line);
        }
        if (grade < 6){
            Line line = new Line();
            line.setStartX(0);
            line.setEndX(500);
            line.setLayoutY(30);
            Text label = new Text("Your Score is " + grade + " out of 10");
            label.setLayoutX(100);
            label.setLayoutY(25);
            label.setFont(new Font("Times new Roman",25));
            Text congrats = new Text("You Failed ");
            Text grade = new Text("Your grade is an F");
            congrats.setFont(new Font("times new roman", 18));
            grade.setFont(new Font("times new roman", 18));
            congrats.setLayoutY(50);
            grade.setLayoutY(100);
            pane.getChildren().addAll(congrats, grade, label, line);
        }
        return pane;
    }
}
