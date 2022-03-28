public class Main {
    public static void fizzbuzz(){
        for(int i=1;i<101;i++)
            if (i%7==0)
                System.out.print("Rizz, ");
            else if (i%11==0)
                System.out.print("Jazz, ");
            else if (i%3==0)
                if (i%5==0)
                    System.out.print("FizzBuzz, ");
                else
                    System.out.print("Fizz, ");
            else if (i%5==0)
                System.out.print("Buzz, ");
            else
                System.out.print(i+", ");
    }
    public static void main(String[] args) {
     //   fizzbuzz()
    }
}
//fizz 3
//buzz 5
//fizzbuzz 3 5
//rizz 7
//jazz 11

