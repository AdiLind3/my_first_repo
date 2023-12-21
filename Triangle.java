public class Triangle {
	public static void main(String[] args)
	{
	int a,b,c;
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	c = Integer.parseInt(args[2]);
	if((a+b)>=c && (a+c) >= b && (b+c)>= a)
	{
		System.out.println( a + ", " + b + ", " + c +": true");
	}
	else 
	{
		System.out.println( a + ", " + b + ", " + c +": false");
	}
}
}
