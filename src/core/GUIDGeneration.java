package core;
import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.UUID;

/**
 *
 * This class is used to generate GUID for this system
 *
 * The GUID of resources is generated according to their contents and the hashing algorithm is SHA-1
 *
 * The GUID of peers is generated by the algorithm UUID
 *
 * @author Ma Zixiao
 *
 */

public class GUIDGeneration {

    public static String generateResourceGUID(String path) {

        byte[] data;

        int num;
        MessageDigest messageDigest;
        try (FileInputStream stream = new FileInputStream(path)) {

            data = new byte[1024];

            messageDigest = MessageDigest.getInstance("SHA-1");

            while ((num = stream.read(data)) > 0) {
                messageDigest.update(data, 0, num);
            }

            byte[] hash = messageDigest.digest();

            return DatatypeConverter.printHexBinary(hash);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static String generatePeerGUID() {
        return UUID.randomUUID().toString();
    }

}
