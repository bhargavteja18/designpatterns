package structural.composite;

public class Main {

    public static void main(String[] args) {

        File f=new TextFile(3);

        System.out.println(f.getType());

        Directory d=new Directory();
        System.out.println(d.getType());
        d.addFile(f);
        System.out.println(d.getSize());
    }
}
