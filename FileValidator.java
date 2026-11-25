public class FileValidator {
    public static void main(String[] args) {

        String[] fileNames = {
            "student_report.pdf",
            "photo.jpg",
            "notes.docx"
        };

        for (int i = 0; i < fileNames.length; i++) {

            String fileName = fileNames[i];

            if (fileName.endsWith(".pdf")) {
                System.out.println("PDF File");
            } else {
                System.out.println("Different File Format");
            }
        }
    }
}