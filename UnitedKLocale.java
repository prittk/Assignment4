import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
//https://www.geeksforgeeks.org/numberformat-class-java/

//Assignment 4 Number 3
//This assignment helps teach about the locale method and how it converts numbers
//Here we test it by converting a numebr to a country default UK, number in US currency, and parse astring into that number
public class UnitedKLocale {
	
	public static void main(String[] args)
	{
		Locale current = Locale.getDefault();
		Double number = 12345.678;
		String toConvert ="12,345.678";
		
		
		System.out.println("Locale name: "+current);
		
		System.out.println("Number in US "+number);
		System.out.print("Number in UK ");
		numberFormater(number, Locale.UK);
		
		System.out.print("Number in currency of US");
		currencyConverter(number, Locale.US);
		
		System.out.println("Number to parse "+toConvert);
		
			stringToNumber(toConvert, Locale.US);
		
	}
	//Convert a number to a country passed
	public static void numberFormater(double number, Locale country)
	{
		NumberFormat nf = NumberFormat.getInstance(country);
		nf.setMaximumFractionDigits(2);
		System.out.printf(" "+nf.format(number)+"\n");
	}
	//Convert number into currency of country passed
	public static void currencyConverter(double number, Locale country)
	{
		NumberFormat nf = NumberFormat.getInstance(country);
		
		System.out.print(" "+nf.getCurrencyInstance(country).format(number)+"\n");
		
	}
	//https://stackoverflow.com/questions/23990805/converting-different-countrys-currency-to-double-using-java
	//https://sentry.io/answers/how-do-i-convert-a-string-to-an-int-in-java/#:~:text=The%20two%20easiest%20ways%20to,()%20or%20Integer.valueOf()%20.
	//Convert a string to Number
	public static void stringToNumber(String string, Locale country) 
	{
	try {
		NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
																					//Removes any . , and whitespace in number
		System.out.println("Number parsed to US "+format.parse(string.replaceAll("[^\\d.,]","")));
	
	}
	catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
