package OutputSTream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SkipWhitespaceOutputStream extends FilterOutputStream {


    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public SkipWhitespaceOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        if((char)b != ' ')
            super.write(b);
    }

    public static void main(String[] args) throws IOException {
        SkipWhitespaceOutputStream skipWhitespaceOutputStream = new SkipWhitespaceOutputStream(System.out);
        String s = "ggggggg  sfaf  sfa ";
        byte[] b = s.getBytes();
        skipWhitespaceOutputStream.write(b);
        skipWhitespaceOutputStream.close();
    }
}
