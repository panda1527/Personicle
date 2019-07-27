package asterix.record;

public class Record {
    public static final int DEFAULT_RECORD_WIDE = (1 << 5);

    private final byte buf[];

    public Record() {
        buf = new byte[DEFAULT_RECORD_WIDE];
    }

    public byte[] get() {
        return buf;
    }
}
