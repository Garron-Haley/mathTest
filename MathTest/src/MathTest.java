import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.shape.Rectangle;


import java.awt.*;

public class MathTest extends Application {
    int score = 0;
    @Override
    public void start(Stage stage){
        Text label = new Text("Math Test");
        label.setLayoutX(150);
        label.setLayoutY(150);
        label.setFont(new Font("Times new Roman",50));

        Rectangle rectangle = new Rectangle(220, 67);
        rectangle.setFill(null);
        rectangle.setLayoutX(143);
        rectangle.setLayoutY(100);
        rectangle.setStroke(Color.BLACK);

        Pane mainpane = new Pane();
        mainpane.setMaxWidth(300);
        mainpane.getChildren().add(label);
        mainpane.getChildren().add(rectangle);

        Button tststart = new Button("Start");

        Button end = new Button("EXIT");

        tststart.setLayoutX(220);
        tststart.setLayoutY(250);
        tststart.setFont(new Font("times new roman", 21));
        tststart.setTextFill(Color.GREEN);

        end.setLayoutX(228);
        end.setLayoutY(400);
        end.setFont(new Font("times new roman", 14));
        end.setTextFill(Color.RED);

        end.setOnAction(e ->{
            System.exit(1);
        });

        mainpane.getChildren().addAll(tststart, end);

        tststart.setOnAction(e ->{
            question1(mainpane);
        });

        Scene scene = new Scene(mainpane, 500, 500);

        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();
    }
    public void question1(Pane pane){
        pane.getChildren().clear();

        int q1 = (int)(Math.random() * 1000);
        int q2 = (int)(Math.random() * 1000);

        Text label = new Text("1) What is " + q1 +" + " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) + ((int)(Math.random() * 1000))));

        RadioButton two = new RadioButton(String.valueOf(q1 + q2));

        RadioButton three = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) + ((int)(Math.random() * 1000))));

        RadioButton four = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) + ((int)(Math.random() * 1000))));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == two){
                score++;
                question2(pane);
            }
            if(group.getSelectedToggle() != two && group.getSelectedToggle() != null){
                question2(pane);
            }
        });




    }
    public void question2(Pane pane){
        pane.getChildren().clear();

        int q1 = (int)(Math.random() * 1000);
        int q2 = (int)(Math.random() * 1000);

        Text label = new Text("2) What is " + q1 +" + " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(q1 + q2));

        RadioButton two = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) + ((int)(Math.random() * 1000))));

        RadioButton three = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) + ((int)(Math.random() * 1000))));

        RadioButton four = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) + ((int)(Math.random() * 1000))));

        ToggleGroup group = new ToggleGroup();

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == one){
                score++;
                question3(pane);
            }
            if(group.getSelectedToggle() != one && group.getSelectedToggle() != null){
                question3(pane);
            }
        });

    }
    public void question3(Pane pane){
        pane.getChildren().clear();

        int q1 = (int)(Math.random() * 1000);
        int q2 = (int)(Math.random() * 1000);

        Text label = new Text("3) What is " + q1 +" - " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) - ((int)(Math.random() * 1000))));

        RadioButton two = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) - ((int)(Math.random() * 1000))));

        RadioButton three = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) - ((int)(Math.random() * 1000))));

        RadioButton four = new RadioButton(String.valueOf(q1 - q2));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == four){
                score++;
                question4(pane);
            }
            if(group.getSelectedToggle() != four && group.getSelectedToggle() != null){
                question4(pane);
            }
        });

    }
    public void question4(Pane pane){
        pane.getChildren().clear();

        int q1 = (int)(Math.random() * 1000);
        int q2 = (int)(Math.random() * 1000);

        Text label = new Text("4) What is " + q1 +" - " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(q1 - q2));

        RadioButton two = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) - ((int)(Math.random() * 1000))));

        RadioButton three = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) - ((int)(Math.random() * 1000))));

        RadioButton four = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) - ((int)(Math.random() * 1000))));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == one){
                score++;
                question5(pane);
            }
            if(group.getSelectedToggle() != one && group.getSelectedToggle() != null){
                question5(pane);
            }
        });

    }
    public void question5(Pane pane){
        pane.getChildren().clear();

        int q1 = (int)(Math.random() * 1000);
        int q2 = (int)(Math.random() * 1000);

        Text label = new Text("5) What is " + q1 +" * " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        RadioButton two = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        RadioButton three = new RadioButton(String.valueOf(q1 * q2));

        RadioButton four = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == three){
                score++;
                question6(pane);
            }
            if(group.getSelectedToggle() != three && group.getSelectedToggle() != null){
                question6(pane);
            }
        });

    }
    public void question6(Pane pane){
        pane.getChildren().clear();

        int q1 = (int)(Math.random() * 1000);
        int q2 = (int)(Math.random() * 1000);

        Text label = new Text("6) What is " + q1 +" * " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        RadioButton two = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        RadioButton three = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        RadioButton four = new RadioButton(String.valueOf(q1 * q2));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == four){
                score++;
                question7(pane);
            }
            if(group.getSelectedToggle() != four && group.getSelectedToggle() != null){
                question7(pane);
            }
        });

    }
    public void question7(Pane pane){
        pane.getChildren().clear();

        int q1 = (int)(Math.random() * 1000);
        int q2 = (int)(Math.random() * 1000);

        Text label = new Text("7) What is " + q1 +" * " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        RadioButton two = new RadioButton(String.valueOf(q1 * q2));

        RadioButton three = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        RadioButton four = new RadioButton(String.valueOf(((int)(Math.random() * 1000)) * ((int)(Math.random() * 1000))));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == two){
                score++;
                question8(pane);
            }
            if(group.getSelectedToggle() != two && group.getSelectedToggle() != null){
                question8(pane);
            }
        });

    }
    public void question8(Pane pane){
        pane.getChildren().clear();

        double q1 = (Math.random() * 1000);
        double q2 = (Math.random() * 1000);
        q1 = (double)Math.round(q1 * 100d) / 100d;
        q2 = (double)Math.round(q2 * 100d) / 100d;

        Text label = new Text("8) What is " + q1 +" / " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf((double)Math.round((q1 / q2) * 100d) / 100d));

        RadioButton two = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        RadioButton three = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        RadioButton four = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == one){
                score++;
                question9(pane);
            }
            if(group.getSelectedToggle() != one && group.getSelectedToggle() != null){
                question9(pane);
            }
        });

    }
    public void question9(Pane pane){
        pane.getChildren().clear();

        double q1 = (Math.random() * 1000);
        double q2 = (Math.random() * 1000);
        q1 = (double)Math.round(q1 * 100d) / 100d;
        q2 = (double)Math.round(q2 * 100d) / 100d;

        Text label = new Text("9) What is " + q1 +" / " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        RadioButton two = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        RadioButton three = new RadioButton(String.valueOf((double)Math.round((q1 / q2) * 100d) / 100d));

        RadioButton four = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == three){
                score++;
                question10(pane);
            }
            if(group.getSelectedToggle() != three && group.getSelectedToggle() != null){
                question10(pane);
            }
        });

    }
    public void question10(Pane pane){
        pane.getChildren().clear();

        double q1 = (Math.random() * 1000);
        double q2 = (Math.random() * 1000);
        q1 = (double)Math.round(q1 * 100d) / 100d;
        q2 = (double)Math.round(q2 * 100d) / 100d;

        Text label = new Text("10) What is " + q1 +" / " + q2);
        label.setLayoutX(0);
        label.setLayoutY(50);
        label.setFont(new Font("Times new Roman",25));

        Button sumbit = new Button("Submit question");

        pane.getChildren().add(sumbit);

        RadioButton one = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        RadioButton two = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        RadioButton three = new RadioButton(String.valueOf(
                (double) Math.round((((Math.random() * 1000)) / ((Math.random() * 1000))) * 100d) / 100d));

        RadioButton four = new RadioButton(String.valueOf((double)Math.round((q1 / q2) * 100d) / 100d));

        ToggleGroup group = new ToggleGroup();

        one.setFont(new Font("times new roman", 20));
        two.setFont(new Font("times new roman", 20));
        three.setFont(new Font("times new roman", 20));
        four.setFont(new Font("times new roman", 20));

        one.setToggleGroup(group);
        two.setToggleGroup(group);
        three.setToggleGroup(group);
        four.setToggleGroup(group);

        sumbit.setLayoutX(150);
        sumbit.setLayoutY(225);
        sumbit.setFont(new Font("times new roman", 15));

        one.setLayoutY(75);
        two.setLayoutY(125);
        three.setLayoutY(175);
        four.setLayoutY(225);

        pane.getChildren().addAll(label, one, two, three, four);

        sumbit.setOnAction(e ->{
            if(group.getSelectedToggle() == four){
                score++;
                theend(pane);
            }
            if(group.getSelectedToggle() != four && group.getSelectedToggle() != null){
                theend(pane);
            }
        });

    }
    public void theend(Pane pane){
        pane.getChildren().clear();
        Text label = new Text("Your Score is " + score + " out of 10");
        label.setLayoutX(150);
        label.setLayoutY(150);
        label.setFont(new Font("Times new Roman",50));
        Grade what = new Grade(score, pane);
        what.output();

    }

}
