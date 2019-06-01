package com.sss.interfaces.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    int FileUpload(MultipartFile file);
    ResponseEntity<byte[]> FileDownload(String filename);
}
