import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CaesarCodec implements Coder {
    private int key;

    public CaesarCodec(int key) {
        this.setKey(key);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public HashMap<Character, Character> codeList(int key){
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Character, Character> coderDictionary = new HashMap<>();
        for (int i = 0; i < 52; i++) {
            coderDictionary.put(alphabet[i],alphabet[(i / 26) * 26 + (i + key) % 26]);
        }
        return coderDictionary;

    }
    public HashMap<Character, Character> decodeList(int key) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Character, Character> decoderDictionary = new HashMap<>();
        for (int i = 0; i < 52; i++) {
            decoderDictionary.put(alphabet[(i / 26) * 26 + (i + key) % 26], alphabet[i]);
        }
        return decoderDictionary;
    }

    public String encode(String input){
        char[] symbols = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char symbol : symbols){
            if(codeList(key).containsValue(symbol)) {
                result.append(codeList(key).get(symbol));
            }
            else{
                result.append(symbol);
            }
        }
        return result.toString();
    }

    public String decode(String input){
        char[] symbols = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char symbol : symbols){
            if(decodeList(key).containsValue(symbol)) {
                result.append(decodeList(key).get(symbol));
            }
            else{
                result.append(symbol);
            }
        }
        return result.toString();
    }

}