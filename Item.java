class Item {
	int id;
	String name;
	double price;
	char ddv;
	
	Item(){}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	double getPrice()
	{
		return price;
	}
	char getDdv()
	{
		return ddv;
	}
	void setId(int i)
	{
		id = i;
	}
	void setName(String n)
	{
		name = n;
	}
	void setPrice(double p)
	{
		price = p;
	}
	void setDdv(char c)
	{
		ddv = c;
	}
	
	double taxReturn () {
		int x = 0;
		if(ddv == 'A')
		{
			x = 18;
		}
		else if(ddv == 'B')
		{
			x = 5;
		}
		else
			x = 0;
		return double(x) * 15 / 100;
	}
}