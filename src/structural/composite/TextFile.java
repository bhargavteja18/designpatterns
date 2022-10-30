package structural.composite;

public class TextFile implements  File{

    private int size;

    public TextFile(int size){
        this.size=size;
    }

    @Override
    public String getType() {
        return "File";
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
