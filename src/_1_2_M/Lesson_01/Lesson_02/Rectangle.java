package _1_2_M.Lesson_01.Lesson_02;

public class Rectangle {

        private double width;
        private double height;
        private double result;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public void calculate() {
            result = width * height;
            System.out.println(width + " * " + height + " = " + result);
        }
    }

