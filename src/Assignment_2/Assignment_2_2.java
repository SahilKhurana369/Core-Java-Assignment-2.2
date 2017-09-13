/**
 * 
 */
package Assignment_2;																									// package declaration
/**
 * Write a program to print the following pattern:
 *						a 
 *					  a b a
 *					a b c b a 
 *					  a b a
 *						a
 *
 * All the comments in the program are placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 *
 */
public class Assignment_2_2 {																							// Proper naming conventions is used for Class Declaration
	/**
	 * @author khuranas - Proper camel casing is user to write a program, 
	 *					  and proper variable name like height, space, upperTriangle  
	 *					  lowerTriangle, alphabet .. etc is taken to make the program understandable.	
	 */					  
	public static void main(String[] args) {																			// Main methods Starts
            int height =3;																								// Integers(Variable) height Declaration and assigned a value of 3
            int noOfCharactersInARow = 1;																				// Integers(Variable) noOfCharactersInARow Declaration and assigned a value of 1
            int space = height+1;																						// Integers(Variable) space Declaration and assigned a value height plus 1 i.e 3+1=4	
            char alphabet = 'a';																						// Character(Variable) alphabet Declaration and assigned a character value a
            System.out.println("Pattern is :");																			// This will print out the alphabet in the next line
            for (int upperTriangle = 0; upperTriangle < height; upperTriangle++) {										// for loop started for the construction of the Upper Triangle, initial value assign to upperTriangle variable is 0 and execute till upperTriangle is less then 4 and each time increase the value of upperTriangle by 1 
                for (int printSpace = space; printSpace > 0; printSpace--)												// nested for loop started to print the space in Upper Triangle, initial value assign to printSpace variable is 4 and execute when printSpace is greater then 0 and each time decrease the value of printSpace by 1 
                {																										
                	System.out.print(" ");																				// This will print out the space " " till printSpace is greater then 0	
                }																										// nested for loop closed to print the space in Upper Triangle
                space--;																								// Stored the value of space variable and decrement by 1																				
                
                for (int printAlphabet = 0; printAlphabet < noOfCharactersInARow; printAlphabet++) {					// nested for loop started to print the printAlphabet 'a' in Upper Triangle, initial value assign to printAlphabet variable is 0 and execute till printAlphabet is less then 1 and each time increase the value of printAlphabet by 1
                    System.out.print(alphabet);																			// This will print out the alphabet .... according to the if else condition in below loop 	
                    if (printAlphabet < noOfCharactersInARow / 2) {														// if loop to print out the alphabet, remember the initial value of printAlphabet is zero, if printAlphabet is less then noOfCharactersInARow/2 ie 1/2=.5 now printAlphabet is integer it will store 0 
                        alphabet++;																						// alphabet will increment 
                    } else {																							// else alphabet will decrement	
                        alphabet--;
                    }
                }																										// nested for loop closed	
                noOfCharactersInARow = noOfCharactersInARow + 2;														// now the value in noOfCharactersInARow is 5+2 .. can check by using System.out.print("noOfCharactersInARow "+noOfCharactersInARow); at the end of the for loop of Upper Triangle
                alphabet = 'a';																							// Variable alphabet Declaration and assigned a character value a inside the Upper Triangle for loop
                System.out.println();																					// This will print out the alphabet in the next line
            }																											// for loop closed for the Upper Triangle
																														// can verify the value of noOfCharactersInARow by using System.out.print("noOfCharactersInARow "+noOfCharactersInARow); now noOfCharactersInARow = 7
			space = height;																								// Variable space Declaration and assigned a value equal to height i.e 3
            alphabet = 'a';																								// Variable alphabet Declaration and assigned a character value a
            for (int lowerTriangle = 0; lowerTriangle < height; lowerTriangle++) {										// for loop started for the construction of the lower Triangle, initial value assign to upperTriangle variable is 0 and execute till upperTriangle is less then 3 and each time increase the value of upperTriangle by 1 
                for (int printSpace = space; printSpace > 0; printSpace--)												// nested for loop started to print the space in lower Triangle, initial value assign to printSpace variable is 3 and execute when printSpace is greater then 0 and each time decrease the value of printSpace by 1 
                {
                    System.out.print(" ");																				// This will print out the space " " till printSpace is greater then 0
                }																										// nested for loop closed to print the space in Lower Triangle
                space++;																								// Stored the value of space variable and increment by 1
                
				for (int printAlphabet = 0; printAlphabet < (noOfCharactersInARow -space); printAlphabet++)	{			// nested for loop started to print the printAlphabet 'a' in Lower Triangle, initial value assign to printAlphabet variable is 0 and execute till printAlphabet is less then (noOfCharactersInARow -space) i.e 7-3=4 and each time increase the value of printAlphabet by 1
				  System.out.print(alphabet);																			// This will print out the alphabet .... according to the if else condition in below loop
                    if (printAlphabet < noOfCharactersInARow/4) {														// if loop to print out the alphabet, remember the initial value of printAlphabet is zero, if printAlphabet is less then noOfCharactersInARow/4 ie 7/4=1.75 but as noOfCharactersInARow is interger it will stornow zero is less then 1 then
                        alphabet++;																						// alphabet will increment
                    } else {																							// else alphabet will decrement	
                        alphabet--;
                    }
                }																										// nested for loop closed
                noOfCharactersInARow = noOfCharactersInARow-1;															// now the value in noOfCharactersInARow is 7-1=6
                alphabet = 'a';																							// Variable alphabet Declaration and assigned a character value a inside the Lower Triangle for loop
                System.out.println();																					// This will print out the alphabet in the next line
            }																											// for loop closed for the Lower Triangle
       }																												// Main methods Closed
 }																														// class Assignment_2_2 closed
