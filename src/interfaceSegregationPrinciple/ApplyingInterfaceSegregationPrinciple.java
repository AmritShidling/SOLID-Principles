package interfaceSegregationPrinciple;

/**
 * Interface Segregation Principle States that client should not be forced to implement interface or method which it does not use.
 */

interface OpenSave{
    public void open();
    public void save();
}
interface Edit{
    public void edit();
}

interface SentViaEmail{
    void sendViaEmail();
}
class PDFDoc implements OpenSave, SentViaEmail {

    @Override
    public void open() {

    }

    @Override
    public void save() {

    }

    @Override
    public void sendViaEmail() {

    }
}

class WordDoc implements OpenSave, Edit, SentViaEmail{

    @Override
    public void open() {

    }

    @Override
    public void save() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void sendViaEmail() {

    }
}

public class ApplyingInterfaceSegregationPrinciple {
    public static void main(String[] args) {
        WordDoc wordDoc = new WordDoc();
        PDFDoc pdfDoc = new PDFDoc();
    }
}
