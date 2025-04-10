package br.com.felipe.file.importer.factory;

import br.com.felipe.exception.BadRequestException;
import br.com.felipe.file.importer.contract.FileImporter;
import br.com.felipe.file.importer.impl.CsvImporter;
import br.com.felipe.file.importer.impl.XlsxImporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FileImporterFactory {

    private Logger logger = LoggerFactory.getLogger(FileImporterFactory.class);

    @Autowired
    private ApplicationContext context;

    public FileImporter getImporter(String fileName) throws Exception{
        if (fileName.endsWith(".xlsx")){
            return context.getBean(XlsxImporter.class);
        } else if (fileName.endsWith(".csv")) {
            return context.getBean(CsvImporter.class);
        }else {
            throw new BadRequestException("Invalid file Format");
        }
    }


}
