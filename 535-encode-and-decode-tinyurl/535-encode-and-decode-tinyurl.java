public class Codec {
    Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = String.format("http://tinyurl.com/%s", longUrl.hashCode());
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));