package xworkz.com;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public  class WeaponDTO implements Comparable<WeaponDTO>{

	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price ;
	private WeaponType type; 
	
	public WeaponDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
@Override
public int compareTo(WeaponDTO dto){
	return dto.name.compareTo(this.name);
}
	
	
	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + ((madeBy == null) ? 0 : madeBy.hashCode());
		result = prime * result + ((madeOn == null) ? 0 : madeOn.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		*/return 12;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto = (WeaponDTO)obj;
				if(this.name.equals(dto.name)) {
					return true;
				}
				if(this.madeBy.equals(dto.madeBy)) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}
	
	/*@Override
	public int compare(WeaponDTO dto1,WeaponDTO dto2){
		return dto1.name.compareTo(dto2.name);
	}
*/
	

}