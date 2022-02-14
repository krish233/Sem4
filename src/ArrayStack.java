import java.util.Scanner;

class Test1{
    int[][] arr;
    Test1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row and column");
        int m=s.nextInt(),n=s.nextInt();
        arr=new int[m][];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[n];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=s.nextInt();
            }
        }
    }
    public void sum(){
        ArrayStack Ar=new ArrayStack(arr.length);
        StackByLinkedList lb= new StackByLinkedList();
        for (int i = 0; i < arr.length ; i++) {
            int s=0;
            for (int j = 0; j < arr[i].length; j++) {
                s=s+arr[j][i];
            }
            Ar.push(s);
            lb.push(s);
        }
    }
}
public class ArrayStack {
    static int arr1[],top;
    ArrayStack(int size){
        //Scanner s= new Scanner(System.in);
        //System.out.println("Enter the size for stack array");
        arr1=new int[size];
        top=-1;
    }
    public static boolean isFull(){
        return top==arr1.length-1;
    }
    public static boolean isEmpty(){
        return top==-1;
    }
    public static void push(int val){
        if (isFull())
            System.out.println("Stack Overflow");
        else {
            arr1[top+1]=val;
            top++;
        }
    }
    public static void pop(){
        if (isEmpty())
            System.out.println("Stack underflow");
        else{
            System.out.println(arr1[top]);
            top--;
        }
    }
    public static void dis(){
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
class Show{
    public static void main(String[] args) {
        Test1 t= new Test1();
        StackByLinkedList s= new StackByLinkedList();
        t.sum();
        //ArrayStack.pop();
        //ArrayStack.dis();
        s.display();
    }
}

