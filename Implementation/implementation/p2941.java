package implementation;
import java.util.*;
import java.io.*;
public class p2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String origin = str;
		ArrayList<String> croatia_alpha  = new ArrayList<>();
		croatia_alpha.add("c=");
		croatia_alpha.add("c-");
		croatia_alpha.add("dz=");
		croatia_alpha.add("d-");
		croatia_alpha.add("lj");
		croatia_alpha.add("nj");
		croatia_alpha.add("s=");
		croatia_alpha.add("z=");
		
		int count=0;
		int dz =0;
		for(int j=0; j<croatia_alpha.size(); j++) {
			if(str.contains(croatia_alpha.get(j))) {
				str= str.replace(croatia_alpha.get(j), "#");
			}
		}
		count = str.length();
		System.out.print(count);		
	}

}
