//Cayce Zeng
//12-6-24
//Punctuation.java
/* This class returns all the words adjacent to punctuation in a given String
 *
 * Pseudocode:
 * 
 * class header
 * 		main header
 * 			create instance of Punctuation
 * 			call searchIt
 * 		searchIt
 * 			print 3 blank lines
 * 			D&I text to the big long text
 * 			D&I words to getPunctuationWords(text)
 * 			call printWords(words)
 * 			print 3 blank lines
 * 		getPunctuationWords(text)
 * 			D&I start to 0
 * 			D&I end to -1
 * 			D&I punctuationWords to empty string
 * 			D&I words to empty string
 * 			for loop (length of the text)
 * 				check if the index of text is a space
 * 					end is the index that is a space
 * 					set word to the substring of text (start, end)
 * 					add word to punctuationWords
 * 					set start to end
 * 			return punctuationWords
 * 		checkForPunctuation(text)
 * 			D&I boolean punctuation to false
 * 			D&I index to 0
 * 			D&I possiblePunctuation to a string of all the punctuation checked
 * 			while punctuation is false and the index is less than the length of the word
 * 				use a for loop to go through all the characters in the punctuation string
 * 					if the character checked is equal to the current punctuation
 * 						punctuation = true
 * 				increment index
 * 			if punctuation is true
 * 				return word
 * 			else
 * 				return empty string
 *		printWords(words)
 * 			print the words
 */

public class Punctuation		//class header
{
	public static void main(String[] args)		//main header
	{
		Punctuation p = new Punctuation();		//create instance of this class
		p.searchIt();		//call searchIt()
	}
	
	public void searchIt()		//method header
	{
		System.out.print("\n\n\n");		//print starting three blank lines
		//D&I text to whatever text you need to check
		String text = "Blood, Sweat, and Tears by Winston Churchill " + 
		"May 13, 1940 " + 
		"Mr. Speaker:" + 
		"On Friday evening last I received His Majesty's commission to form a new " + 
		"Administration. It was the evident wish and will of Parliament " + 
		"and the nation that this should be conceived on the broadest " + 
		"possible basis and that it should include all parties, both those " +
		"who supported the late Government and also the parties of the Opposition." +
		"I have completed the most important part of this task. A War " + 
		"Cabinet has been formed of five Members, representing, with the " + 
		"Liberal Opposition, the unity of the nation. The three party " + 
		"Leaders have agreed to serve, either in the War Cabinet or in " + 
		"high executive office. The three Fighting Services have been " + 
		"filled. It was necessary that this should be done in one single " +
		"day, on account of the extreme urgency and rigour of events. " + 
		"A number of other key positions were filled yesterday, and I am " + 
		"submitting a further list to His Majesty tonight. I hope to " +
		"complete the appointment of the principal Ministers during " +
		"tomorrow. The appointment of the other Ministers usually takes " +
		"a little longer, but I trust that, when Parliament meets again, " + 
		"this part of my task will be completed, and that the " +
		"Administration will be complete in all respects." +
		"Sir, I considered it in the public interest to suggest that the " +
		"House should be summoned to meet today. Mr. Speaker agreed and " +
		"took the necessary steps, in accordance with the powers " +
		"conferred upon him by the Resolution of the House. At the end " +
		"of the proceedings today, the Adjournment of the House will be " +
		"proposed until Tuesday, the 21st May, with, of course, " +
		"provision for earlier meeting, if need be. The business to be " +
		"considered during that week will be notified to Members at the " +
		"earliest opportunity. I now invite the House, by the Resolution " + 
		"which stands in my name, to record its approval of the steps " + 
		"taken and to declare its confidence in the new Government." +
		"Sir, to form an Administration of this scale and complexity is " +
		"a serious undertaking in itself, but it must be remembered that " +
		"we are in the preliminary stage of one of the greatest battles in " +
		"history, that we are in action at many points in Norway and in " +
		"Holland, that we have to be prepared in the Mediterranean, that " +
		"the air battle is continuous and that many preparations have to " +
		"be made here at home. In this crisis I hope I may be pardoned " +
		"if I do not address the House at any length today. I hope that any " +
		"of my friends and colleagues, or former colleagues, who are " +
		"affected by the political reconstruction, will make all allowances " +
		"for any lack of ceremony with which it has been necessary to act. I " +
		"would say to the House, as I said to those who’ve joined this " +
		"government: \"I have nothing to offer but blood, toil, tears and sweat.\"" +
		"We have before us an ordeal of the most grievous kind. We have " + 
		"before us many, many long months of struggle and of suffering. " +
		"You ask, what is our policy? I will say: It is to wage war, by " +
		"sea, land and air, with all our might and with all the strength " +
		"that God can give us; to wage war against a monstrous tyranny, " +
		"never surpassed in the dark and lamentable catalogue of human crime. " +
		"That is our policy. You ask, what is our aim? I can answer in one " +
		"word: victory. Victory at all costs, victory in spite of all terror, " +
		"victory, however long and hard the road may be; for without victory, " +
		"there is no survival. Let that be realised; no survival for the " +
		"British Empire, no survival for all that the British Empire has " +
		"stood for, no survival for the urge and impulse of the ages, that " +
		"mankind will move forward towards its goal. " + "But I take up my " +
		"task with buoyancy and hope. I feel sure that our cause will not " +
		"be suffered to fail among men. At this time I feel entitled to " +
		"claim the aid of all, and I say, \"Come then, let us go forward " +
		"together with our united strength.\"" + " ";
		
		//D&I words to the words that need to be printed
		String words = getPunctuationWords(text);
		printWords(words);		//print the words
		System.out.println("\n\n\n");		//print ending three blank lines
	}
	
	public String getPunctuationWords(String text)		//method header
	{
		int start = 0;		//D&I start index to 0
		int end = -1;		//D&I end to -1
		String punctuationWords = "";		//D&I punctuationWords to an empty string
		String word = "";		//D&I word to an empty string
		//for loop iterates through every character in the text
		for (int i = 0; i<text.length(); i++)
		{
			if (text.charAt(i) == ' ')		//if the character is the space
			{
				end = i;		//set the end index to i
				//word is the substring between the start and end indices
				word = text.substring(start, end);
				
				//add the word to the words needed to print out
				punctuationWords = punctuationWords + checkForPunctuation(word);
				start = end;		//the end is the new start
			}
		}
		return punctuationWords;		//return the words needed to be printed out
	}
	
	public String checkForPunctuation(String word)	//method header
	{
		boolean punctuation = false;		//D&I punctuation to false
		int index = 0;		//D&I integer index to 0
		//D&I possiblePunctuation to a string of all 
		//the punctuation needed to be checked
		String possiblePunctuation = ".,;:!?'\"()-";
		
		//while there is not punctuation or the word is done parsing
		while ((!punctuation)&&(index < word.length()))
		{
			//going through all the characters in the possiblePunctuation string
			for (int i = 0; i<possiblePunctuation.length(); i++)
			{
				//if the character is a punctuation
				if (word.charAt(index) == possiblePunctuation.charAt(i))
					punctuation = true;	//set punctuation to true
			}
			index++;	//increment index
		}
		if (punctuation)		//if punctuation is true
			return word;		//return the word
		else 	//if not
			return "";		//return empty string
	}
	
	public void printWords(String words)		//method header
	{
		System.out.print(words);		//print the words
	}
}
					
		
		
