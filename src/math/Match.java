package math;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Match {
	public int multiple(int a, int b, int c)
	{
		int result = a*b*c;
		return result;
	}
	
	public static void main(String[] args)
	{
		int a = 10, b = 5, c = 8;
		Match nr = new Match();
		System.out.println(nr.multiple(a, b, c));
	}
	
	
}
