
public class Stack {
    private int size;
    private int[] array;
    private int top;
    private int[] array2;

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return top;
    }
    public void setTop(int top){
        this.top = top;
    }
    public int getTop(){
        return top;
    }

    // констурктор
    public Stack(int n) {
        size = n;
        array = new int[size];
        top = -1; // -1 - пустой стек, если 0, стек не пустой
    }

    // метод проверяет пустой ли у нас стек
    public boolean isEmpty(){
        return (top==-1); // если -1, то стек пустой (true), если 0, то не пустой (false)
    }


    // добавление нового элемента
    public int push(int a) {
//        int i = ++top; // прибавляем к top 1, top =0, 0 помещаем в i
//        array[i]=a; // кладем в нулевую ячейку наше значение а или

        if (top == array.length-1) {
            array2 = new int[7];
            System.arraycopy (array, 0, array2, 0, array.length);
            top = top +1;
            array2[top]=a;
            System.out.println(array2[top] + " в ячейке " + top + " второго массива");
            for (int i=0; i<array2.length; i++)
                System.out.println(array2[i]);
        }

        else if (top < array.length-1){
            top = top + 1;
            array[top] = a;
            System.out.println(array[top] + " в ячейке " + top);

        }
        else  {
            top = top + 1;
            array2[top] = a;
            System.out.println(array2[top] + " в ячейке " + top + " второго массива");
            System.out.println("---------------------------");
            for (int i=0; i<array2.length; i++)
                System.out.println(array2[i]);

        }
        return a;
    }
    public int pop() {
//        проверяем не пустой ли стек
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        else if (top == array.length - 1) {
            System.out.println("Отрезаем последний элемент 1-го массива : " );
            return array[--top];
        } else {
            System.out.println("Отрезаем последний элемент 2-го массива : " );
            return array2[--top];         // снять последний элемент в массиве
        }
    }

    // последний элемент в массиве
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        else if (top== array.length-1){
            System.out.println("Последний элемент 1го массива : " );
            return array[top];
        } else {
            System.out.println("Последний элемент 2го массива : " );
            return array2[top]; // последний элемент массива
        }
    }
}


