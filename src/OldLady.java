/***
 * Grading Comments:
 * Excellent job.  Definitely got the idea that you can 
 * reduce the typing and duplication by use of methods
 *  Compiles and runs: 15/15
 *  Output:  6/6
 *  Consistency: 2/2 Clean, well-written, consistent.
 *  Efficiency: 1/2 
 *    You got the main idea.  You can use nesting of
 *    methods within methods to further clean this up
 *    and make it more efficient - you could also use
 *    methods to not have to duplicate the 
 *    'There was an old lady who swallowed a' and
 *    'She swallowed the...' 
 *  Overall, excellent effort 24/25
 */
public class OldLady {

	public static void main(String[] args) {
		fly1();
		fly2();
		spider1();
		spider2();
		fly2();
		bird1();
		bird2();
		spider2();
		fly2();
		cat1();
		cat2();
		bird2();
		spider2();
		fly2();
		dog1();
		dog2();
		cat2();
		bird2();
		spider2();
		fly2();
		horse();
		

	}
	public static void fly1() {
		System.out.println("There was an old lady who swallowed a fly.");
	}
	public static void fly2() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.\n");
	}
	public static void spider1() {
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
	}
	public static void spider2() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void bird1() {
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
	}
	public static void bird2() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void cat1() {
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
	}
	public static void cat2() {
		System.out.println("She swallowed the cat to catch the bird,");	
	}
	public static void dog1() {
		System.out.println("There was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
	}
	public static void dog2() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
	public static void horse() {
		System.out.println("There was an old lady who swallowed a horse.\nShe died of course.");
	}
}


