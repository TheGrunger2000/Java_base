class DataTypes {
    byte a = 0; // from -128 to +128 (1 byte of memory)
    short b = 1234; // 2 bytes of memory (~65 000)
    int c = 2342145; // 4 bytes of memory (~ 4 000 000)
    long d = 456734674; // 8 bytes of memory (2^63)
    float e = 56.6567f; // 4 bytes
    double f = 45643.65478; // 8 bytes
    boolean g = false; // only true or false
    char h = 'a'; // only one but any symbol

    public static void main(System[] args)
    {
        System.out.println("All primitive data types");
    }
}
