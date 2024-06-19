public class Main {
    public static void main(String[] args) {
        //Tworzenie serwera
        Server server;
        server = new Server(5000);
        server.listen();
    }
}