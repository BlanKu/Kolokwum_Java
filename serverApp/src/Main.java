public class Main {
    public static void main(String[] args) {
        Server server; //Tworzenie serwera
        server = new Server(5000); //Tworzenie serwera jako obiektu i ustawienie portu
        server.listen(); //Słuchanie serwera;
    }
}