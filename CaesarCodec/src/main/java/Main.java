public class Main {
    public static void main(String[] args) {
        CaesarCodec code = new CaesarCodec(3);
        String wordToCode = "THE QUICK, BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(code.encode(wordToCode));
        String wordToDecode = "THE QUICK, BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(code.decode(wordToDecode));

    }
}
