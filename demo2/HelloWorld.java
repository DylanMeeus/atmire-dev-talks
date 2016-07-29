class HelloWorld
{

    // No constructor
    String printThis;
    public HelloWorld()
    {
	printThis = "Hello World";
	test();
	System.out.println(this);
    }
    public void test()
    {
	System.out.println("Hello World");
    }

    public String toString()
    {
	return printThis;
    }

}

