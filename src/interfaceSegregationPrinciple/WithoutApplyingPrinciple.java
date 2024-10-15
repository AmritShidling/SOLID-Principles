package interfaceSegregationPrinciple;


/**
 * Client should not be forced implement the interface or methods they do not use
 */

interface Document{
    public void editDocument();
    public void saveDocument();
    public void printDocument();
    public void sendDocumentViaMail();


}

class PDFDocument implements Document{

    @Override
    public void editDocument() {
        throw new UnsupportedOperationException("PDF can not be edited");
    }

    @Override
    public void saveDocument() {
        // implementation
    }

    @Override
    public void printDocument() {
        // implementation
    }

    @Override
    public void sendDocumentViaMail() {
        // implementation
    }
}

class WordDocument implements Document{

    @Override
    public void editDocument() {
        // implementation
    }

    @Override
    public void saveDocument() {
        // implementation
    }

    @Override
    public void printDocument() {
        // implementation
    }

    @Override
    public void sendDocumentViaMail() {
        // implementation
    }
}
public class WithoutApplyingPrinciple {
    public static void main(String[] args) {
        Document pdf = new PDFDocument();
        Document doc = new WordDocument();
        pdf.editDocument();
    }
}
