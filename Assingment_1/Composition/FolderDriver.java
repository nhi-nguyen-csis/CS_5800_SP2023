package Composition;

public class FolderDriver {

    public static void run() {
        // Create the root folder
        Folder rootFolder = new Folder("php demo 1");

        // create subfolders in the root folder
        Folder[] rootSubfolders = new Folder[3];
        rootSubfolders[0] = new Folder("Source Files");
        rootSubfolders[1] = new Folder("Include Path");
        rootSubfolders[2] = new Folder("Remote Files");
        addSubfolder(rootFolder, rootSubfolders);

        // add subfolders in the sourceFiles folder
        Folder sourceFolder = rootSubfolders[0];
        Folder[] sourceSubfolder = new Folder[4];
        sourceSubfolder[0] = new Folder(".phalcon");
        sourceSubfolder[1] = new Folder("app");
        sourceSubfolder[2] = new Folder("cache");
        sourceSubfolder[3] = new Folder("public");
        addSubfolder(sourceFolder, sourceSubfolder);

        // add subfolders in the app folder
        Folder appFolder = sourceSubfolder[1];
        Folder[] appSubfolder = new Folder[6];
        appSubfolder[0] = new Folder("config");
        appSubfolder[1] = new Folder("controllers");
        appSubfolder[2] = new Folder("library");
        appSubfolder[3] = new Folder("migrations");
        appSubfolder[4] = new Folder("models");
        appSubfolder[5] = new Folder("views");
        addSubfolder(appFolder, appSubfolder);

        // add files in the public folder
        Folder publicFolder = sourceSubfolder[3];
        publicFolder.addFile(".htaccess");
        publicFolder.addFile(".htrouter.php");
        publicFolder.addFile("index.html");

        // print the whole folder structure
        rootFolder.printFolderInfo("");

        //-------------- DELETE APP FOLDER --------------
        deleteFolder(rootFolder, sourceFolder, appFolder);

        // -------------- DELETE PUBLIC FOLDER --------------
        deleteFolder(rootFolder, sourceFolder, publicFolder);
    }

    public static void deleteFolder(Folder rootFolder, Folder parentFolder, Folder childFolder){
        parentFolder.deleteFolder(childFolder);
        // print the full structure after deleting
        System.out.println("-------------- FULL FOLDER STRUCTURE AFTER DELETING --------------");
        rootFolder.printFolderInfo("");
    }
    public static void addSubfolder(Folder parentFolder, Folder[] childFolders ){
        for(int i = 0; i < childFolders.length; i++){
            parentFolder.addSubfolder(childFolders[i]);
        }
    }
}
