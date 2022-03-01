package ReadText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        var path = "C:\\Users\\pavan\\Desktop\\StudentList.txt";
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;
        long count = Files.lines(Paths.get(path)).filter(l -> l.length() > 0).count();
        while((line = reader.readLine()) != null){
            sb.append(line+" ");
            String[] names = line.split(" ");
        }
        System.out.println("Names = "+sb);
        System.out.println("Count = "+count);
    }
}
