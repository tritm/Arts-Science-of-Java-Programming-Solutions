/*File:ThisOldManSong.java
 * ---------------------------------
 * This program features the different rhymes with
 * "The Old Man Song" and the numbers.
 * Using switch.
 */

//imports
import acm.program.*;



public class ThisOldManSong extends DialogProgram {
	
	public void run () {
	
		println("This program displays a version of The Old Man Song"
				+ " according to the number you pick");
		int n = readInt ("Pick an integer from 1 - 10 to know a rhyme of"
				+ " The Old Man Song: ");
		switch (n) {
			case 1: println("This Old Man, he played 1. He played knick-knack"
					+ "on my thumb. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 2: println("This Old Man, he played 2. He played knick-knack"
					+ "on my shoe. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 3: println("This Old Man, he played 3. He played knick-knack"
					+ "on my knee. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 4: println("This Old Man, he played 4. He played knick-knack"
					+ "on my door. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 5: println("This Old Man, he played 5. He played knick-knack"
					+ "on my hive. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 6: println("This Old Man, he played 6. He played knick-knack"
					+ "on my sticks. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 7: println("This Old Man, he played 7. He played knick-knack"
					+ " up to heaven. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 8: println("This Old Man, he played 8. He played knick-knack"
					+ "on my pate. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 9: println("This Old Man, he played 9. He played knick-knack"
					+ "on my spine. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
			case 10: println("This Old Man, he played 10. He played knick-knack"
					+ "on my shin. With a knick knack, paddy whack,"
					+ " give your dog a bone. This Old Man came rolling home."); break;
					
		}
	
	}
}
