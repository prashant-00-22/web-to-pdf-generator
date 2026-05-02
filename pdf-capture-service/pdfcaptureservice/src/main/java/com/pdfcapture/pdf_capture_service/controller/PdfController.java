package com.pdfcapture.pdf_capture_service.controller;

import com.pdfcapture.pdf_capture_service.service.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // 🔥 ADD THIS
@RestController
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @PostMapping("/generate-pdf")
    public ResponseEntity<byte[]> generatePdf(@RequestBody List<String> images) throws Exception {

        byte[] pdf = pdfService.generatePdf(images);

        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=output.pdf")
                .header("Content-Type", "application/pdf")
                .body(pdf);
    }
}