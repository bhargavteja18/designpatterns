package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File{

    private List<File> list=new ArrayList<>();

    public void addFile(File file){
        list.add(file);
    }

    @Override
    public String getType() {
        return "Directory";
    }

    @Override
    public int getSize() {
        int size=0;
        for(File f:list)
            size=size+f.getSize();

        return size;
    }
}
