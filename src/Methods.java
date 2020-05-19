public class Methods {

    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloTo("Johnny");
        sayHelloTo("Peter");
        int x = returnFive();

        System.out.println(x);
        // f(x) = x * x
        int result = square(returnFive());
        System.out.println(result);
    }
    // this method both returns a value, and takes in data
    static int square(int x){
        return x * x;
    }

    //This method returns an int type with the value 5
    static int returnFive(){
        return 5;
    }

    // This method will say Hello to whatever name is passed when called
    static void sayHelloTo(String name){
        System.out.println("Hello, " + name);
    }
    // This method simply says "Hello World!"
    static void sayHelloWorld(){
        System.out.println("Hello World!");
    }
}
