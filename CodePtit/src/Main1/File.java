package Main1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class File {
	public static void main(String[] args) throws IOException {
		String url ="Hello.txt";
		String content = new String(Files.readAllBytes(Paths.get(url)),
		        StandardCharsets.UTF_8);
		System.out.println(content);
	}
}
