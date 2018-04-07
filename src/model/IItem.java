
package model;

public interface IItem {
	public void setName(String name);
	public String getName();
	
	public void setDescription(String description);
	public String getDescription();
	
	public void setRent(float rent);
	public float getRent();
	
	public void setCustomerId(int customerId);
	public int getCustomerId();
}