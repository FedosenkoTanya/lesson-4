/**
 * Created by Stud on 27.09.2018.
 */
public class Massiv {
    private int[] mas;

    public Massiv (int s){ //�������� ������� ����� ����� ����������� s
        mas = new int[s];
    }

    public void set_mas(int cost, int i){ //����� ������������� �������� �������(i - ����� ��-��, cost - ��-��)
        mas[i] = cost;
    }

    public int get_size(){ //������ �������
        return mas.length;
    }

    public void print_mas(){ //����� �������
        System.out.print("Massiv: ");
        for(int i : mas)
            System.out.print(i + " ");
        System.out.println();
    }

    public int get_element(int index){ //����� ��������� � ���������� �������� ������� � ���������
        if(index < mas.length) {
            index = mas[index];
        }
        else {
            throw new RuntimeException("Error");  //����������
        }
        return index;
    }


    public void sum (Massiv a){ //�������� ���� ��������
        if(mas.length == a.get_size()){
            for(int i = 0; i < mas.length; ++i)
                mas[i] += a.get_element(i);
        }
        else {
            throw new RuntimeException("Error");  //����������
        }
    }

    public void min (Massiv a){ //��������� ���� ��������
        if(mas.length == a.get_size()){
            for(int i = 0; i < mas.length; ++i)
                mas[i] -= a.get_element(i);
        }
        else {
            throw new RuntimeException("Error");  //����������
        }
    }

    public void multiplication (int scalar){ //��������� �� ������
        for(int i = 0; i < mas.length; ++i)
            mas[i] *= scalar;
    }

    public void division (int scalar){ //������� �� ������
        for(int i = 0; i < mas.length; ++i)
            mas[i] /= scalar;
    }
}


