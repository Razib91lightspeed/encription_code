package Encription;
import java.util.*;
public class encode {
    /**
     * Encode and decode a message using a key of values stored in
     * a queue.
     */
    public static void main(String[] args)
    {
        int[] key = {1, 12, -9, 7, -11, 3, 9};
        Integer keyValue;
        String encoded = "", decoded = "";
        Scanner sc= new Scanner(System.in);
        //String message = "We need to save planet earth " +""+
        //"from solar bodies.";
        Queue<Integer> encodingQueue = new LinkedList<Integer>();
        Queue<Integer> decodingQueue = new LinkedList<Integer>();
        System.out.print("Enter a string: ");
        String message = sc.nextLine();
        System.out.print("If you want to encode press 1 else press 2 to decode? ");

        int New_message = Integer.parseInt(sc.nextLine());

        // load key queues
        for (int scan = 0; scan < key.length; scan++)
        {
            encodingQueue.add(key[scan]);
            decodingQueue.add(key[scan]);
        }
        if (New_message==1){
            for (int scan = 0; scan < message.length(); scan++)
            {
                keyValue = encodingQueue.remove();
                encoded += (char) (message.charAt(scan) + keyValue);
                encodingQueue.add(keyValue);
            }

            System.out.println ("Encoded Message:\n" + encoded + "\n");

        } else if (New_message==2){
            // encode message
            // decode message
            for (int scan = 0; scan < message.length(); scan++)
            {
                keyValue = decodingQueue.remove();
                decoded += (char) (message.charAt(scan) - keyValue);
                decodingQueue.add(keyValue);
            }

            System.out.println ("Decoded Message:\n" + decoded);
        }
    }
}

