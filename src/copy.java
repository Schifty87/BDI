import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class copy {
	
	static void copyFileUsingJava7Files(File source, File dest)
	        throws IOException {
	    Files.copy(source.toPath(), dest.toPath());
	}
}
