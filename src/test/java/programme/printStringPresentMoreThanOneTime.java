package programme;
import java.util.LinkedHashSet;

public class printStringPresentMoreThanOneTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java has java has java king";
				
		String[] sh=s.split(" ");
		int count=0;
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (int i = 0; i < sh.length; i++) {
			hs.add(sh[i]);
		}
		for (String x : hs) {
			for (int i = 0; i < sh.length; i++) {
				if(x.equalsIgnoreCase(sh[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(x+" ="+count);
				count=0;
			}
		}
	}

}
