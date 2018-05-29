package webapplication1.SeleniumPratice;

public class Sample1 {

	public static void main(String args[]) {
		String str = "Role:100,width:159,height:200,feature: ";
		String str1 = "jj";
		String[] s1 = str.split(",");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			String s2 = s1[i].split(":")[1].trim();
			if (s2 != null && !s2.isEmpty()) {
				if (s2 != "" && !s2.isEmpty()) {
					System.out.println(s1[i].split(":")[1]);
					System.out.println("pass");
				} else {
					System.out.println("Fail");
				}
			}
		}
	}
}
