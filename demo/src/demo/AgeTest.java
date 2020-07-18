 package demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class AgeTest 
{
	private int input;
	private String output;
	private Age age;
	public AgeTest(int input,String output)
	{
		this.input=input;
		this.output=output;
	}
	Age a;
	@Before
	public void init()
	{
		a=new Age();
		
	}
	@Parameterized.Parameters
	public static Collection ageCheck()
	{
		return Arrays.asList(new Object[][]
				{
			{14,"not eligible"},
			{20,"eligible"}
		});
	}
	
		@Test
		public void addtest()
		{
			assertEquals(output,a.election(input));
		}

	
}
