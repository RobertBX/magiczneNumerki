import jdk.internal.instrumentation.Logger;
import org.apache.commons.io.FilenameUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) {

    }

    public void isFileExtensionIsTrue(File file) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        int fileSignature = input.readInt();
        input.close();
        String ext = FilenameUtils.getExtension(file.getAbsolutePath());



        if(fileSignature == 0xffd8){ ;

        }
        

    }

}
