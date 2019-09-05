interface surya{
	public void takeName(String name);
	public String getName();
}


class runner100
{
	public static void main(String[] args) {
		surya obj=new surya()
		{
			String name;
			public void takeName(String name)
			{
				this.name=name;
			}
			public String getName()
			{
				return name;
			}

		};
		obj.takeName("surya");
		System.out.println(obj.getName());
	}
}