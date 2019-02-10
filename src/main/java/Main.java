
import org.apache.commons.io.FilenameUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) {
    }

    public boolean isFileExtensionIsTrue(File file) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        int fileSignature = input.readInt();
        input.close();
        String ext = FilenameUtils.getExtension(file.getPath());

        if (checkWhatsTheExtension(fileSignature).equals(ext)) {
            System.out.println("this is a " + ext + " file");
            return true;
        } else if (checkWhatsTheExtension(fileSignature).equals("unknown data type")) {
            throw new IllegalArgumentException("Unhandled data type");
        } else {
            System.out.println("extension is " + ext + " while actual extension is  " + checkWhatsTheExtension(fileSignature));
            return false;
        }
    }

    private String checkWhatsTheExtension(int fileSignature) {
        if (fileSignature == 0xffd8) {
            return "jpg";
        } else if (fileSignature == 0xFEFF) {
            return "txt";
        } else if (fileSignature == 0xEFBBBF) {
            return "txt";
        } else if (fileSignature == 0xFFFE) {
            return "txt";
        } else if (fileSignature == 0x47) {
            return "gif";
        } else if (fileSignature == 0x49) {
            return "gif";
        } else if (fileSignature == 0x46) {
            return "gif";
        } else if (fileSignature == 0x38) {
            return "gif";
        } else if (fileSignature == 0x39) {
            return "gif";
        } else if (fileSignature == 0x61) {
            return "gif";
        } else if (fileSignature == 0x37) {
            return "gif";
        } else return "unknown data type";
    }
}
