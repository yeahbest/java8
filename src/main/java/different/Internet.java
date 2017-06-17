package different;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Krzysiek on 2017-06-16.
 */
public class Internet {


    public static void main(String[] args) throws Exception{
        InetAddress address = null;
        address = InetAddress.getLocalHost();
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
        System.out.println();
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getenv("USERNAME"));
        System.out.println(System.getProperty("os.name"));

    }
    private void getAddress(){
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.onet.pl");
        } catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostName() + " " + address.getHostAddress());
        System.exit(2);
    }
    }

