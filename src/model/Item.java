
package model;

public class Item implements IItem{
	
	private int id;
	private int customerId;
	private String name;
	private String description;
	private float rent;
	
	public Item()
	{
		id = -1;
		customerId = -1;
		name = null;
		description = null;
		rent = 0.0f;
	}
	
	public Item(int id, int customerId, String name, String desc, float rent)
	{
		this.id = id;
		this.customerId = customerId;
		this.name = name;
		this.description = desc;
		this.rent = rent;
	}
	
	public Item(int id, int customerId, String name, float rent)
	{
		this.id = id;
		this.customerId = customerId;
		this.name = name;
		this.rent = rent;
	}
	
	
	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public void setRent(float rent) {
		// TODO Auto-generated method stub
		this.rent = rent;
	}

	@Override
	public float getRent() {
		// TODO Auto-generated method stub
		return this.rent;
	}
	
	public int getItemId()
	{
		return this.id;
	}

	@Override
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public int getCustomerId() {
		return this.customerId;
	}

}
