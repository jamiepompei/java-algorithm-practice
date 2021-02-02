package OtherSources;

public class PrimeNumber {

    public void primeNumberChecker(int num){


        boolean isPrime = true;
        //loop from 2 to num/2. we can loop up to halfway point, bc if it's multiple of 2, its not prime
        for(int i = 2; i <= num / 2; i ++){
            //if a num is divisible by any num that is not 1 or itself, break out of the loop, this determines num is not a prime number
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }
    }

    public void primeNumPractce(Integer num){
        boolean isPrime = true;

        for(int i =2; i < num/2; i++){
            //if num is divisible by any other num that is not 1 or itself, it is not prime
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number") ;
        }else{
            System.out.println(num + " is not a prime number");
        }


    }
}
