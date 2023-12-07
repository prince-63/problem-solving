import java.util.*;

class Codec {
    HashMap<String, String> map = new HashMap<>();
    int n = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encodeUrl = "http://tinyurl.com/" + n;
        n++;
        
        map.put(encodeUrl, longUrl);

        return encodeUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

public class EncodeAndDecodeTinyUrl {
    public static void main(String[] args) {
        Codec codec = new Codec();
        String url = "https://leetcode.com/problems/design-tinyurl";
        String encodeUrl = codec.encode(url);
        System.out.println("Encode: " + encodeUrl);
        System.out.println("Decode: " + codec.decode(encodeUrl));
    }
}
