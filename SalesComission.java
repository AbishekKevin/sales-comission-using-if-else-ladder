import java.io.*;
class SalesComission
{
	public static void main(String args[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			Double sales,c1,c2,c3,c4;
			System.out.println("Enter the Sales - ");
			sales=Double.parseDouble(t.readLine());
			
			if(sales<=10000)
			{
				System.out.println("The Comission -  "+sales);
			}
			else if((sales>=10000)&&(sales<20000))
			{
				c1=(sales/100)*5;
				System.out.println("The Comission - "+c1);
			}
			else if((sales>=20000)&&(sales<50000))
			{
				c2=(sales/100)*10;
				System.out.println("The Comission - "+c2);
			}
			else if((sales>=50000)&&(sales<100000))
			{
				c3=(sales/100)*15;
				System.out.println("The Comission - "+c3);	
			}
			else if(sales>=100000)
			{
				c4=(((sales/100)*20)+500);
				System.out.println("The Comission - "+c4);			
			}
		}		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}










			