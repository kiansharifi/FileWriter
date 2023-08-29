import java.io.IOException;

public class Tester
{
    public static void main (String [] args) throws IOException
    {
        System.out.println (FileWriter.reader ("codeFile"));
        FileWriter.writer ("pleasework", "codeFile");
        System.out.println (FileWriter.reader ("codeFile"));
        System.out.println(FileWriter.charCounter("codeFile"));

    }
}