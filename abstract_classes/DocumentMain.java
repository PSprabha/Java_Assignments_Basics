package abstract_classes;


abstract class Document 
{
 protected String fileName;
 protected double fileSize;

 public Document(String fileName, double fileSize)
 {
     this.fileName = fileName;
     this.fileSize = fileSize;
 }

 public abstract void open();
 public abstract void save();
 public abstract String getFileType();

 public void displayInfo()
 {
     System.out.println("File Name: " + fileName);
     System.out.println("File Size: " + fileSize + " MB");
     System.out.println("File Type: " + getFileType());
     System.out.println("-------------------------");
 }
}



class PDFDocument extends Document 
{
 public PDFDocument(String fileName, double fileSize)
 {
     super(fileName, fileSize);
 }

 @Override
 public void open() 
 {
     System.out.println("Opening PDF document: " + fileName);
 }

 @Override
 public void save() 
 {
     System.out.println("Saving PDF document: " + fileName);
 }

 @Override
 public String getFileType() 
 {
     return "PDF";
 }
}



class TextDocument extends Document 
{
 public TextDocument(String fileName, double fileSize) 
 {
     super(fileName, fileSize);
 }

 @Override
 public void open() 
 {
     System.out.println("Opening text document: " + fileName);
 }

 @Override
 public void save() 
 {
     System.out.println("Saving text document: " + fileName);
 }

 @Override
 public String getFileType()
 {
     return "Text";
 }
}



class ImageDocument extends Document 
{
 public ImageDocument(String fileName, double fileSize) {
     super(fileName, fileSize);
 }

 @Override
 public void open() 
 {
     System.out.println("Opening image document: " + fileName);
 }

 @Override
 public void save() 
 {
     System.out.println("Saving image document: " + fileName);
 }

 @Override
 public String getFileType() 
 {
     return "Image";
 }
}



public class DocumentMain
{
 public static void main(String[] args)
 {
     Document pdf = new PDFDocument("resume.pdf", 0.8);
     Document text = new TextDocument("notes.txt", 0.3);
     Document img = new ImageDocument("photo.jpg", 2.5);

     pdf.displayInfo();
     pdf.open();
     pdf.save();

     System.out.println();

     text.displayInfo();
     text.open();
     text.save();

     System.out.println();

     img.displayInfo();
     img.open();
     img.save();
 }
}

