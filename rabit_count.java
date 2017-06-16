
public class rabit_count{
  public static void main(String[] args){
    System.out.println("i s b");
    int i = 0, s = 1, b = 0, n;
    System.out.println(i + " " + s + " " + b);
    i += 1;
    b += s; s -= s;
    System.out.println(i + " " + s + " " + b);
    for(i = 2; i <= 24; i++){
        n = b;
        b += s;
        s = n;
        System.out.println(i + " " + s + " " + b);
    }
  }
}
