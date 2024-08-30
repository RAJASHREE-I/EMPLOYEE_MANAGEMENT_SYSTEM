package Model;

public class Stock {
	int pack_id;
	String pack_Name;
	int total;
	public Stock()
	{
		this.pack_id=0;
		this.pack_Name=null;
		this.total=0;
	}
	public Stock(int pack_id,String pack_Name,int total)
	{
		this.pack_id=pack_id;
		this.pack_Name=pack_Name;
		this.total=total;
	}
	public int getPack_id() {
		return pack_id;
	}
	public void setPack_id(int pack_id) {
		this.pack_id = pack_id;
	}
	public String getPack_Name() {
		return pack_Name;
	}
	public void setPack_Name(String pack_Name) {
		this.pack_Name = pack_Name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

}
