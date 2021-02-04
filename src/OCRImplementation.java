import com.asprise.ocr.Ocr;

import java.io.File;

// https://github.com/Asprise/java-ocr-api
// 1. download .idea project
// 2. build artifact from it (project structure -> artifacts -> +)
// 3. setup it in another project (project structure -> libraries -> +)

public class OCRImplementation {

    public static void main(String[] args) {
        Ocr.setUp(); // one time setup
        Ocr ocr = new Ocr(); // create a new OCR engine
        ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
        File file = new File("F:\\Example.png");
        String s = ocr.recognize(new File[] { file },
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT); // PLAINTEXT | XML | PDF | RTF
        System.out.println("Result: " + s);
        ocr.stopEngine();
    }
}
