package com.pdfcapture.pdf_capture_service.service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.List;

@Service
public class PdfService {

    public byte[] generatePdf(List<String> imagesBase64) throws Exception {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, outputStream);
        document.open();

        for (String base64 : imagesBase64) {

            byte[] imageBytes = Base64.getDecoder().decode(base64.split(",")[1]);

            Image img = Image.getInstance(imageBytes);

            // 🔥 fit into page (no cut)
            img.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
            img.setAlignment(Image.ALIGN_CENTER);

            document.add(img);
            document.newPage();
        }

        document.close();
        return outputStream.toByteArray();
    }
}