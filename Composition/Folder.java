package Composition;

import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<Folder> subfolders;
    private ArrayList<File> files;

    public Folder(String folderName){
        this.folderName = folderName;
        subfolders = new ArrayList<Folder>();
        files = new ArrayList<File>();
    }

    public void printFolderInfo(String indentation){
        System.out.printf("%sFolder: %s%n", indentation, folderName);
        indentation += "     ";
        for(Folder fo: subfolders){
            fo.printFolderInfo(indentation);
        }
        for(File fi: files){
            fi.fileInfo(indentation);
        }
    }

    public void deleteFolder(Folder folder){
        String childFolderName = folder.getFolderName();
        subfolders.remove(folder);
        System.out.printf("%nWe have successfully deleted the '%s' folder!%n", childFolderName);
    }

    public void deleteFile(File file){
        files.remove(file);
    }

    public void addSubfolder(Folder folder){
        subfolders.add(folder);
    }

    public void addFile(String fileName){
        files.add(new File(fileName, this));
    }

    public String getFolderName() {
        return folderName;
    }

    public ArrayList<Folder> getSubfolders() {
        return subfolders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setSubfolders(ArrayList<Folder> subfolders) {
        this.subfolders = subfolders;
    }

    public void setFiles(ArrayList<File> file) {
        this.files = files;
    }
}
