/**
 * Created by Stud on 27.09.2018.
 */
public class class_Main {

        public static void main(String[] args) {
            Massiv m = new Massiv(4);

            m.set_mas(1, 0);
            m.set_mas(2, 1);
            m.set_mas(3, 2);
            m.set_mas(4, 3);

            m.print_mas();

            Massiv m1 = new Massiv(4);

            m1.set_mas(1, 0);
            m1.set_mas(2, 1);
            m1.set_mas(3, 2);
            m1.set_mas(4, 3);

            m1.print_mas();

            m.sum(m1);
            m.print_mas();

            m.min(m1);
            m.print_mas();

            m.multiplication(3);
            m.print_mas();

            m.division(3);
            m.print_mas();


        }
    }

