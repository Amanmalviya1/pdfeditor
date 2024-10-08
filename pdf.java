import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
            throws IOException
    {


        File file
                = new File("D:\\pdf\\mypdf.pdf");

        PDDocument document;
        document = PDDocument.load(file);



        Splitter splitting = new Splitter();


        List<PDDocument> Page = splitting.split(document);


        Iterator<PDDocument> iteration
                = Page.listIterator();


        int j = 1;
        while (iteration.hasNext()) {
            PDDocument pd = iteration.next();
            pd.save("D:\\pdf\\mypdf"
                    + j++ + ".pdf");
        }
        System.out.println("Splitted Pdf Successfully.");
    }
}
