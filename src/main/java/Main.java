import jdk.internal.instrumentation.Logger;
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




        if(fileSignature == 0xffd8){
            if(ext.equals("jpg") || ext.equals("jpeg")){
                System.out.println("this is a " + ext + " file");
                return true;
            }else {
                System.out.println("extension is " + ext + " while actual extension is  "+ checkWhatsTheExtension(fileSignature));
                return false;
            }


        }


        return false;

    }

    private String checkWhatsTheExtension ( int fileSignature){
        if(fileSignature == 0xffd8){
            return "jpg or jpeg";
        }else if(fileSignature ==0){
            return "txt";
        }else if(fileSignature == 0x47) {
            return "gif";
        }else return "unknown data type";
    }
}
