/**
 * Created by Stud on 27.09.2018.
 */
public class Massiv {
    private int[] mas;

    public Massiv (int s){ //создание массива целых чисел размерности s
        mas = new int[s];
    }

    public void set_mas(int cost, int i){ //метод инициализации элемента массива(i - номер эл-та, cost - ст-ть)
        mas[i] = cost;
    }

    public int get_size(){ //размер массива
        return mas.length;
    }

    public void print_mas(){ //вывод массива
        System.out.print("Massiv: ");
        for(int i : mas)
            System.out.print(i + " ");
        System.out.println();
    }

    public int get_element(int index){ //метод обращени€ к отдельному элементу массива с проверкой
        if(index < mas.length) {
            index = mas[index];
        }
        else {
            throw new RuntimeException("Error");  //исключение
        }
        return index;
    }


    public void sum (Massiv a){ //сложение двух массивов
        if(mas.length == a.get_size()){
            for(int i = 0; i < mas.length; ++i)
                mas[i] += a.get_element(i);
        }
        else {
            throw new RuntimeException("Error");  //исключение
        }
    }

    public void min (Massiv a){ //вычетание двух массивов
        if(mas.length == a.get_size()){
            for(int i = 0; i < mas.length; ++i)
                mas[i] -= a.get_element(i);
        }
        else {
            throw new RuntimeException("Error");  //исключение
        }
    }

    public void multiplication (int scalar){ //умножение на скал€р
        for(int i = 0; i < mas.length; ++i)
            mas[i] *= scalar;
    }

    public void division (int scalar){ //деление на скал€р
        for(int i = 0; i < mas.length; ++i)
            mas[i] /= scalar;
    }
}


