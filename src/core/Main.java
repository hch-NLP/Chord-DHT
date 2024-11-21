package core;
/**
 *
 * This class sets up the main server and the peers in this system
 *
 * @author Ma Zixiao
 *
 */

public class Main {
    public static void main(String[] args) {
        MainServer server = new MainServer();
        Peer peer1 = new Peer("10.26.128.29", 5000, 1);

        Peer peer2 = new Peer("10.26.128.29", 7000, 2);

        Peer peer3 = new Peer("10.26.128.29", 9000, 3);

        Peer peer4 = new Peer("10.26.128.29", 12000, 4);
    }
}
