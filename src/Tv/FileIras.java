package Tv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIras {
    private String filePathAndName;

    public FileIras(String filePathAndName) {
        this.filePathAndName = filePathAndName;
    }

    public void setFilePathAndName(String filePathAndName) {
        this.filePathAndName = filePathAndName;
    }

    public String getFilePathAndName() {
        return filePathAndName;
    }

    public void writeFile(String message) throws IOException {
        try {
            File myObj = new File(filePathAndName);
            if (myObj.createNewFile()) {
                System.out.println("Fajl kesz!: " + myObj.getName());
            } else {
                System.out.println("Fajl mar letezik!");
            }
        } catch (IOException e) {
            System.out.println("Hiba.");
            e.printStackTrace();
        }

        FileWriter file = new FileWriter(filePathAndName, true);
        file.write(String.format("%s\n", message));
        file.close();
    }
}
