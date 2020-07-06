package pk12;

public class CharArray1 {
public static void main(String[] args) {
	
	char[] alpahabets = new char[26];
	char ch = 'A';
	//65 1000001 1000010 100011 1000100|
	
	System.out.println(ch);
	for(int i = 0; i<alpahabets.length; i++, ch++) {
		alpahabets[i] = ch;
	}
	for(int i = 0; i<alpahabets.length; i++) {
		System.out.println(alpahabets[i]+","+(int)alpahabets[i]);
	}
}
}
