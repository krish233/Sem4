import java.util.Scanner;

public class Test {
    int[] arr;
    public void loop(int i,int n,int tarr[]){
        if(i==n)
            return;
        tarr[i]=new Scanner(System.in).nextInt();
        loop(++i,n,tarr);
    }
    Test(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size");
        arr=new int[s.nextInt()];
        System.out.println("Enter the elements");
        loop(0, arr.length, arr);
    }
    public void view(int i){
        if (i==arr.length)
            return;
        System.out.println(arr[i]);
        view(++i);
    }
    public static void main(String[] args) {
        Test t= new Test();
        t.view(0);
    }
}
