public class PDFReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        return new PDFReport(); 
    }
    
}
