/*ACD_JAVAB_Session_4_Assignment_4_Main : 
 * Print reverse of a given String value. */

package session4;

import java.util.Scanner;

public class ACD_JAVAB_Session_4_Assignment_4_Main 
{
	public static void main(String[] args) 
	{
		String name;
		System.out.print("Enter a String : ");
		Scanner s = new Scanner(System.in);
		name = s.next();
		s.close();
		StringBuffer reverse_name = new StringBuffer(name);
		reverse_name.reverse();
		
		System.out.println("Original String : " + name);
		System.out.println("Reverse String  : " + reverse_name);
	}
}

/* OUTPUT
 
Enter a String : abcdefghijklmnopqrstuvwxyz
Original String : abcdefghijklmnopqrstuvwxyz
Reverse String  : zyxwvutsrqponmlkjihgfedcba

*/

