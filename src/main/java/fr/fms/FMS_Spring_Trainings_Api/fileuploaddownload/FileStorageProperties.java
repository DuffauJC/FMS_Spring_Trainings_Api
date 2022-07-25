package fr.fms.FMS_Spring_Trainings_Api.fileuploaddownload;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public FileStorageProperties(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
