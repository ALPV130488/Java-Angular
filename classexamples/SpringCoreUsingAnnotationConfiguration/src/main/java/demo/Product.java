package demo;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	
	private int proId;
	
	private String proName;
	
	private int proPrice;
	
	private String proType;
	
	

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int proId, String proName, int proPrice, String proType) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proType = proType;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + ", proType=" + proType
				+ "]";
	}
	
	

}
