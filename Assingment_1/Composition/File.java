package Composition;

public class File {
    private String fileName;
    private Folder parentFolder;
    public File(String fileName, Folder parentFolder){
        this.fileName = fileName;
        this.parentFolder = parentFolder;
    }

    public void fileInfo(String indentation){
        System.out.printf("%sFile: %s%n", indentation, fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
