package BrandPack;
import java.util.Comparator;

public class Brand implements Comparator<Brand>{
	
	private int brand_id;
	private String brand_name;
	private int frequency;
	private int brand_cost;
	
	public Brand() {
		
	}

	public Brand(int brand_id, String brand_name, int frequency, int brand_cost) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.frequency = frequency;
		this.brand_cost = brand_cost;
	}
	
	public String toString() {
		
		return brand_id+" "+brand_name+"   "+frequency+"   "+brand_cost;
		
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getBrand_cost() {
		return brand_cost;
	}

	public void setBrand_cost(int brand_cost) {
		this.brand_cost = brand_cost;
	}

	@Override
	public int compare(Brand arg0, Brand arg1) {
		if(arg0.frequency>arg1.frequency) {
			return -1;
		}
		else if(arg0.frequency<arg1.frequency) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	

}
