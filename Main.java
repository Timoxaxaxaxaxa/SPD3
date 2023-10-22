public class Main {
    public static void main(String[] args) { //main running class
        AmericanPlug plug = new Adapter(); //create new object for adapter
        plug.ConnectLaptop(); //calling java method which replace with php method
        plug.ConnectTeapot(); //calling java method which replace with php method
        plug.ConnectTV(); //calling java method which replace with php method
    }
}