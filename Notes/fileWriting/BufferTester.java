public class BufferTester {
    public static void main(String[] args) {
        BufferWriter.writeString("Hello there");
        BufferWriter.saveAndClose();
        System.out.println(BufferWriter.readString());
        BufferWriter.saveAndClose();
    }
}
