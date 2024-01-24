import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        //(1) Girilen İki Sayının Toplamını Bulan Program
        System.out.println("Lütfen iki sayı giriniz!");
        System.out.print("İlk Sayı:");
        double number1 = scanner.nextDouble();
        System.out.print("İkinci Sayı:");
        double number2 = scanner.nextDouble();
        double sum = number1 + number2;
        System.out.printf("Girilen iki sayının toplamı:%s",sum);
        */

        /*
        //(2) Girilen Metnin Kelime Sayısını Bulan Program
        System.out.print("Bir cümle giriniz:");
        String entered_text = scanner.nextLine();
        int counter = 0;
        int index = 0;
        for(char c: entered_text.trim().toCharArray()){
            if(c == ' ' && entered_text.trim().toCharArray()[index - 1] != ' ') counter++;
            index++;
        }
        System.out.print("Metindeki sözcük sayısı:" + (counter + 1));
        */

        /*
        //(3) 1'den Girilen Sayıya Kadar Toplayan Program
        System.out.print("1'den hangi sayıya kadar toplamak istiyorsunuz:");
        long lastnumber = scanner.nextLong();
        long toplam = 0;
        for(int i = 1;i <= lastnumber;i++) toplam+= i;
        System.out.print("1'den "+ lastnumber + " kadar sayıların toplamı:" + toplam);
        */

        /*
        //(4) Girilen İki Sayıdan Büyük Olanı Bulan Program
        System.out.print("İlk Sayı:");
        double firstnumber = scanner.nextDouble();
        System.out.print("İkinci Sayı:");
        double secondnumber = scanner.nextDouble();

        if(firstnumber > secondnumber) System.out.print("İlk sayı daha büyük.");
        else if (firstnumber == secondnumber) System.out.print("İki sayı birbirine eşit.");
        else System.out.print("İkinci sayı daha büyük.");
        */

        /*
        //(5) Girilen Sayının Çift mi Tek mi Olduğunu Bulan Program
        System.out.print("Sayı giriniz:");
        int number = scanner.nextInt();
        if(number % 2 == 0) System.out.print("Sayı çift.");
        else System.out.print("Sayı tek.");
        */

        /*
        //(6) Asal Sayı Bulan Program
        System.out.print("Sayı giriniz:");
        long number = scanner.nextLong();
        boolean is_prime = true;
        for(long i = 2;i <= number/2;i++){
            if(number % i == 0){
                is_prime = false;
                System.out.print("Sayı asal değildir.");
                break;
            }
        }
        if (is_prime){
            System.out.print("Sayı asaldır.");
        }
        */

        /*
        //(7) Fibonacci Programı
        System.out.print("Kaçıncı fibonacci elemanını bulmak istiyorsunuz?:");
        long fibonumber = scanner.nextInt();
        long fibo1 = 1;
        long fibo2 = 1;
        long fibo3 = 2;

        for(long i = 4;i <= fibonumber;i++){
            fibo1 = fibo2;
            fibo2 = fibo3;
            fibo3 = fibo1 + fibo2;
        }

        System.out.print(fibonumber + ".fibonacci elemanı:" + fibo3);
        */

        /*
        //(8) Mükemmel Sayı Bulma Programı
        System.out.print("Sayı giriniz:");
        int number = scanner.nextInt();
        int sum = 0;

        for(int i = 1;i <= number/2;i++){
            if(number % i == 0) sum += i;
        }

        if(sum == number) System.out.print(number + " mükemmel sayıdır.");
        else System.out.print(number + " mükemmel sayı değildir.");

         */

        /*
        //(9) Girilen Sütun ve Satıra Göre Dikdörtgen Çizme
        System.out.print("Sütun giriniz:");
        int column = scanner.nextInt();
        System.out.print("Satır giriniz:");
        int row = scanner.nextInt();

        for(int r = 1;r <= row;r++){
            for(int c = 1;c <= column;c++){
                System.out.print("X");
            }
            System.out.print("\n");
        }
        */

        /*
        //(10) Faktöriyel Hesaplama
        System.out.print("Sayı giriniz:");
        long number = scanner.nextInt();
        long factorial = 1;
        for(long i = 2;i <= number;i++){
            factorial *= i;
        }
        System.out.print(number + " sayısının faktöryeli:" + factorial);
        */
    }
}